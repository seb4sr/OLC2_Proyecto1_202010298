using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

public class ErrorSemantico : Exception
{

    private string desc;
    private Antlr4.Runtime.IToken token;

    public ErrorSemantico(string desc, Antlr4.Runtime.IToken token)
    {
        this.desc = desc;
        this.token = token;
    }

    public override string Message
    {
        get
        {
            return desc + " en línea " + token.Line + ", columna " + token.Column;
        }
    }
}


public class LexicalErrorListener : BaseErrorListener, IAntlrErrorListener<int>
{
    public void SyntaxError(TextWriter output, IRecognizer recognizer, int offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        Console.WriteLine($"Error léxico en línea {line}, columna {charPositionInLine}: {msg}");
        throw new ParseCanceledException($"Error léxico en línea {line}:{charPositionInLine} - {msg}");
    }

}


public class SyntaxErrorListener : BaseErrorListener
{
    public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        Console.WriteLine($"Error sintáctico en línea {line}, columna {charPositionInLine}: {msg}");
        throw new ParseCanceledException($"Error sintáctico en línea {line}:{charPositionInLine} - {msg}");
    }
}