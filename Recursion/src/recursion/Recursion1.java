package recursion;

public class Recursion1 
{
	public static void main(String[] args) 
	{
		int n=5;
		
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		recursionStack(n,1);
	}
	
	public static void recursionStack(int n,int level)
	{
		for(int i=1;i<=level;i++)
		{
			System.out.print(i+"* ");
		}
		System.out.println();
		
		if(level==n)
			return;
		
		recursionStack(n,level+1);
		
		for(int i=1;i<=level;i++)
		{
			System.out.print(i+"* ");
		}
		System.out.println();
	}
}
