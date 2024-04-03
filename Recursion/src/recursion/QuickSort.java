package recursion;
import java.util.*;

public class QuickSort {
    public static void main(String[] args) 
    {
        int[] arr = {1,5,9,4,2,7,0,7};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) 
    {
    	if(low>=high)
    		return;
    	
    	int s=low;
    	int e=high;
    	int pivot=nums[s+(e-s)/2]; //mid element
    	
    	while(s<=e)
    	{
    		while(nums[s]<pivot)
    			s++;
    		
    		while(nums[e]>pivot)
    			e--;
    		
    		if(s<=e)
    		{
    			int temp=nums[s];
    			nums[s]=nums[e];
    			nums[e]=temp;
    			s++;
    			e--;
    		}
    	}
    	
    	sort(nums,low,e);
    	sort(nums,s,high);
    }
}
