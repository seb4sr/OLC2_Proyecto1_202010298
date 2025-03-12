

public abstract record ValueWrapper;


public record EnteroValue(int Value) : ValueWrapper;
public record FloatValue(float Value) : ValueWrapper;
public record StringValue(string Value) : ValueWrapper;
public record BooleanValue(bool Value) : ValueWrapper;
public record RuneValue(uint Value) : ValueWrapper;

public record VoidValue : ValueWrapper;


