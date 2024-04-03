package recursion;

public class FIbonacci_formula 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<51;i++)
		{
			System.out.println(fibo(i)+"----->"+fibo2(i));
		}
		
	}

	static int fibo(int n)
	{
		//less dominating term ignored
		return (int) 
		((Math.pow((1+Math.sqrt(5))/2, n))/Math.sqrt(5));
	}
	
	static int fibo2(int n)
	{
		//less dominating term not ignored
		return (int) 
		((Math.pow((1+Math.sqrt(5))/2, n)-Math.pow((1-Math.sqrt(5))/2, n))/Math.sqrt(5));
	}
	
	//Upto 35th fibonacci number fibo(n) is inaccurate (9227464----->9227465)
	// Hence fibo2(n) is accurate. So dont ignore less dominating term in fibo formula
}
