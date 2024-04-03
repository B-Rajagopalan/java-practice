package practice;

import java.util.Scanner;

public class practice1Mainclass 
{
	public static void main(String[] args) 
	{
		practice1 p=new practice1();
		p.head(5);
		
		p.display();
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Start value");
		int start=s.nextInt();
		System.out.println("Enter End value");
		int end=s.nextInt();
		
		p.trace(start, end);
		
		
	}
}
