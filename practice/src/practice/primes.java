package practice;
// find min number of primes to make n. can use first m primes
import java.util.*;

public class primes 
{
	public static void main(String[] args) 
	{
		int n=20,m=10;
		int i=0,prime=2;
		List<Integer> list = new ArrayList<Integer>();
		
		if(n==1) {
			System.out.println("Invalid");
			System.exit(0);
		}
		while(i<m)
		{
			boolean isPrime=true;
			for(int j=2;j*j<=prime;j++)
			{
				if(prime%j==0)
					isPrime=false;		
			}
			//Breaking loop since we dont need larger prime than n
			if(prime>n)
				break;
			
			if(isPrime) 
			{
				list.add(prime);
				i++;
			}
			prime++;
		}

		System.out.println(list);
		int index=list.size()-1,count=0;
		
		while(n>0)
		{	
			//USING LIST
			int value = list.get(index);
			if(value<=n)
			{
				if(n-value!=1)
				{
					n=n-value;
					//Just printing the prime elements
					System.out.print(value+" ");
					count++;
				}
				else if(index-1<0) 
				{
					System.out.println("Combo not possible");
					System.exit(0);
				}
			}
			
			if(n-value==1 && index!=0 || n-value<0 && index!=0)
				index--;
		}
		System.out.println("\nElements Count = "+count);
	}
}
