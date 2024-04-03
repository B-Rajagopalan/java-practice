package practice;

public class practice6 
{
	public static void main(String[] args) 
	{
		int count=0;
		int number=121;
		
		for(int i=11;i<number;i++)
		{
			int val=i,rem=0,rev=0;
			
			while(val>0)
			{
				rem=val%10;
				rev=rev*10+rem;
				val=val/10;
			}
				
			if(rev==i)
				count++;
				
			if(count==10)
			{
				System.out.println(i);
				break;
			}
		}
		
		if(count<10)
			System.out.println("10th element cant be reached");
	}
}
