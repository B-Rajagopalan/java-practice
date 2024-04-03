package practice;

public class ExceptionCheck 
{
	public static void main(String[] args) 
	{
		try {
			int n = 7/0;
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
