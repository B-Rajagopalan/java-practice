package practice;
//Find prime or not
public class primeNumbers 
{
	public static void main(String[] args) 
	{
		int n = 3;
		System.out.println(isPrime(n));
	}

	private static boolean isPrime(int n) 
	{
		if(n<=1)
			return false;
		
		int c=2;
		
		while(c*c<=n)
		{
			if(n%c==0)
				return false;
			c++;
		}
		
		return true;
	}
	
	//T.C => O(root n)
}
