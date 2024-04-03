package practice;

public class practice11 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int length = Integer.toString(num).length();
		boolean flag = true;
		
		for(int i=0;i<length-1;i++)
		{
			int endValue = num%10;
			endValue = (int) (endValue * Math.pow(10, length-1));
			num = (num/10) + endValue;
			
			if(!isPrime(num))
			{
				flag = false;
				break;
			}
		}
		
		//Prints false even one of the combinations is not a Prime
		System.out.println(flag);
	}

	private static boolean isPrime(int num) 
	{
		if(num<=1)
			return true;
		
		for(int i=2;i*i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}
