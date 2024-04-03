package practice;

import java.util.Arrays;
import java.util.*;

public class FrequencyOfCharacters 
{
	public static void main(String[] args) 
	{
		String s = "Aabbb",answer="";
		char[] arr = s.toCharArray();
		int i = 0,j = 0,count = 0;
		Arrays.sort(arr);
		Map<Integer,String> map = new TreeMap<Integer,String>();
		
		while(j<arr.length)
		{
			if(arr[j]!=arr[i])
			{
				map.put(count, map.get(count)!=null?map.get(count)+answer:answer);
				answer = "";
				count = 0;
				i = j;
			}
			else
			{
				answer+= arr[j];
				count++;
				j++;
			}
		}
		
		if(answer!="")
			map.put(count, map.get(count)!=null?map.get(count)+answer:answer);
		
		String res = "";
		
		for(String str:map.values())
		{
			res+=str;
		}
		
		System.out.println(new StringBuilder(res).reverse().toString());
		
	}
}
