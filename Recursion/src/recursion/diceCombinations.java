package recursion;

import java.util.ArrayList;

public class diceCombinations 
{
	public static void main(String[] args) 
	{
		int n = 4;
		
		System.out.println(diceCombos("",n));
	}

	private static ArrayList<String> diceCombos(String p,int n) 
	{
		if(n==0)
		{
			System.out.println(p);
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			
			return list;
		}
		
		ArrayList<String> recursiveList = new ArrayList<String>();
		
		for(int i=1;i<=n;i++)
		{
			recursiveList.addAll(diceCombos(p+i, n-i));
		}
		
		return recursiveList;
	}
}
