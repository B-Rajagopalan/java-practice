package practice;
import java.util.*;

public class firstNonrepeating 
{
	public static void main(String[] args) 
	{
		String s ="abbcc";
		
		System.out.println(bestCheck(s));
		
		checkMap(new HashMap<Character,Integer>(),s);
	}

	private static void checkMap(HashMap<Character, Integer> map, String s) 
	{
		// TODO Auto-generated method stub
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		System.out.println(map); // 1st occurence with value 1 is the answer
	}

	private static int bestCheck(String s) 
	{
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(s.indexOf(c)==s.lastIndexOf(c)) {
				return i;
			}
		}
		
		return -1;
	}
}
