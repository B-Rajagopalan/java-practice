package recursion;

import java.util.Arrays;

public class Nknights 
{
	public static void main(String[] args) 
	{
		int n=3;
		boolean arr[][] = new boolean[n][n];
		 // it moves L shape in chess
		System.out.println(knights(arr,0,0,n));
	}

	private static int knights(boolean[][] arr, int r, int c, int knight) 
	{
		if(knight==0)
		{
			for(boolean[] row:arr)
			{
				System.out.println(Arrays.toString(row));
			}
			System.out.println("---------------------");
			
			return 1;
		}
		
		if(r==arr.length-1 && c==arr.length) //when reached last element of matrix 
		{
			return 0;
		}
		
		int count = 0;
		
		if(c==arr.length)  //when c reached the end of its size
		{
			count+=knights(arr, r+1, 0, knight);
			return count;
		}
		
		if(isSafe(arr,r,c))
		{
			arr[r][c] = true;
			count+=knights(arr, r, c+1, knight-1);
			arr[r][c] = false;
		}
		
		count+=knights(arr, r, c+1, knight);
		
		return count;
	}

	private static boolean isSafe(boolean[][] arr, int r, int c) 
	{
		if(isValid(r-2,c-1,arr))
		{
			if(arr[r-2][c-1])
				return false;
		}
		
		if(isValid(r-2,c+1,arr))
		{
			if(arr[r-2][c+1])
				return false;
		}
		
		if(isValid(r-1,c-2,arr))
		{
			if(arr[r-1][c-2])
				return false;
		}
		
		if(isValid(r-1,c+2,arr))
		{
			if(arr[r-1][c+2])
				return false;
		}
		return true;
	}
	//validation for whether r and c inside matrix
	private static boolean isValid(int r, int c, boolean[][] arr) 
	{
		if(r>=0 && r<arr.length && c>=0 && c<arr.length)
			return true;
		
		return false;
	}
}
