package bitwise;
// reset i th bit to 0
public class resetBit 
{
	public static void main(String[] args) 
	{
		System.out.println(ithbit(3,2));
	}

	private static int ithbit(int n, int bit) 
	{
		return n&(~(1<<(bit-1))); // Masking
	}
}
