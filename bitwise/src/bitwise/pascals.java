package bitwise;
//find the sum of n th row in pascals triangle
public class pascals 
{
	public static void main(String[] args) 
	{
		System.out.println(sumOfPascals(3));;
	}

	private static int sumOfPascals(int n) 
	{
		return 1<<(n-1);
		//2 power n-1 == 1<<(n-1). Zeros added at the last in binary value
		// and 2 grows exponentially same as putting power over it.
	}
}
