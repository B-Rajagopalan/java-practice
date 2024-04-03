//find prime numbers 1 to 40
//SIEVE OF ERATOSTHENES
public class primenumRange 
{
	public static void main(String[] args) 
	{
		int n=40;
		
		boolean[] ans= new boolean[n+1];
		
		isPrime(n,ans);
	}

	private static void isPrime(int n, boolean[] ans) 
	{
		for(int i=2;i*i<=n;i++)
		{
			if(!ans[i])
			{
				for(int j=i*2;j<=n;j=j+i)
				{
					ans[j]=true;
				}
			}
		}
		
		for(int i=2;i<=n;i++)
		{
			if(!ans[i])
				System.out.print(i+ " ");
		}
	}
}
