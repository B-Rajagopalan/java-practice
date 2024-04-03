package practice;

import java.util.Arrays;

public class Duplicates 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,5,4,4,2,2,3,2,7,1,9,4};
		//sorting
		Arrays.sort(arr);
		
		int stable=0,moving=0;
		//two pointer approach
		while(stable<arr.length && moving<arr.length)
		{
			if(arr[moving]!=arr[stable])
			{
				System.out.println("Count of " +arr[stable]+" = "+(moving-stable));
				stable=moving;
			}
			moving++;
		}
		
		System.out.println("--------------------------");
		//pointers
		int i=0,j=0,count=0;
		while(true)
		{
			if(j>arr.length-1)
			{
				System.out.println("Count of "+arr[i]+" is "+count);
				break;
			}
			
			if(arr[i]==arr[j])
			{
				count++;
				j++;
			}
			else
			{
				System.out.println("Count of "+arr[i]+" is "+count);
				count=0;
				i=j;
			}
		}
	}
}
