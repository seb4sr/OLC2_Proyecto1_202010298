public class Instance {

    private LanguageStruct languageStruct;
    private Dictionary<string, ValueWrapper> Propiedades;

    public Instance (LanguageStruct languageStruct){
        this.languageStruct = languageStruct;
        Propiedades = new Dictionary<string, ValueWrapper>();

    }

    public ValueWrapper Get(string name, Antlr4.Runtime.IToken token){
        if(Propiedades.ContainsKey(name)){
            return Propiedades[name];
        }
        var metodo = languageStruct.GetMetodo(name);
        if(metodo != null){
            return new FunctionValue(metodo.Bind(this),name);
        }
        throw new ErrorSemantico("Propiedad "+ name + " no existente", token);
    }

    public void Set(string name, ValueWrapper value){
        Propiedades[name] = value; 
    }

}