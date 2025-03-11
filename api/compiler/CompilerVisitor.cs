
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

    // VisitVarDcl
    public override ValueWrapper VisitDeclaracion_variable(LanguageParser.Declaracion_variableContext context)
    {
        string id = context.ID().GetText();
        ValueWrapper value = Visit(context.expr(1));
        currentEnvironment.DeclareVariable(id, value);
        return defaultVoid;
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
            FloatValue b => b.Value.ToString(),
            StringValue c => c.Value,
            BooleanValue d => d.Value.ToString(),
            VoidValue v => "Trying print a Void Value",
            _ => throw new Exception("Invalid value")
        };
        output += "\n";

        return defaultVoid;
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

    // VisitMulDiv
    public override ValueWrapper VisitMulDiv(LanguageParser.MulDivContext context)
    {
        ValueWrapper left = Visit(context.expr(0));
        ValueWrapper right = Visit(context.expr(1));
        var op = context.op.Text;

        return (left, right, op) switch
        {
            (EnteroValue l, EnteroValue r, "*") => new EnteroValue(l.Value * r.Value),
            (EnteroValue l, EnteroValue r, "/") => new EnteroValue(l.Value / r.Value),
            (FloatValue l, FloatValue r, "*") => new FloatValue(l.Value * r.Value),
            (FloatValue l, FloatValue r, "/") => new FloatValue(l.Value / r.Value),
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
            _ => throw new Exception("Invalid operation")
        };
    }

}