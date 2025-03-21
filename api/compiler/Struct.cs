
using System.ComponentModel.DataAnnotations.Schema;
using analyzer;

public class LanguageStruct : Invocable {

    public string Name {get; set;}
    public Dictionary<string, LanguageParser.Declaracion_variableStructContext> Propiedades {get; set;}
    public Dictionary<string, FuncionForeana> Metodos {get; set;}

    public LanguageStruct (string name,
        Dictionary<string, LanguageParser.Declaracion_variableStructContext> propiedades,
        Dictionary<string, FuncionForeana> metodos
    ) {

        Name = name;
        Propiedades = propiedades;
        Metodos = metodos;
    }

    public FuncionForeana? GetMetodo(string name){

        if (Metodos.ContainsKey(name)){
            return Metodos[name];
        }
        return null;
    }

    //Revisar si ambiar constructor 
    public int Arity(){
        var constructor = GetMetodo("constructor");
        if (constructor != null){
            return constructor.Arity();
        }
        return 0;
    }

    public ValueWrapper Invoke(List<ValueWrapper> args, CompilerVisitor visitor){
        var nuevaInstancia = new Instance(this);

        foreach (var propi in Propiedades){
            var name = propi.Key;
            var value = propi.Value;
            /*if (value.expr() != null){
                var varValue = visitor.Visit(value.expr());
                nuevaInstancia.Set(name, varValue);
            } else{
                nuevaInstancia.Set(name,visitor.defaultVoid);
            }*/
            nuevaInstancia.Set(name,visitor.defaultVoid);
        }

        var constructor = GetMetodo("constructor");
        if (constructor != null){
            constructor.Bind(nuevaInstancia).Invoke(args, visitor);
        }
        return new InstanceValue(nuevaInstancia);
    }


}