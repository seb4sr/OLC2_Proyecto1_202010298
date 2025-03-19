public class Environment
{

    public Dictionary<string, ValueWrapper> variables = new Dictionary<string, ValueWrapper>();
    private Environment? parent;

    public Environment(Environment? parent)
    {
        this.parent = parent;
    }

    public ValueWrapper GetVariable(string id)
    {
        if (variables.ContainsKey(id))
        {
            return variables[id];
        }

        if (parent != null)
        {
            return parent.GetVariable(id);
        }

        throw new Exception("Variable " + id + " not found");
    }

    public void DeclaracionVariable(string id, ValueWrapper value, Antlr4.Runtime.IToken? token)
    {
        if (variables.ContainsKey(id))
        {
            if (token != null) throw new ErrorSemantico("Variable " + id + " already declared", token);
        }
        else
        {
            variables[id] = value;
        }
    }

    public ValueWrapper AsignacionVariable(string id, ValueWrapper value)
    {
        if (variables.ContainsKey(id))
        {
            variables[id] = value;
            return value;
        }

        if (parent != null)
        {
            return parent.AsignacionVariable(id, value);
        }

        throw new Exception("Variable " + id + " not found");
    }

}