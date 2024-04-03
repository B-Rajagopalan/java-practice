package cyclicSort;
//numbers range 1 to n
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,2,3};
		
		System.out.println(duplicates(arr));
	}
	
	private static List<Integer> duplicates(int[] arr) {
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
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index+1)
			{
				list.add(arr[index]);
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
