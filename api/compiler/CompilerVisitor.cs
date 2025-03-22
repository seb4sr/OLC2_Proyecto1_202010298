
using System.Globalization;
using System.Text;
using analyzer;
using Microsoft.VisualBasic;

public class CompilerVisitor : LanguageBaseVisitor<ValueWrapper>
{
    
    public string output = "";
    public Environment currentEnvironment;
    public ValueWrapper defaultVoid = new VoidValue();
    
    

    public CompilerVisitor()
    {
        currentEnvironment = new Environment(null);
        Embeded.Generate(currentEnvironment);
    }
    
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
        /*string texto = null;
        Console.WriteLine(texto + " -> null");*/
        string id = context.ID().GetText();
        string tipo = context.tipo().GetText(); 
        ValueWrapper value = Visit(context.expr()); 

        if (!TipoCoincide(tipo, value))
        {
            throw new Exception($"Error: No se puede asignar un valor de tipo {value.GetType()} a la variable '{id}' de tipo {tipo}.");
        }

        currentEnvironment.DeclaracionVariable(id, value, context.Start);
        return defaultVoid;
    }

    public override ValueWrapper VisitDeclaracionVariableSinValor(LanguageParser.DeclaracionVariableSinValorContext context)
    {
        string id = context.ID().GetText();
        string tipo = context.tipo().GetText();
        ValueWrapper value;
        switch (tipo) {
            case "int":
                currentEnvironment.DeclaracionVariable(id, new EnteroValue(0), context.Start);
                break;
            case "float64":
                //Console.WriteLine((double)0);
                currentEnvironment.DeclaracionVariable(id, new FloatValue(0.0f), context.Start);
                break;
            case "bool":
                currentEnvironment.DeclaracionVariable(id, new BooleanValue(false), context.Start);
                break;
            case "rune":
                currentEnvironment.DeclaracionVariable(id, new RuneValue(0), context.Start);
                break;
            case "string":
                currentEnvironment.DeclaracionVariable(id, new StringValue(""), context.Start);
                break;
            default:
                break;
        }
        return defaultVoid;
    }

    /*public override ValueWrapper VisitDeclaracionVarStruct(LanguageParser.DeclaracionVarStructContext context)
    {
        string id = context.ID().GetText();
        string tipo = context.tipo().GetText();
        ValueWrapper value;
        switch (tipo) {
            case "int":
                currentEnvironment.DeclaracionVariable(id, new EnteroValue(0), context.Start);
                break;
            case "float64":
                currentEnvironment.DeclaracionVariable(id, new FloatValue(0.0f), context.Start);
                break;
            case "bool":
                currentEnvironment.DeclaracionVariable(id, new BooleanValue(false), context.Start);
                break;
            case "rune":
                currentEnvironment.DeclaracionVariable(id, new RuneValue(0), context.Start);
                break;
            case "string":
                currentEnvironment.DeclaracionVariable(id, new StringValue(""), context.Start);
                break;
            default:
                break;
        }
        return defaultVoid;
    }*/


    public override ValueWrapper VisitDeclaracionImplicita(LanguageParser.DeclaracionImplicitaContext context)
{
    string id = context.ID().GetText();
    ValueWrapper value = Visit(context.expr());

    switch (value)
    {
        case EnteroValue:
            currentEnvironment.DeclaracionVariable(id,value, context.Start); 
            break;
        case FloatValue:
            currentEnvironment.DeclaracionVariable(id,value, context.Start); 
            break;
        case BooleanValue:
            currentEnvironment.DeclaracionVariable(id,value, context.Start); 
            break;
        case StringValue:
            currentEnvironment.DeclaracionVariable(id,value, context.Start); 
            break;
        case RuneValue:
            currentEnvironment.DeclaracionVariable(id,value, context.Start); 
            break;
        default:
            throw new ErrorSemantico("Error con Declaracion Implica", context.Start);
    }

    return defaultVoid; 
}
    public override ValueWrapper VisitDeclaracionSliceValores(LanguageParser.DeclaracionSliceValoresContext context)
    {
        string id = context.ID().GetText();
        List<ValueWrapper> valores = new List<ValueWrapper>();
        var tipo = context.tipo().GetText();
        
        foreach(var expresion in context.expr()){
            ValueWrapper value = Visit(expresion);
            if(value is EnteroValue && tipo == "int" || value is FloatValue && tipo == "float64"
            || value is BooleanValue && tipo == "bool" || value is RuneValue && tipo == "rune" 
            || value is StringValue && tipo == "string"){
                valores.Add(value);
            } else
            {
                throw new ErrorSemantico("Asignacion de valores diferente al tipo de Slice1", context.Start);
            }
        }
        currentEnvironment.DeclaracionVariable(id,new SliceValue(valores),context.Start);
        return defaultVoid; 
    }
    public override ValueWrapper VisitDeclaracion2SliceValores(LanguageParser.Declaracion2SliceValoresContext context)
    {
        string id = context.ID().GetText();
        List<List<ValueWrapper>> valoresConjunto = new List<List<ValueWrapper>>();
        
        var tipo = context.tipo().GetText();
        //var valores2Slices = context.valores2Slices().valorUnitario();
        foreach (var conjunto in context.valores2Slices().valorUnitario())
        {   
            List<ValueWrapper> valoresElemento = new List<ValueWrapper>();
            foreach(var elemento in conjunto.expr() )
            {
                ValueWrapper value = Visit(elemento);
                if(value is EnteroValue && tipo == "int" || value is FloatValue && tipo == "float64"
                || value is BooleanValue && tipo == "bool" || value is RuneValue && tipo == "rune" 
                || value is StringValue && tipo == "String" || value is SliceValue){
                    valoresElemento.Add(value);
                } else
                {
                    throw new ErrorSemantico("Asignacion de valores diferente al tipo de Slice2", context.Start);
                }
            }

            //ValueWrapper value2 = Visit(conjunto);
            //Console.WriteLine(value2);
            valoresConjunto.Add(valoresElemento);
            
            //valoresConjunto.Add(valoresElemento);
        }
        currentEnvironment.DeclaracionVariable(id,new Slice2Value(valoresConjunto),context.Start);
        return defaultVoid; 
    }
    public override ValueWrapper VisitDeclaracionSliceSinValores(LanguageParser.DeclaracionSliceSinValoresContext context)
    {
        string id = context.ID().GetText();
        List<ValueWrapper> valores = new List<ValueWrapper>();
        //Console.WriteLine(valores.GetType());
        currentEnvironment.DeclaracionVariable(id,new SliceValue(valores),context.Start);
        return defaultVoid; 
    }

    public override ValueWrapper VisitGetSlices(LanguageParser.GetSlicesContext context)
    {
        ValueWrapper value1 = Visit(context.expr(1));
        
        
        if(value1 is not EnteroValue)
        {
            throw new ErrorSemantico("Indice 1 no es EnteroValue", context.Start);
        }
        
        int index1 = ((EnteroValue)value1).Value;

        var valueId = context.expr(0);
        string srtId = "none";
        if(valueId is LanguageParser.IdContext id)
        {
             srtId = id.ID().GetText();
        }
        ValueWrapper valueSlice = currentEnvironment.GetVariable(srtId,context.Start);
        if (valueSlice is  SliceValue slice)
        {
            
            List<ValueWrapper> elementos = slice.Elements;
            ValueWrapper newValue = elementos[index1] switch
            {
                EnteroValue l => new EnteroValue(l.Value),
                FloatValue l => new FloatValue(l.Value),
                StringValue l => new StringValue(l.Value),
                BooleanValue l => new BooleanValue(l.Value),
                RuneValue l => new RuneValue(l.Value),
                SliceValue l => new SliceValue(l.Elements),
                _ => throw new ErrorSemantico("Erro Access Slice", context.Start)
            };
            return newValue;
        } else if (valueSlice is  Slice2Value slice2)
        {
            if(context.expr().Length == 3)
            {
                ValueWrapper value2 = Visit(context.expr(2));
                if(value2 is not EnteroValue)
                {
                    throw new ErrorSemantico("Indice 2 no es EnteroValue", context.Start);
                }
                int index2 = ((EnteroValue)value2).Value;
                List<List<ValueWrapper>> elementos = slice2.Elements;
                ValueWrapper newValue = elementos[index1][index2] switch
                {
                    EnteroValue l => new EnteroValue(l.Value),
                    FloatValue l => new FloatValue(l.Value),
                    StringValue l => new StringValue(l.Value),
                    BooleanValue l => new BooleanValue(l.Value),
                    RuneValue l => new RuneValue(l.Value),
                    SliceValue l => new SliceValue(l.Elements),
                    _ => throw new ErrorSemantico("Erro Access Slice", context.Start)
                };
                return newValue;
            }
            if(context.expr().Length == 2)
            {
                
                int index2 = ((EnteroValue)value1).Value;
                List<List<ValueWrapper>> elementos = slice2.Elements;
                ValueWrapper newValue = elementos[index1] switch
                {
                    List<ValueWrapper> l => new SliceValue(l),
                    
                    _ => throw new ErrorSemantico("Erro Access Slice", context.Start)
                };
                return newValue;
            }
        } 
        else 
        {
            throw new ErrorSemantico("Tratando de Entrar a una Variable !Slice", context.Start);
        }

        return defaultVoid; 
    }

    public override ValueWrapper VisitSliceIndex(LanguageParser.SliceIndexContext context)
    {   
        var asignado = context.expr(0);
        if (asignado is LanguageParser.IdContext idContext){
            Console.WriteLine(asignado);
            string id = idContext.ID().GetText();
            ValueWrapper slice = currentEnvironment.GetVariable(id,context.Start);
            ValueWrapper value = Visit(context.expr(1));
            if (slice is SliceValue sliceVar){
                    List<ValueWrapper> elementos = sliceVar.Elements;
                    for(int i = 0; i < elementos.Count; i++)
                    {
                        
                        if (value == elementos[i])
                        {
                            return new EnteroValue(i);
                        }
                    }
            }
        }
        return new EnteroValue(-1); 
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
            _ => false 
        };
    }


