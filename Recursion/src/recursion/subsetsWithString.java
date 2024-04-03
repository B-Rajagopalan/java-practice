package recursion;

public class subsetsWithString 
{
	public static void main(String[] args) 
	{
		String s = "abc";
		subSets("",s);
	}

	private static void subSets(String processed, String unProcessed) 
	{
		if(unProcessed.isEmpty())
		{
			System.out.println(processed);
			return;
		}
		//picking and leaving of first element to form subsets/subsequence
		subSets(processed+unProcessed.charAt(0),unProcessed.substring(1));
		subSets(processed,unProcessed.substring(1));
	}
}
