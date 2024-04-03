package cyclicSort;

import java.util.ArrayList;
import java.util.List;

//numbers range from 1 to n
public class findAllMissing 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,2,3,4};
		
		System.out.println(missingNumbers(arr));
	}
	
	private static List<Integer> missingNumbers(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<arr.length)
		{
			int correctIndex = arr[i]-1;
			
			if(arr[i]<arr.length && arr[i]!=arr[correctIndex])//arr[i] value may go above index
			{
				swap(i,correctIndex,arr);
			}
			else
			{
				i++;
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index+1)
			{
				list.add(index+1);
			}
		}
		
		return list;
	}

	private static void swap(int currentIndex, int correctIndex, int[] arr) 
	{
		int temp = arr[currentIndex];
		arr[currentIndex] = arr[correctIndex];
		arr[correctIndex] = temp;
	}
}
