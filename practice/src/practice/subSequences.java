package practice;
//wrong
import java.util.ArrayList;
import java.util.Arrays;

public class subSequences 
{
	public static void main(String[] args) 
	{
		int arr[]= {3,2,1,6,8};
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		if(arr.length>1)
			System.out.println(Arrays.toString(arr));
		
		process(0, list, arr);
		
	}
	
	static void process(int index,ArrayList<Integer> list,int[] arr)
	{
		if(index>arr.length-1)
		{
			System.out.println("[]");
			return;
		}
		
		list.add(arr[index]);
		
	    System.out.println(Arrays.asList(arr[index]));
	    
		process(index+1, list, arr);
		
		if(arr.length>2)
		{
			list.remove(index);
			System.out.println(list);
			list.add(index, arr[index]);
		}
	}

	/*
	 if(s<e)
		{
			//System.out.println(s+"--->"+e);
			int mid=s+(e-s)/2;
	     	System.out.println(Arrays.asList(arr[mid]));
			list.removeAll(list);
			
			for(int i=0;i<mid;i++)
			{
				list.add(arr[i]);
			}
			
			System.out.println(list);
			list.removeAll(list);
			
			for(int j=mid;j<arr.length;j++)
			{
				list.add(arr[j]);
			}
			
			System.out.println(list);
			
			process(mid+1, e, list, arr);
			process(s, mid-1, list, arr);
		}
	 */
}
