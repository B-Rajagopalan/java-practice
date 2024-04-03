package recursion;

import java.util.Arrays;

public class printingAllPaths 
{
	public static void main(String[] args) 
	{
		boolean[][] arr = new boolean[3][3];
		
		int[][] pathArray = new int[3][3];
		
		//allPath("",arr,0,0);
		
		//allPathInString("",arr,0,0,1);
		
		allPathInMatrix(pathArray,arr,0,0,1);
	}

	//printing path 1 to n in String
	private static void allPathInString(String path, boolean[][] arr, int r, int c, int level) 
	{
		if(r==arr.length-1 && c==arr[0].length-1)
		{
			System.out.println(path+level);
			path="";
			return;
		}

		if(arr[r][c]) 
			return;    //returning call when the element is already visited
		
		arr[r][c]=true; // mark visited so that stackoverflow doesn't occur
		// means previous element is not revisited
		
		if(r<arr.length-1)
			allPathInString(path+level, arr, r+1, c, level+1);
		
		if(c<arr[0].length-1)
			allPathInString(path+level, arr, r, c+1, level+1);
		
		if(r>0)
			allPathInString(path+level, arr, r-1, c, level+1);
		
		if(c>0)
			allPathInString(path+level, arr, r, c-1, level+1);
		
		arr[r][c]=false; //backtracking
		
	}
	
	//printing 1 to n path in matrix
	private static void allPathInMatrix(int[][] pathArray, boolean[][] arr, int r, int c, int level) 
	{
		if(r==arr.length-1 && c==arr[0].length-1)
		{
			pathArray[r][c]=level;
			
			for(int[] row:pathArray)
			{
				System.out.println(Arrays.toString(row));
			}
			
			System.out.println();
			
			return;
		}

		if(arr[r][c]) 
			return;    //returning call when the element is already visited
		
		arr[r][c]=true; // mark visited so that stackoverflow doesn't occur
		// means previous element is not revisited
		
		pathArray[r][c]=level;
		
		if(r<arr.length-1)
			allPathInMatrix(pathArray, arr, r+1, c, level+1);
		
		if(c<arr[0].length-1)
			allPathInMatrix(pathArray, arr, r, c+1, level+1);
		
		if(r>0)
			allPathInMatrix(pathArray, arr, r-1, c, level+1);
		
		if(c>0)
			allPathInMatrix(pathArray, arr, r, c-1, level+1);
		
		arr[r][c]=false; //backtracking
		
		pathArray[r][c]=0;
		
	}

	private static void allPath(String path, boolean[][] arr, int r, int c) 
	{
		if(r==arr.length-1 && c==arr[0].length-1)
		{
			System.out.println(path);
			return;
		}
		
		if(arr[r][c]) 
			return;    //returning call when the element is already visited
		
		arr[r][c]=true; // mark visited so that stackoverflow doesn't occur
		
		if(r<arr.length-1)
			allPath(path+"D", arr, r+1, c);
		
		if(c<arr[0].length-1)
			allPath(path+"R", arr, r, c+1);
		
		if(r>0)
			allPath(path+"U", arr, r-1, c);
		
		if(c>0)
			allPath(path+"L", arr, r, c-1);
		
		arr[r][c]=false; //backtracking
			
	}
}
