package cyclicSort;

import java.util.Arrays;

//If number ranges from 1 to n and O(n) time complexity needed, use cyclic sort
public class CyclicSort1 
{
	public static void main(String[] args) 
	{
		int[] arr= {3,5,2,4,1};
		int i=0;
		
		while(i<arr.length)
		{
			int correctIndex = arr[i]-1;
			
			if(arr[i]!=arr[correctIndex])
			{
				swap(i,correctIndex,arr);
			}
			else
			{
				i++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int currentIndex, int correctIndex, int[] arr) 
	{
		int temp = arr[currentIndex];;
		arr[currentIndex] = arr[correctIndex];
		arr[correctIndex] = temp;
	}
}
