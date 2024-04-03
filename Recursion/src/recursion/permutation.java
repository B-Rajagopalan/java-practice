package recursion;

public class permutation 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		
		int count = permutations("",s);
		System.out.println("\nNo of permutations "+count);
	}

	private static int permutations(String p, String up) 
	{	
		int count=0;
		
		if(up.isEmpty())
		{
			System.out.println(p);
			return 1;
		}
		
		char ch = up.charAt(0);
		//all possible combinations by placing the elements before and after the picked element
		//_a_/bc => ba for first call (loop) and ab for second loop and so on..
		for(int i=0;i<=p.length();i++)
		{
			String first = p.substring(0,i);
			String second = p.substring(i,p.length());
			
			count+=permutations(first+ch+second,up.substring(1));
		}
		
		return count;
	}
}
