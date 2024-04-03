package bitwise;
// find n is power of 2 or not
public class powerof2 
{
	public static void main(String[] args) 
	{
		
		System.out.println(powerOf2Best(4));
	}

	private static boolean powerOf2Best(int n) 
	{
		if(n==0)
			return false;
		
		return (n&n-1)==0; // 4 & 3
		//binary value of 4 is 100 and binary value of 3 is 11(common for all power of 2s)
		// 100 & 011 = 0
	}
}
