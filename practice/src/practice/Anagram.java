package practice;

import java.util.*;
import java.util.Map.Entry;
//COUNTING THE ASCII VALUE DOESN'T WORK
public class Anagram 
{
	public static void main(String[] args) 
	{
//		String a = "nagaram";
//		String b = "anagram";
//		
//		int acount = findAnagramCount(a,0,a.length()-1,0);
//		int bcount = findAnagramCount(b,0,b.length()-1,0);
//		
//		if(acount==bcount)
//			System.out.println(true);
//		else
//			System.out.println(false);
		
		//System.out.println(simpleMethod(a, b));
		
		String arr[] = {"eat","tea","tan","ate","nat","bat"};
		
		int values[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int count = findAnagramCount(arr[i],0,arr[i].length()-1,0);
			values[i]=count;
		}
		
		ArrayList<ArrayList<Object>> outerList = new ArrayList<ArrayList<Object>>();
		
		System.out.println(convertToList(outerList,arr,values));
		
		//Another method is to use HashMap<Integer,ArrayList<String>>
		//Just calculate ascii value and add as key, if any word matches the key just add in value list 
	}
			
	
	private static ArrayList<ArrayList<Object>> convertToList(ArrayList<ArrayList<Object>> outerList,
			String[] arr, int[] values) {
		
		for(int i=0;i<values.length;i++)
		{
			int first = (int) values[i];
			ArrayList<Object> innerList = new ArrayList<Object>();
			
			if(first!=0)
			{
				for(int j=i;j<values.length;j++)
				{
					int second = (int) values[j];
					if(first==second)
					{
						innerList.add(arr[j]);
						values[j]=0;
					}
				}
			}
			
			if(!innerList.isEmpty())
				outerList.add(innerList);
		}
		
		return outerList;
	}


	//binary search method O(log n+log n)
	private static int findAnagramCount(String str, int s, int e, int count) 
	{
		if(s==e)
			return count+str.charAt(s);
		
		//int count = 0;
		int mid = s+(e-s)/2;
		
		count = findAnagramCount(str, s, mid, count);  
		count = findAnagramCount(str, mid + 1, e, count);
		
		return count;
	}
	
	// Normal method O(n)
	private static boolean simpleMethod(String a,String b)
	{
		//WRONG METHOD
		//for input ac and bb, this doesnt work because both of them has same result
		//when counting ascii values
		if(a.length()!=b.length())
			return false;
		
		int counta=0,countb=0;
		
		for(int i=0;i<a.length();i++)
		{
			counta+=a.charAt(i);
			countb+=b.charAt(i);
		}
		
		if(counta==countb)
			return true;
		else
			return false;
	}
}
