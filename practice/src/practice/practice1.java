package practice;

import java.util.Arrays;

public class practice1 
{
	static String s="ABCDE";
	static int r=3;
	static char arr[]=s.toCharArray();
	
	public static void main(String[] args) 
	{
		String val=s.substring(0,r);
		char arr2[]=val.toCharArray();
		
		for(int i=r-1;i>0;i--)
		{
			char a=arr[0];
			char b=arr[i-1];
			for(int j=i;j<arr.length;j++)
			{
				System.out.println(a+""+b+""+arr[j]);
			}
		
		}
	}
}

