package recursion;

import java.util.Arrays;

public class NQueens 
{
	public static void main(String[] args) 
	{
		int n=4;
		boolean[][] arr = new boolean[n][n];
		//queen goes up, down and diagonals
		System.out.println(queens(arr,0));
		//true == Queen
	}

	private static int queens(boolean[][] arr, int r) 
	{
		if(r==arr.length)
		{
			for(boolean[] row:arr)
			{
				System.out.println(Arrays.toString(row));
			}
			
			System.out.println();
			return 1;
		}
		
		int count = 0;
		
		for(int c=0;c<arr.length;c++)
		{
			if(isSafe(r,c,arr))
			{
				arr[r][c]=true;
				count+=queens(arr, r+1);
				arr[r][c]=false;
			}
		}
		
		return count;
	}
	
	private static boolean isSafe(int r,int c,boolean[][] arr)
	{
		// straight up
		for(int i=r;i>=0;i--)
		{
			if(arr[i][c])
				return false;
		}
		// left upper diagonal
		for(int i=1;i<=Math.min(c, r);i++)
		{
			if(arr[r-i][c-i])
				return false;
		}
		//right upper diagonal
		for(int i=1;i<=Math.min(arr.length-1-c, r);i++)
		{
			if(arr[r-i][c+i])
				return false;
		}
		
		return true;
		
		//checking only up's because it only decides whether it
		//gets cancelled or not when placed in that [row][col]
		
		//if any previous diagonal or row(straight up) have queen in it.
		//Current call can't place the queen in that position
	}
}
