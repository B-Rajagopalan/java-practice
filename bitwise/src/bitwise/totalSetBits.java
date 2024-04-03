package bitwise;
// find total set bits in given n
public class totalSetBits 
{
	public static void main(String[] args) 
	{
		// There are three methods to find total set bit
		int n=197;
		//First Method
		System.out.println(totalSetBits1(n));
		
		//Second Method
		System.out.println(totalSetBits2(n));
		
		//Third Method
		System.out.println(totalSetBits3(n));
		
		//Check by adding 1s in binary representation
		System.out.println(Integer.toBinaryString(n));
	}

	private static int totalSetBits3(int n) 
	{
		int count=0;
		while(n>0)
		{
			n=n&(n-1);
			count++;
		}
		return count;
	}

	private static int totalSetBits2(int n) 
	{
		int count=0;
		while(n>0)
		{
			n=n-(n&(-n));
			count++;
		}
		return count;
	}

	private static int totalSetBits1(int n) 
	{
		int count=0;
		while(n>0)
		{
			if((n&1)==1)
				count++;
			n=n>>1;
		}
		
		return count; 
		//Total number of 1s indicates the total set bits
	}
}
