

public class BreakEx : Exception
{
    public BreakEx() : base("Break statement")
    {
    }
}

public class ContinueEx : Exception
{
    public ContinueEx() : base("Continue statement")
    {
    }
}

public class ReturnEx : Exception
{
    public ValueWrapper Value { get; }

    public ReturnEx(ValueWrapper value) : base("Return statement")
    {
        Value = value;
    }
}