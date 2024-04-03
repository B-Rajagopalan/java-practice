package recursion;

import java.util.Arrays;

public class SudokuSolver 
{
	public static void main(String[] args) 
	{
		int[][] board = new int[][] {
			{3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
            };
        
        System.out.println("Before solving");
            
        for(int arr[] : board)
        {
        	System.out.println(Arrays.toString(arr));
        }
            System.out.println();
            
        System.out.println("After solving");
            
        if(solve(board))
        {
        	for(int arr[] : board)
        	{
        		System.out.println(Arrays.toString(arr));
        	}
        }
        
        else
        	System.out.println("Can't solve");
        	
	}

	private static boolean solve(int[][] board) 
	{
		int n = board.length;
		int row=-1;
		int col=-1;
		
		boolean emptyFound=false,check=false;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(board[i][j]==0)
				{
					row=i;
					col=j;
					emptyFound=true;
					break;
				}
			}
			
			if(emptyFound)
				break;
		}
		
		if(!emptyFound)  // no more 0's
			return true;
		
		for(int k=1;k<=9;k++)
		{
			if(isSafe(board, row, col, k))  //checks whether k can be placed there
			{
				check=true;
				board[row][col]=k;
				// check for backtracking
				// checking for future value can be placed or not
				// if it can't (false) then this value is also false
				// so backtracking occurs in else part
				// checking future here helps us to do backtracking 
				if(solve(board))    // if true returns true to itself (Sudoku solved)
				{
					return true;
				}
				else
				{
					board[row][col]=0; // backtracking because of future call returning false
				}
			}
		}
		
		return false; //when 1 to 9 can't be placed in that point. Return false
		// This creates backtracking for previous call
	}

	private static boolean isSafe(int[][] board, int row, int col, int k) 
	{
		//checking whether duplicates present in row
		for(int i=0;i<board.length;i++)
		{
			if(board[row][i]==k)
				return false;
		}
		
		for(int arr[]:board)
		{
			if(arr[col]==k)  // row iterates and col remains same
				return false;
		}
		
		int sqrRoot = (int) Math.sqrt(board.length);
		int rowStart = row - row%sqrRoot;
		int colStart = col - col%sqrRoot;
		
		for(int i=rowStart;i<rowStart+sqrRoot;i++) // i limit is sqrRoot distance from rowStart
		{
			for(int j=colStart;j<colStart+sqrRoot;j++) //similar to i
			{
				if(board[i][j]==k)
					return false;
			}
		}
		
		return true;
	}
}
