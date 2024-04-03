package bitwise;

public class findLastSetBit 
{
	public static void main(String[] args) 
	{
		int n=10;
		
		System.out.println(n&(-n));
		
		//n AND -n gives the last set bit
		//10 AND -10 => 00001010 AND 11110110 => 10 (i.e) 2
		
		//NOTE : Take 2s compliment of n to get -n value in case of using pen and paper
	}
}
