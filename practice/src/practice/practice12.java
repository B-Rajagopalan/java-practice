package practice;

public class practice12 
{
	public static void main(String[] args) 
	{
		numbers(1);
	}

	private static void numbers(int i) 
	{
		if(i>3)
			return;
		
		System.out.println(i);
		
		numbers(i+1);
		
		System.out.println(i);
		
	}
}
