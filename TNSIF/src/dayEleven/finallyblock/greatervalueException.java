package dayEleven.finallyblock;

public class greatervalueException extends Exception {
	
	public greatervalueException(String string)
	{
		super (string);
	}
	public greatervalueException()
	{
		super ("Percentage must not be Greater than 100");
	}

}
