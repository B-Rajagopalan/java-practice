package cyclicSort;

// number starts from 0 to n
public class FindMissingNumber 
{
	public static void main(String[] args) 
	{
		//{0,1,2}
		int[] arr = {1,3,0}; 
		//size is 3, Hence 0 occupied a space, the missing num is 3
		System.out.println(missingNumber(arr));
		
	}
	
	private static int missingNumber(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<arr.length)
		{
			int correctIndex = arr[i];
			
			if(arr[i]<arr.length && arr[i]!=arr[correctIndex])//value may go above index
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
			if(arr[index]!=index)
			{
				return index;
			}
		}
		
		return arr.length;
	}

	private static void swap(int currentIndex, int correctIndex, int[] arr) 
	{
		int temp = arr[currentIndex];
		arr[currentIndex] = arr[correctIndex];
		arr[correctIndex] = temp;
	}
}
