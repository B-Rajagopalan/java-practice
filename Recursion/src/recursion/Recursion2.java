package recursion;
// Find if the array is sorted or not (ascending)
public class Recursion2 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,4,3,5};
		
		//my approach
		checkSorted(arr);
		
		//best approach
		System.out.println(bestCheckSorted(arr,0));
	}

	static void checkSorted(int[] arr)
	{
		boolean flag=true;
		flag=helperFunction(0,1,arr,flag);
		System.out.println(flag);
	}

	static boolean helperFunction(int i, int j, int[] arr, boolean flag) 
	{
		if(!flag || j==arr.length-1)
			return flag;
		
		if(arr[i]>arr[j])
			flag=false;
		
		return helperFunction(++i,++j,arr,flag);
	}
	
	static boolean bestCheckSorted(int[] arr,int index) 
	{
		if(index==arr.length-1)
			return true;
		
		return arr[index]<arr[index+1] && bestCheckSorted(arr,index+1);
		
	}
}
