
using System.Globalization;
using System.Text;
using analyzer;

public class CompilerVisitor : LanguageBaseVisitor<ValueWrapper>
{

    public string output = "";
    private Environment currentEnvironment = new Environment(null);
    private ValueWrapper defaultVoid = new VoidValue();
    
    public override ValueWrapper VisitProgram(LanguageParser.ProgramContext context)
    {
        foreach (var dcl in context.declaraciones())
        {
            Visit(dcl);
        }
        return defaultVoid;

    }

   
    public override ValueWrapper VisitDeclaracionVariableConValor(LanguageParser.DeclaracionVariableConValorContext context)
    {
        string id = context.ID().GetText();
        string tipo = context.tipo().GetText(); 
        ValueWrapper value = Visit(context.expr()); 

        if (!TipoCoincide(tipo, value))
        {
            throw new Exception($"Error: No se puede asignar un valor de tipo {value.GetType()} a la variable '{id}' de tipo {tipo}.");
        }

        currentEnvironment.DeclaracionVariable(id, value);
        return defaultVoid;
    }

    public override ValueWrapper VisitDeclaracionVariableSinValor(LanguageParser.DeclaracionVariableSinValorContext context)
    {
        string id = context.ID().GetText();
        string tipo = context.tipo().GetText();
        ValueWrapper value;
        switch (tipo) {
            case "int":
                currentEnvironment.DeclaracionVariable(id, new EnteroValue(0));
                break;
            case "float64":
                currentEnvironment.DeclaracionVariable(id, new FloatValue(0.0f));
                break;
            case "bool":
                currentEnvironment.DeclaracionVariable(id, new BooleanValue(false));
                break;
            case "rune":
                currentEnvironment.DeclaracionVariable(id, new RuneValue(0));
                break;
            case "string":
                currentEnvironment.DeclaracionVariable(id, new StringValue(""));
                break;
            default:
                break;
        }
        return defaultVoid;
    }


    public override ValueWrapper VisitDeclaracionImplicita(LanguageParser.DeclaracionImplicitaContext context)
{
    string id = context.ID().GetText();
    ValueWrapper value = Visit(context.expr());

    switch (value)
    {
        case EnteroValue:
            currentEnvironment.DeclaracionVariable(id,value); 
            break;

        default:
            throw new Exception("Invalid operation");
    }

    return defaultVoid; 
}

    private bool TipoCoincide(string tipoDeclarado, ValueWrapper valor)
    {
        return tipoDeclarado switch
        {
            "int" => valor is EnteroValue,
            "float64" => valor is FloatValue,
            "string" => valor is StringValue,
            "bool" => valor is BooleanValue,
            "rune" => valor is RuneValue,
            _ => false // Tipo desconocido
        };
    }


    // VisitExprStmt
    public override ValueWrapper VisitExpresion(LanguageParser.ExpresionContext context)
    {
        return Visit(context.expr());
    }

    // VisitPrintStmt
    public override ValueWrapper VisitFmtPrint(LanguageParser.FmtPrintContext context)
{
    ValueWrapper value = Visit(context.expr());
    output += value switch
    {
        EnteroValue a => a.Value.ToString(),
        FloatValue b => b.Value.ToString("G7", CultureInfo.InvariantCulture), 
        StringValue c => c.Value,
        BooleanValue d => d.Value.ToString(),
        RuneValue e => e.Value.ToString(),
        VoidValue v => "Trying to print a Void Value",
        _ => $"[Tipo desconocido: {value.GetType().Name}]"
    };
    output += "\n";

    return defaultVoid;
}


    public override ValueWrapper VisitAsignacion(LanguageParser.AsignacionContext context)
    {
        string id = context.ID().GetText();
        ValueWrapper value = Visit(context.expr());
        return currentEnvironment.AsignacionVariable(id, value);
    }

    // VisitIdentifier
    public override ValueWrapper VisitId(LanguageParser.IdContext context)
    {
        string id = context.ID().GetText();
        return currentEnvironment.GetVariable(id);
    }
    

    // VisitParens
    public override ValueWrapper VisitParentesis(LanguageParser.ParentesisContext context)
    {
        return Visit(context.expr());
    }

