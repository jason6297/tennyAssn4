import java.util.Scanner;

public class Lexer 
{
	//LIST of tokens (operators + separators + keywords)
	private class Token 
	{
		private String lexeme;
		private String token;
		
		
		public Token(String lex, String t) 
		{
			this.lexeme = lex;
			this.token = t;
		}
		public String getToken() 
		{
			return token;
		}
		public String getLexeme() 
		{
			return lexeme;
		}
	}
	
	//error type lexemes go inside token class ^
	/*
	private class TokenError extends Token
	{

		public TokenError(String lex, String t) 
		{
			super(lex, t);
			// TODO Auto-generated constructor stub
		}
		//a special pseudo-token class called "error". 
		//For example, the ampersand symbol (&) does 
		//not match any of the language's tokens 
		//(outside of a comment or string literal). 
		//Therefore, if the "lex" function encounters 
		//an ampersand, then the erroneous lexeme "&" 
		//would be returned with the token descriptor "error".
	}
	*/
//	public Lexer() 
//	{
//		
//	}
	public Token lex()
	{
		if(args.length>0)
		{
			try
			{
				Scanner scan = new Scanner(new File(args[0]));
				String token= ""; 
				while(scan.hasNext())
				{

				}
				token = scan.next();
				//Token = new Token(token, whatitdo(token));
				return null;
			}
		catch (Exception e)
			System.out.println("file not found.")
		}
		else 
			System.out.println("no file present");
	}
	private String Whatitdo(String lex) 
	{
		return null;
	}
	private String Whatitdo(String lex) 
	{
		return null;
	}
	public static void main(String[] args)
	{
//        Lexer lexer = new Lexer(args[0]);
//        Token current = lexer.lex();
//        while(current!=null)// || current.getToken() != error)
//        {
//            System.out.println(current);
//            current = lex.lex();
//        }
	}
}
