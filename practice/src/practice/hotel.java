package practice;
import java.util.*;

public class hotel 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int sum=0;
		int dosa=20,idly=5,poori=10;
		int loops=1;
		
		while(loops<=3)
		{
			System.out.println("Order Please!");
			System.out.println("1.Dosa\n2.Idly\n3.Poori\n4.No orders\n\t\tSelect anyone");
			int n=s.nextInt();
			
			switch(n)
			{
			case 1:
			{
				System.out.println("How many Dosa you want? ");
				int qty=s.nextInt();
				sum=sum+dosa*qty;
				
				loops++;
				break;
			}
			
			case 2:
			{
				System.out.println("How many Idly you want? ");
				int qty=s.nextInt();
				sum+=idly*qty;
				
				loops++;
				break;
			}
			
			case 3:
			{
				System.out.println("How many Poori you want? ");
				int qty=s.nextInt();
				sum+=poori*qty;
				
				loops++;
				break;
			}
		}
	}	
		s.close();
		System.out.println("Your total bill = "+sum);
	}
}
