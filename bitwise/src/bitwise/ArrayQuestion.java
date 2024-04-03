package bitwise;

import java.util.Arrays;

//reverse the row and invert the value, if 0 -> 1 and if 1 -> 0
public class ArrayQuestion 
{
	public static void main(String[] args) 
	{
		int [][] arr= {{1,0,0},{1,0,1},{0,1,1}};
		
		for(int[] row:arr)
		{
			for(int i=0;i<=row.length/2;i++)
			{
				int temp=row[i]^1; //XOR with 1
				row[i]=row[row.length-1-i]^1;
				row[row.length-1-i]=temp;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
}
