package bitwise;
// find b power p
public class findPowerValue 
{
	public static void main(String[] args) 
	{
		int base=3;
		int power=6;
		int ans=1;
		
		while(power>0)
		{
			int bit = power&1;
			
			if(bit==1)
			{
				ans*=base;
			}
			
			base*=base;
			power=power>>1;
		}
		
		System.out.println(ans);
		
		//How binary of 6 (110) exactly matches the positions (2 exponentials) 
		// 3^4 (1) * 3^2 (1) * 3^1 (0)
		
		// When we carefully see, we are just splitting 6 as 4 and 2 which is the
		// part of converting binary to decimal (1 1 0 => 4+2+0 = 6)
		
		//Then we just made those separated values as exponentials of the base and multiplied
		// 3^4 * 3^2 = 3^6
	}
}	
