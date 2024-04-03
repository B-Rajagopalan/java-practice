package recursion;

import java.util.ArrayList;

public class phoneNumbers 
{
	public static void main(String[] args) 
	{
		String s ="12";
		
		System.out.println(phoneNumberCombos("",s));
	}

	private static ArrayList<String> phoneNumberCombos(String p,String up) 
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> recursiveList = new ArrayList<String>();
		
		int digit = up.charAt(0)-'0'; //this will convert '2' to 2 (char to int)
		
		for(int i =(digit-1)*3;i<digit*3;i++)
		{
			recursiveList.addAll(phoneNumberCombos(p+ (char)(i+'a'),up.substring(1)));
		}
		
		return recursiveList;
	}
}
