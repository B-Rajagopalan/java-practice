package bitwise;

public class evenorodd 
{
	public static void main(String[] args) 
	{
		System.out.println(isEven(69));
	}

	private static boolean isEven(int n) 
	{
		return (n&1)==0;
	}
}
