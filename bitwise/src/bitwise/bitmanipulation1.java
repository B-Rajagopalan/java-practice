package bitwise;
// change i th bit to 1
public class bitmanipulation1 
{
	public static void main(String[] args) 
	{
		System.out.println(ithbit(2,5));
	}

	private static int ithbit(int n, int bit) 
	{
		return n|(1<<(bit-1)); //---> Masking
		//here it gives the revised value after bit manipulation
	}
	
  // use bitwise OR for changing the given number n to another number  
  //according to the bit manipulation as it gives the bit value as it is when doing |1
}
