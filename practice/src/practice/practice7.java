package practice;
import java.util.*;

public class practice7 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,6,8,9};
		int[] arr2= {4,8,6,7,2,5};
		
		ArrayList<Integer> list = new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(list.contains(arr2[i]))
			{
				int index = list.indexOf(arr2[i]);
				arr[index]=0;
				arr2[i]=0;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
