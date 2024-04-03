package com.prac;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		int[] b= {2,3,5,6};
		int[] c=new int[a.length + b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
		}
		for (int j = 0; j < b.length; j++) 
		{
			c[index++]=b[j];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		
		
	}

}
