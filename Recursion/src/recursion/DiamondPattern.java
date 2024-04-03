package recursion;

public class DiamondPattern 
{
	public static void main(String[] args) 
	{
		int n=5;
		recursionStack(n,1);
	}
	
	public static void recursionStack(int n,int level)
	{
		for(int i=0;i<n;i++)
		{
			if(i==n-level)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		
		for(int j=0;j<level;j++)
		{	
			System.out.print(" ");
		}
		
		if(level!=1)
			System.out.println("*");
		else
			System.out.println();
		
		if(level==n)
			return;
		
		recursionStack(n,level+1);
		

		for(int i=0;i<n;i++)
		{
			if(i==n-level)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		
		for(int j=0;j<level;j++)
		{	
			System.out.print(" ");
		}
		
		if(level!=1)
			System.out.println("*");
		else
			System.out.println();
	}
}
