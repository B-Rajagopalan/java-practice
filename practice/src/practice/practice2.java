package practice;

public class practice2 
{
	static int arr[]= {-1,0,1,2,-1,-4};
	static int flag=0;
	
	public static void main(String[] args) 
	{
		for(int i=0;i<arr.length-2;i++)
		{
			flag=i;
			process(arr[i]);
		}
	}
	
	public static void process(int value)
	{
		process(value,arr[++flag],++flag);
		
		if(arr.length==flag)
			return;
		
		flag=flag-1;
		process(value);	
	}
	
	public static void process(int eleOne,int eleTwo,int eleThreeIndex)
	{
		if(eleThreeIndex==arr.length)
			return; 
		
		int sum=eleOne+eleTwo+arr[eleThreeIndex];
		
		if(sum==0)
			System.out.println("["+eleOne+","+eleTwo+","+arr[eleThreeIndex]+"]");
		
		process(eleOne,eleTwo,++eleThreeIndex);
	}
}
