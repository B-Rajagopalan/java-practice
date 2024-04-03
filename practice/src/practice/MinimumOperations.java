package practice;

import java.util.*;
import java.util.Map.Entry;
// min operations to make arr empty
public class MinimumOperations 
{
	public static void main(String[] args) 
	{
		int arr[]= {2,3,3,2,2,4,2,3,4};
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int x:arr)
		{
			if(!map.containsKey(x))
				map.put(x, 1);
			else
				map.put(x, map.get(x)+1);
		}
		
		System.out.print(minimumOps(map));
		
	}

	static int minimumOps(Map<Integer, Integer> map) 
	{
		int count=0;
		
		for(Entry<Integer, Integer> x:map.entrySet())
		{
			int value=x.getValue();
			if(value==1)
				return -1;
			
			count+=value/3;
			value=value-(3*(value/3));
			
			if(value==1)
			{
				value+=3;
				count--;
			}
			count+=value/2;
				
			if(value%2==1)
				return -1;
		}
		return count;
	}
}