    // VisitNegate
    public override ValueWrapper VisitNegacion(LanguageParser.NegacionContext context)
    {
        ValueWrapper value = Visit(context.expr());
        return value switch
        {
            EnteroValue i => new EnteroValue(-i.Value),
            FloatValue f => new FloatValue(-f.Value),
            _ => throw new Exception("Invalid operation")
        };

        
    }

    // VisitNumber
    public override ValueWrapper VisitEntero(LanguageParser.EnteroContext context)
    {
        //return int.Parse(context.GetText());
        return new EnteroValue(int.Parse(context.INT().GetText()));
    }
    public override ValueWrapper VisitFloat(LanguageParser.FloatContext context)
    {
        //return int.Parse(context.GetText());
        return new FloatValue(float.Parse(context.FLOAT().GetText()));
    }
    public override ValueWrapper VisitRune(LanguageParser.RuneContext context)
    {
        string rawText = context.GetText(); 
    
        if (rawText.Length != 3 || rawText[0] != '\'' || rawText[2] != '\'')
        {
            throw new Exception($"Error: Rune mal formado: {rawText}");
        }

        char runeChar = rawText[1]; // Obtiene solo el carácter dentro de las comillas

            return new RuneValue((uint)runeChar);// Lo almacena como uint (Unicode)    
    }
    public override ValueWrapper VisitBoolean(LanguageParser.BooleanContext context)
    {
        //return int.Parse(context.GetText());
        return new BooleanValue(bool.Parse(context.BOOL().GetText()));
    }
    public override ValueWrapper VisitString(LanguageParser.StringContext context)
    {
        //return int.Parse(context.GetText());
        return new StringValue(context.STRING().GetText());
    }

    
    
