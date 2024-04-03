package practice;

import java.util.Arrays;

public class practice9 
{
	public static void main(String[] args) 
	{
		int[] arr= {3,0,0,4,0,0,0,0,7,0,2,0,9};
		
		//myApproach(arr); //O(n square)
		
		bestApproach(arr);  //O(n)
	}
	
	private static void bestApproach(int[] arr) 
	{
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		
		while(count<arr.length)
			arr[count++]=0;
		
		System.out.println(Arrays.toString(arr));
	}

	static void myApproach(int[] arr)
	{
		//my approach
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]!=0) 
					{
						arr[i]=arr[j];
						arr[j]=0;
						break;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
