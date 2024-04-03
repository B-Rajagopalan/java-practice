package practice;

public class practice4 
{
	public static void main(String[] args) 
	{
		float [] arr= new float[] {40.00f,20.00f};
		
		System.out.println(cumulativeDiscount(arr));
	}
	
	public static float cumulativeDiscount(float[] arr)
	{
		float amount=100;
		
		for(int i=0;i<arr.length;i++)
		{
			amount=amount*(100-arr[i])/100;
		}
		
		amount=100-(amount*100/100);
		
		return amount;
	}
}

