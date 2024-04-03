package bitwise;
//note : number occurs twice only one number occur once
public class findunique 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,2,3,1,3,4,6,4};
		unique(arr);
	}

	private static void unique(int[] arr) 
	{
		int find=0;
		for(int i=0;i<arr.length;i++)
		{
			find=find^arr[i];
		}
		
		System.out.println(find);
	}
}
