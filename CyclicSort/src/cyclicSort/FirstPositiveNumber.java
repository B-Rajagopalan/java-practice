package cyclicSort;
//Given an unsorted integer array nums, return the smallest missing positive integer.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
public class FirstPositiveNumber 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,0};
		
		System.out.println(firstPositiveNum(arr));
	}
	
	static int firstPositiveNum(int[] arr)
	{
		int i = 0;
		while(i<arr.length)
		{
			int correctIndex = arr[i]-1;
			
			if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correctIndex])
			{
				swap(i,correctIndex,arr);
			}
			else
			{
				i++;
			}
		}
		
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index+1)
			{
				return index+1;
			}
		}
		
		return arr.length+1;
	}
	
	private static void swap(int currentIndex, int correctIndex, int[] arr) 
	{
		int temp = arr[currentIndex];
		arr[currentIndex] = arr[correctIndex];
		arr[correctIndex] = temp;
	}
}