public override ValueWrapper VisitIf(LanguageParser.IfContext context)
    {
        ValueWrapper cond = Visit(context.expr());

        if (cond is not BooleanValue)
        {
            throw new Exception("Invalid condition");
        }

        if ((cond as BooleanValue).Value)
        {
            Visit(context.stmt(0));
        }
        else if (context.stmt().Length > 1)
        {
            Visit(context.stmt(1));
        }

        return defaultVoid;
    }


    public override ValueWrapper VisitExpresion(LanguageParser.ExpresionContext context)
    {
        return Visit(context.expr());
    }

    public override ValueWrapper VisitFmtPrint(LanguageParser.FmtPrintContext context)  
    {

        foreach (var expr in context.expr()){
            ValueWrapper value = Visit(expr);
            output += value switch
                {
                    EnteroValue a => a.Value.ToString(),
                    FloatValue b => b.Value.ToString("G7", CultureInfo.InvariantCulture), 
                    StringValue c => c.Value,
                    BooleanValue d => d.Value.ToString(),
                    RuneValue e => e.Value.ToString(),
                    FunctionValue f => "<function>" + f.name.ToString(),
                    SliceValue s => "<slice> [" + string.Join(",", s.Elements.Select(e =>
                        e switch {
                            EnteroValue a => a.Value.ToString(),
                            FloatValue b => b.Value.ToString(CultureInfo.InvariantCulture),
                            StringValue c => $"\"{c.Value}\"",
                            BooleanValue d => d.Value.ToString(),
                            RuneValue r => r.Value.ToString(),
                            FunctionValue f => "<function>" + f.name,
                            VoidValue => "void",
                            SliceValue => "<slice>", // prevenir recursión infinita
                            _ => "[unknown]"
                        } 
                    )) + "]",
                    Slice2Value s2 => "<slice2> [" + string.Join(",", s2.Elements.Select(innerList =>
                        "[" + string.Join(",", innerList.Select(e =>
                            e switch {
                                EnteroValue a => a.Value.ToString(),
                                FloatValue b => b.Value.ToString(CultureInfo.InvariantCulture),
                                StringValue c => $"\"{c.Value}\"",
                                BooleanValue d => d.Value.ToString(),
                                RuneValue r => r.Value.ToString(),
                                FunctionValue f => "<function>" + f.name,
                                VoidValue => "void",
                                SliceValue => "<slice>", // prevenir recursión infinita
                                Slice2Value => "<slice2>", // prevenir recursión infinita
                                _ => "[unknown]"
                            }
                        )) + "]"
                    )) + "]",
                    VoidValue v => "Trying to print a Void Value",
                    _ => $"[Tipo desconocido: {value.GetType().Name}]"
                };
                output += " ";
        }
        output += "\n";
    //ValueWrapper value = Visit(context.expr());
    

    return defaultVoid;
}

    public override ValueWrapper VisitCallExpr(LanguageParser.CallExprContext context)
    {
        ValueWrapper callee = Visit(context.expr());


        foreach (var call in context.call())
        {
            if (call is LanguageParser.FunCallContext funCall){
    
                if (callee is FunctionValue functionValue)
                {
                    callee = VisitCall(functionValue.invocable, funCall.atri());
                }
                else
                {
                    throw new ErrorSemantico("Invalid function call", context.Start);
                }
            }
            /*else if (call is LanguageParser.GetContext propertyAccess)
            {
                if (callee is InstanceValue instanceValue)
                {
                    callee = instanceValue.instance.Get(propertyAccess.ID().GetText(), propertyAccess.Start);
                }
                else
                {
                    throw new ErrorSemantico("Propiedad Invalida a la que se quiere acceder", context.Start);
                }
            }*/
        }

        return callee;
    }

    public ValueWrapper VisitCall(Invocable invocable, LanguageParser.AtriContext context)
    {

        List<ValueWrapper> arguments = new List<ValueWrapper>();

        if (context != null)
        {
            foreach (var expr in context.expr())
            {
                arguments.Add(Visit(expr));
            }
        }

        // if (context != null && arguments.Count != invocable.Arity())
        // {
        //     throw new SemanticError("Invalid number of arguments", context.Start);
        // }

        return invocable.Invoke(arguments, this);

    }




    public override ValueWrapper VisitAsignacion(LanguageParser.AsignacionContext context)
    {
        /*string id = context.ID().GetText();
        ValueWrapper value = Visit(context.expr());
        return currentEnvironment.AsignacionVariable(id, value);*/
        var asignado = context.expr(0);
        ValueWrapper value = Visit(context.expr(1));
        //Console.WriteLine(asignado.GetType());
        if (asignado is LanguageParser.IdContext idContext){

            string id = idContext.ID().GetText();
            /*Console.WriteLine(id);
            Console.WriteLine(value.GetType());
            Console.WriteLine(currentEnvironment.GetVariable(id,context.Start).GetType());*/
            if (value.GetType() != currentEnvironment.GetVariable(id,context.Start).GetType())
            {
               throw new ErrorSemantico("Diferente tipo de valor a asignar a la variable", context.Start);
            }
            currentEnvironment.AsignacionVariable(id, value, context.Start);

        } /*else if (asignado is LanguageParser.CallExprContext calleContext)
        {

            ValueWrapper callee = Visit(calleContext.expr());
            for( int i = 0; i < calleContext.call().Length; i++)
            {
                var call = calleContext.call(i);
                if (i == calleContext.call().Length - 1)
                {
                    
                    if (call is LanguageParser.GetContext propertyAccess)
                    {
                        if (callee is InstanceValue instanceValue)
                        {
                            instanceValue.instance.Set(propertyAccess.ID().GetText(), value);
                        }
                        else
                        {
                            throw new ErrorSemantico("Propiedad Invalida a la que se quiere acceder", context.Start);
                        }
                    }
                }
            }

        } */else if(asignado is LanguageParser.GetSlicesContext AsignarSlice)
        {
            if (AsignarSlice.expr().Length == 2)
            {
                var valueId = AsignarSlice.expr(0);
                string srtId = "none";
                if(valueId is LanguageParser.IdContext id)
                {
                    srtId = id.ID().GetText();
                }
                ValueWrapper valueSlice = currentEnvironment.GetVariable(srtId,context.Start);
                if (valueSlice is not SliceValue slice)
                {
                    throw new ErrorSemantico("Tratando de Entrar a una Variable !Slice", context.Start);
                } 

                List<ValueWrapper> elementos = slice.Elements;
                ValueWrapper value1 = Visit(AsignarSlice.expr(1));
                
                if(value1 is not EnteroValue)
                {
                    throw new ErrorSemantico("Indice 1 no es EnteroValue", context.Start);
                }

                int index1 = ((EnteroValue)value1).Value;

                elementos[index1] = value;
                currentEnvironment.AsignacionVariable(srtId,new SliceValue(elementos),context.Start);
            }
            if (AsignarSlice.expr().Length == 3)
            {
                var valueId = AsignarSlice.expr(0);
                string srtId = "none";
                if(valueId is LanguageParser.IdContext id)
                {
                    srtId = id.ID().GetText();
                }
                ValueWrapper valueSlice = currentEnvironment.GetVariable(srtId,context.Start);
                if (valueSlice is not Slice2Value slice)
                {
                    throw new ErrorSemantico("Tratando de Entrar a una Variable !2Slice", context.Start);
                } 

                List<List<ValueWrapper>> elementos = slice.Elements;
                ValueWrapper value1 = Visit(AsignarSlice.expr(1));
                ValueWrapper value2 = Visit(AsignarSlice.expr(2));
                if(value1 is not EnteroValue)
                {
                    throw new ErrorSemantico("Indice 1 no es EnteroValue", context.Start);
                }

                int index1 = ((EnteroValue)value1).Value;
                if(value2 is not EnteroValue)
                {
                    throw new ErrorSemantico("Indice 1 no es EnteroValue", context.Start);
                }

                int index2 = ((EnteroValue)value2).Value;
                elementos[index1][index2] = value;
                currentEnvironment.AsignacionVariable(srtId,new Slice2Value(elementos),context.Start);
            }

            
            
            
        } 
        else {
            throw new ErrorSemantico("Asignacion Invalida", context.Start);
        }
        return defaultVoid;
    }

    public override ValueWrapper VisitId(LanguageParser.IdContext context)
    {
        string id = context.ID().GetText();
        return currentEnvironment.GetVariable(id, context.Start);
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
    public override ValueWrapper VisitNot(LanguageParser.NotContext context)
    {
        ValueWrapper value = Visit(context.expr());
        return value switch
        {
            BooleanValue i => new BooleanValue(!i.Value),
            _ => throw new ErrorSemantico("Tipo Invalido para operacion !", context.Start)
        };

        
    }

    // VisitNumber
    public override ValueWrapper VisitEntero(LanguageParser.EnteroContext context)
    {
        return new EnteroValue(int.Parse(context.INT().GetText()));
    }
    public override ValueWrapper VisitFloat(LanguageParser.FloatContext context)
    {
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
        string textoConComillas = context.STRING().GetText();
        string sinComillas = textoConComillas.Substring(1, textoConComillas.Length - 2);
        return new StringValue(sinComillas);
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

    public override ValueWrapper VisitAnd(LanguageParser.AndContext context)
    {
        ValueWrapper left = Visit(context.GetChild(0));
        ValueWrapper right = Visit(context.expr(1));
        

        return (left, right) switch
        {
            (BooleanValue l, BooleanValue r) => new BooleanValue(l.Value && r.Value),
            

            _ => throw new Exception("Invalid AND operation")
        };
    }
     public override ValueWrapper VisitOr(LanguageParser.OrContext context)
    {
        ValueWrapper left = Visit(context.GetChild(0));
        ValueWrapper right = Visit(context.expr(1));
        

        return (left, right) switch
        {
            (BooleanValue l, BooleanValue r) => new BooleanValue(l.Value || r.Value),
            

            _ => throw new Exception("Invalid AND operation")
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
    

    public override ValueWrapper VisitIncre(LanguageParser.IncreContext context)
    {
    
        string id = context.ID().GetText();

        ValueWrapper currentValue = currentEnvironment.GetVariable(id, context.Start);

        ValueWrapper newValue = currentValue switch
        {
            EnteroValue l => new EnteroValue(l.Value + 1),
            FloatValue l => new FloatValue(l.Value + 1),
            _ => throw new Exception($"Invalid operation: Cannot apply '++' to type {currentValue.GetType().Name}")
        };

        currentEnvironment.AsignacionVariable(id, newValue, context.Start);

        return newValue; 
    }   
    public override ValueWrapper VisitDecre(LanguageParser.DecreContext context)
    {
    
        string id = context.ID().GetText();

        ValueWrapper currentValue = currentEnvironment.GetVariable(id, context.Start);

        ValueWrapper newValue = currentValue switch
        {
            EnteroValue l => new EnteroValue(l.Value -1),
            FloatValue l => new FloatValue(l.Value -1),
            _ => throw new Exception($"Invalid operation: Cannot apply '++' to type {currentValue.GetType().Name}")
        };

        currentEnvironment.AsignacionVariable(id, newValue, context.Start);

        return newValue; 
    } 

    public override ValueWrapper VisitFor(LanguageParser.ForContext context)
    {
        Environment preEnvi = currentEnvironment;
        currentEnvironment = new Environment(currentEnvironment);

        Visit(context.inicializacionesfor());

        VisitForBody(context);

        currentEnvironment = preEnvi;
        return defaultVoid;
    }

    public void VisitForBody(LanguageParser.ForContext context)
    {
        ValueWrapper condition = Visit(context.expr(0));

        var lastEnvi = currentEnvironment;


        if (condition is not BooleanValue)
        {
            throw new ErrorSemantico("Invalid condition", context.Start);
        }


        try
        {
            while (condition is BooleanValue boolCondition && boolCondition.Value)
            {
                Visit(context.stmt());
                Visit(context.expr(1));
                condition = Visit(context.expr(0));
            }
        }
        catch (BreakEx)
        {
            currentEnvironment = lastEnvi;
        }
        catch (ContinueEx)
        {
            currentEnvironment = lastEnvi;
            Visit(context.expr(1));
            VisitForBody(context);
        }

    }

    public override ValueWrapper VisitBreak(LanguageParser.BreakContext context)
    {
        throw new BreakEx();
    }

    public override ValueWrapper VisitContinue(LanguageParser.ContinueContext context)
    {
        throw new ContinueEx();
    }

    public override ValueWrapper VisitReturn(LanguageParser.ReturnContext context)
    {
        ValueWrapper value = defaultVoid;

        if (context.expr() != null)
        {
            value = Visit(context.expr());
        }


        throw new ReturnEx(value);
    }

    public override ValueWrapper VisitForCond(LanguageParser.ForCondContext context)
    {
        Environment preEnvi = currentEnvironment;
        currentEnvironment = new Environment(currentEnvironment);

        ValueWrapper condition = Visit(context.expr());

        var lastEnvi = currentEnvironment;
        if (condition is not BooleanValue)
        {
            throw new ErrorSemantico("Invalid condition", context.Start);
        }


        try
        {
            while (condition is BooleanValue boolCondition && boolCondition.Value)
        {
            try
            {
                Visit(context.stmt());
            }
            catch (ContinueEx)
            {
                condition = Visit(context.expr());
                continue;
            }

            condition = Visit(context.expr());
        }
        }
        catch (BreakEx)
        {
            currentEnvironment = lastEnvi;
        }
        
        currentEnvironment = preEnvi;
        return defaultVoid;
    }
    
    public override ValueWrapper VisitDeclaracion_funciones(LanguageParser.Declaracion_funcionesContext context)
    {
        var foreana = new FuncionForeana(currentEnvironment, context);
        currentEnvironment.DeclaracionVariable(context.ID().GetText(), new FunctionValue(foreana, context.ID().GetText()), context.Start);
        return defaultVoid;
    }

    public override ValueWrapper VisitDeclaracion_structs(LanguageParser.Declaracion_structsContext context)
    {
        Dictionary<string, LanguageParser.DeclaracionImplicitaContext> propiedades = new Dictionary<string, LanguageParser.DeclaracionImplicitaContext>();

        Dictionary<string, FuncionForeana> metodos = new Dictionary<string, FuncionForeana>();
        foreach (var propiedad in context.structBody()){

            if ( propiedad.declaracion_variable() != null){
                var varDcl = propiedad.declaracion_variable();
                if (varDcl is LanguageParser.DeclaracionVariableConValorContext valor) {
                    //propiedades.Add(valor.ID().GetText(), valor);
                }
                //propiedades.Add(varDcl.ID().GetText(), varDcl);
            } else if(propiedad.declaracion_funciones() != null){

                var funDcl = propiedad.declaracion_funciones();
                var FuncionForeana = new FuncionForeana(currentEnvironment, funDcl);
                metodos.Add(funDcl.ID().GetText(), FuncionForeana);
            }
            }
        LanguageStruct languageStruct = new LanguageStruct(context.ID().GetText(),propiedades, metodos);
        currentEnvironment.DeclaracionVariable(context.ID().GetText(), new StructValue(languageStruct), context.Start);
        return defaultVoid;
    }

    public override ValueWrapper VisitInstancia (LanguageParser.InstanciaContext context)
    {
        ValueWrapper classValue = currentEnvironment.GetVariable(context.ID().GetText(), context.Start);
        if (classValue is not StructValue){
            throw new ErrorSemantico("Instancia Valida de Struct", context.Start);
        }
        List <ValueWrapper> argumentos = new List<ValueWrapper>();
        if ( context.atri() != null){

            foreach (var argumento in context.atri().expr())
            {

                argumentos.Add(Visit(argumento));

            }

        }
        var instancia = ((StructValue) classValue).LanguageStruct.Invoke(argumentos, this);
        return instancia;
    }
}