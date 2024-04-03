package practice;

public class practice3 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		int count=0,j=1,sum=0;
		int arr[]= {3,6,9,12};
		
		while(count<4)
		{
			for(int ele:arr)
			{
				if(j%ele==0)
				{
					flag=true;
					break;
				}
				else
					flag=false;
			}
		
			if(!flag)
			{
				sum=sum+j;
				count++;
			}
			
			j=j+1;
		}
		
		System.out.println(sum);
	}
}
