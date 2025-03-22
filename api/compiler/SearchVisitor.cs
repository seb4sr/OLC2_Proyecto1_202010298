using analyzer;
public class SearchVisitor : LanguageBaseVisitor<object>
{
    private Environment globalEnv;

    public SearchVisitor(Environment env)
    {
        this.globalEnv = env;
    }

    public override object VisitProgram(LanguageParser.ProgramContext context)
    {
        foreach (var dcl in context.declaraciones())
        {
            Visit(dcl);
        }

        return null;
    }

    public override object VisitDeclaracion_funciones(LanguageParser.Declaracion_funcionesContext context)
    {
        var foreana = new FuncionForeana(globalEnv, context);
        globalEnv.DeclaracionVariable(
            context.ID().GetText(),
            new FunctionValue(foreana, context.ID().GetText()),
            context.Start
        );
        return null;
    }

    public override object VisitDeclaracion_structs(LanguageParser.Declaracion_structsContext context)
    {
        Dictionary<string, LanguageParser.DeclaracionImplicitaContext> propiedades = new();
        Dictionary<string, FuncionForeana> metodos = new();

        foreach (var propiedad in context.structBody())
        {
            if (propiedad.declaracion_funciones() != null)
            {
                var funDcl = propiedad.declaracion_funciones();
                var funcionForeana = new FuncionForeana(globalEnv, funDcl);
                metodos.Add(funDcl.ID().GetText(), funcionForeana);
            }
        }

        LanguageStruct languageStruct = new(context.ID().GetText(), propiedades, metodos);
        globalEnv.DeclaracionVariable(context.ID().GetText(), new StructValue(languageStruct), context.Start);

        return null;
    }
}
