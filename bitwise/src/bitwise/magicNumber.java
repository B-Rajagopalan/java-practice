package bitwise;

public class magicNumber 
{
	public static void main(String[] args) 
	{
		int n=5;
		int count=1,sum=0;
		while(n>0)
		{
			int lastEle = n&1;
			sum+=lastEle*Math.pow(5, count++);
			n=n>>1;
		}
		
		System.out.println(sum);
	}
}

// Must calculate the power of n according to the position (ones, tens, hundreds etc..)
// And must calculate the power when its binary digit is 1 in that position