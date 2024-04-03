package bitwise;
//find XOR values from 0 to n
public class xorValues 
{
	public static void main(String[] args) 
	{
		int n=8; // To find : 0^1^2^3^4....^n
		
		System.out.println(xorCalculation(n));
		//Use pen and paper and do XOR. You will observe a pattern
		// Pattern resets at 4 and multiples of 4
		// Answers we get 0^1 = 1 >>> 0^1^2 = 3 >>> 0^1^2^3 = 0 >>> 0^1^2^3^4 = 4
		// and repeats this pattern again and again.
		
		// we can observe that if n%4==0, then the answer is n itself
		// similarly if n%4==1, then the answer is 1
		// n%4==2, answer is n+1 and n%4==3, answer is 0
		//----------------------------------------------------------------
		
		//find XOR from a to b
		int a=3,b=9;
		//Total XOR of b and XOR it with XOR of a-1
		// Basically eliminating the XOR of a-1 in whole XOR b
		System.out.println(xorCalculation(b)^xorCalculation(a-1));
	}

	private static int xorCalculation(int n) 
	{
		if(n%4==0)
			return n;
		
		else if(n%4==1)
			return 1;
		
		else if(n%4==2)
			return n+1;
		
		else 
			return 0;
	}
}
