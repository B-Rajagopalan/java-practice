package recursion;
import java.util.Arrays;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,4,7,5,3,6};
		selection(arr,arr.length-1,0,0);
		System.out.println(Arrays.toString(arr));
	}

	private static void selection(int[] arr, int r, int c, int max) 
	{
		if(r==0)
			return;
		
		if(c<=r)
		{
			if(arr[c]>arr[max])
				max=c;
			
			selection(arr, r, c+1, max);
		}
		else 
		{
			int temp=arr[r];
			arr[r]=arr[max];
			arr[max]=temp;
		
			selection(arr, r-1, 0, 0);
		}
	}
}