    public override ValueWrapper VisitMulDivMod(LanguageParser.MulDivModContext context)
    {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));
        var op = context.op.Text;

        return (left, right, op) switch
        {
            (EnteroValue l, EnteroValue r, "*") => new EnteroValue(l.Value * r.Value),
            (EnteroValue l, EnteroValue r, "/") => new EnteroValue(l.Value / r.Value),
            (EnteroValue l, EnteroValue r, "%") => new EnteroValue(l.Value % r.Value),

            (FloatValue l, FloatValue r, "*") => new FloatValue(l.Value * r.Value),
            (FloatValue l, FloatValue r, "/") => new FloatValue(l.Value / r.Value),

            (EnteroValue l, FloatValue r, "*") => new FloatValue(l.Value * r.Value),
            (EnteroValue l, FloatValue r, "/") => new FloatValue(l.Value / r.Value),

            (FloatValue l, EnteroValue r, "*") => new FloatValue(l.Value * r.Value),
            (FloatValue l, EnteroValue r, "/") => new FloatValue(l.Value / r.Value),
            _ => throw new Exception("Invalid operation")
        };
    }

    // VisitAddSub
    public override ValueWrapper VisitSumRes(LanguageParser.SumResContext context)
    {
        ValueWrapper left = Visit(context.GetChild(0));
        ValueWrapper right = Visit(context.expr(1));
        var op = context.op.Text;

        return (left, right, op) switch
        {
            (EnteroValue l, EnteroValue r, "+") => new EnteroValue(l.Value + r.Value),
            (EnteroValue l, EnteroValue r, "-") => new EnteroValue(l.Value - r.Value),

            (FloatValue l, FloatValue r, "+") => new FloatValue(l.Value + r.Value),
            (FloatValue l, FloatValue r, "-") => new FloatValue(l.Value - r.Value),

            (StringValue l, StringValue r, "+") => new StringValue(l.Value + r.Value),
            (EnteroValue l, StringValue r, "+") => new StringValue(l.Value.ToString() + r.Value),
            (StringValue l, EnteroValue r, "+") => new StringValue(l.Value + r.Value.ToString()),

            (EnteroValue l, FloatValue r, "+") => new FloatValue(l.Value + r.Value),
            (EnteroValue l, FloatValue r, "-") => new FloatValue(l.Value - r.Value),

            (FloatValue l, EnteroValue r, "+") => new FloatValue(l.Value + r.Value),
            (FloatValue l, EnteroValue r, "-") => new FloatValue(l.Value - r.Value),
            _ => throw new Exception("Invalid operation")
        };
    }

    public override ValueWrapper VisitRelacionales(LanguageParser.RelacionalesContext context)
    {
        ValueWrapper left = Visit(context.GetChild(0));
        ValueWrapper right = Visit(context.expr(1));
        var op = context.op.Text;

        return (left, right, op) switch
        {
            (EnteroValue l, EnteroValue r, ">") => new BooleanValue(l.Value > r.Value),
            (EnteroValue l, EnteroValue r, ">=") => new BooleanValue(l.Value >= r.Value),
            (EnteroValue l, EnteroValue r, "<") => new BooleanValue(l.Value < r.Value),
            (EnteroValue l, EnteroValue r, "<=") => new BooleanValue(l.Value <= r.Value),
            
            (FloatValue l, FloatValue r, ">") => new BooleanValue(l.Value > r.Value),
            (FloatValue l, FloatValue r, ">=") => new BooleanValue(l.Value >= r.Value),
            (FloatValue l, FloatValue r, "<") => new BooleanValue(l.Value < r.Value),
            (FloatValue l, FloatValue r, "<=") => new BooleanValue(l.Value <= r.Value),

            (FloatValue l, EnteroValue r, ">") => new BooleanValue(l.Value > r.Value),
            (FloatValue l, EnteroValue r, ">=") => new BooleanValue(l.Value >= r.Value),
            (FloatValue l, EnteroValue r, "<") => new BooleanValue(l.Value < r.Value),
            (FloatValue l, EnteroValue r, "<=") => new BooleanValue(l.Value <= r.Value),

            (EnteroValue l, FloatValue r, ">") => new BooleanValue(l.Value > r.Value),
            (EnteroValue l, FloatValue r, ">=") => new BooleanValue(l.Value >= r.Value),
            (EnteroValue l, FloatValue r, "<") => new BooleanValue(l.Value < r.Value),
            (EnteroValue l, FloatValue r, "<=") => new BooleanValue(l.Value <= r.Value),

            (RuneValue l, RuneValue r, ">") => new BooleanValue(l.Value > r.Value),
            (RuneValue l, RuneValue r, ">=") => new BooleanValue(l.Value >= r.Value),
            (RuneValue l, RuneValue r, "<") => new BooleanValue(l.Value < r.Value),
            (RuneValue l, RuneValue r, "<=") => new BooleanValue(l.Value <= r.Value),

            
            _ => throw new Exception("Invalid operation")
        };
    }

    public override ValueWrapper VisitIgualdad(LanguageParser.IgualdadContext context)
    {
        ValueWrapper left = Visit(context.GetChild(0));
        ValueWrapper right = Visit(context.expr(1));
        var op = context.op.Text;

        return (left, right, op) switch
        {
            (EnteroValue l, EnteroValue r, "==") => new BooleanValue(l.Value == r.Value),
            (EnteroValue l, EnteroValue r, "!=") => new BooleanValue(l.Value != r.Value),
            
            (FloatValue l, FloatValue r, "==") => new BooleanValue(l.Value == r.Value),
            (FloatValue l, FloatValue r, "!=") => new BooleanValue(l.Value != r.Value),
            
            (FloatValue l, EnteroValue r, "==") => new BooleanValue(l.Value == r.Value),
            (FloatValue l, EnteroValue r, "!=") => new BooleanValue(l.Value != r.Value),
            
            (EnteroValue l, FloatValue r, "==") => new BooleanValue(l.Value == r.Value),
            (EnteroValue l, FloatValue r, "!=") => new BooleanValue(l.Value != r.Value),
            
            (BooleanValue l, BooleanValue r, "==") => new BooleanValue(l.Value == r.Value),
            (BooleanValue l, BooleanValue r, "!=") => new BooleanValue(l.Value != r.Value),

            (StringValue l, StringValue r, "==") => new BooleanValue(l.Value == r.Value),
            (StringValue l, StringValue r, "!=") => new BooleanValue(l.Value != r.Value),

            (RuneValue l, RuneValue r, "==") => new BooleanValue(l.Value == r.Value),
            (RuneValue l, RuneValue r, "!=") => new BooleanValue(l.Value != r.Value),
            

            
            _ => throw new Exception("Invalid operation")
        };
    }
    

}