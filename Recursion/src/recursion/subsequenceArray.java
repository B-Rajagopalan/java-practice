package recursion;

import java.util.ArrayList;

public class subsequenceArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		
		subSequences(new ArrayList<Integer>(),arr,0);
	}

	private static void subSequences(ArrayList<Integer> newList,int[] arr,int index) 
	{
		if(index==arr.length)
		{
			System.out.println(newList);
			return;
		}
		
		// picking and leaving of last element to form subsequences
		
		newList.add(arr[index]); // adding element
		subSequences(newList, arr, index+1);
		newList.remove(newList.size()-1);  //last element removal
		subSequences(newList, arr, index+1);
	}
}
