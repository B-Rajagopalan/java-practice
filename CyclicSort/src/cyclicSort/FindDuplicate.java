package cyclicSort;

import java.util.ArrayList;

//numbers range from 1 to n
public class FindDuplicate 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,3};
		
		System.out.println(duplicate(arr));
	}
	
	private static int duplicate(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<arr.length)
		{
			if(arr[i]!=i+1)
			{
				int correctIndex = arr[i]-1;
				
				if(arr[i]!=arr[correctIndex])  // when we try to place at correct index, if we get same ele
					                           // already present (==) then arr[i] it is duplicate
				{
					swap(i,correctIndex,arr);
				}
				else
				{
					return arr[i];  //if arr[correctIndex] value is equal to arr[i], it is duplicate
					                //because we already checked in outer if whether the element is 
				}					//placed at correct index or not. It comes inside if arr[i] is not 
									//placed at right index.
			}
			else {
				i++;
			}
		}
		
		return -1;
	}

	private static void swap(int currentIndex, int correctIndex, int[] arr) 
	{
		int temp = arr[currentIndex];
		arr[currentIndex] = arr[correctIndex];
		arr[correctIndex] = temp;
	}
}
 