package bitwise;
//find i th bit
public class findbit 
{
	public static void main(String[] args) 
	{
		System.out.println(ithBit(10,5));
	}

	private static int ithBit(int n,int bit) 
	{
		return n&(1<<(bit-1)); // Masking
		// may not work for some values because some times it has value 1 in bit values
		// beyond the i th bit, especially if given number is negative
	}
	
	
	// use bitwise AND to find particular number in the binary digits
		// as it eliminates all other values in bit when & with 0
}
