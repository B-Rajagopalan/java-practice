public class MaxSubarraySum 
{
	public static void main(String[] args) 
	{
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4}; 
		String concat="",ans="";
		int sum=0,max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			concat+=arr[i]+" ";
			
			if(arr[i]>=sum) {
				sum=arr[i];
				concat=arr[i]+" ";
			}
						
//			if(sum<=0) {
//				sum=0;
//				concat="";
//			}

			if(sum>max) {
				max=sum;
				ans=concat;
			}
		}
		
		System.out.println(max+"\n"+ans);
	}
}
