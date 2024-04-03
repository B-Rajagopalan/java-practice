package practice;

public class practice5 
{
	public static void main(String[] args) 
	{
		int n=12;
		int num=718;
		
		System.out.println(DectoNBase(n,num));
	}
	
	public static String DectoNBase(int n,int num)
	{
		int rem=0;
		String ans="";
		char c='\0';
		
		while(num>0)
		{
			rem=num%n;
			
			if(rem>9) 
			{
				c=(char) (rem+55);
				ans+=c;
			}
			else
			{
				ans+=rem;
			}
			num=num/n;	
		}
		
		StringBuilder s=new StringBuilder(ans);
		
		return s.reverse().toString();
	}
}
