using analyzer;


public class FuncionForeana : Invocable
{
    private Environment clousure;
    private LanguageParser.Declaracion_funcionesContext context;

    public FuncionForeana(Environment clousure, LanguageParser.Declaracion_funcionesContext context){

        this.clousure = clousure;
        this.context = context;

    }
    public int Arity(){
        if (context.parametros() == null){
            return 0;
        }
        return context.parametros().ID().Length;
    }

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor){
        var nuevoEnv = new Environment(clousure);
        var lastEnvBeforeCall = visitor.currentEnvironment;
        visitor.currentEnvironment = nuevoEnv;

        if (context.parametros() != null){

            for (int i = 0; i < context.parametros().ID().Length; i++)
            {
                nuevoEnv.DeclaracionVariable(context.parametros().ID(i).GetText(), args[i], null);
                //Console.WriteLine(args[i].GetType());
                //Console.WriteLine(context.parametros().ID(i).GetText() + "-->" +context.parametros().tipo(i).GetText());
            }

        }
        try{

            foreach (var stmt in context.declaraciones()){
                visitor.Visit(stmt);
            }

        } catch(ReturnEx e){

            visitor.currentEnvironment = lastEnvBeforeCall;
            return e.Value;

        }

        visitor.currentEnvironment = lastEnvBeforeCall;
        return visitor.defaultVoid;
    }

    //Cambiar el this tratando de mandar por parametros el nombre asignado
    public FuncionForeana Bind(Instance instance){
        var EnvOculto = new Environment(clousure);
        EnvOculto.DeclaracionVariable("this", new InstanceValue(instance), null);
        return new FuncionForeana(EnvOculto, context);
    }
}