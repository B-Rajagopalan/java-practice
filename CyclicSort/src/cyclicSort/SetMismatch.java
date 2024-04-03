package cyclicSort;
import java.util.Arrays;
//You have a set of integers s, which originally contains all the numbers from 1 to n.
//Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
//which results in repetition of one number and loss of another number.
//You are given an integer array nums representing the data status of this set after the error.
//Find the number that occurs twice and the number that is missing and return them in the form of an array
public class SetMismatch 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,2,4};
		
		System.out.println(Arrays.toString(mismatch(arr)));
	}

	private static int[] mismatch(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<arr.length)
		{
			int correctIndex = arr[i]-1;
			
			if(arr[i]!=arr[correctIndex])//arr[i] value may go above index
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
				return new int[] {arr[index],index+1};
			}
		}
		
		return new int[] {-1,-1};
	}

	private static void swap(int currentIndex, int correctIndex, int[] arr) 
	{
		int temp = arr[currentIndex];
		arr[currentIndex] = arr[correctIndex];
		arr[correctIndex] = temp;
	}
}
