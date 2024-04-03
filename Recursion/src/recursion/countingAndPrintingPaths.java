package recursion;

import java.util.ArrayList;

public class countingAndPrintingPaths 
{
	public static void main(String[] args) 
	{
		// 3 2 1
		// 2
		// 1
		//System.out.println(countingPath(3,3));
		
		//System.out.println(printingPath("",3,3));
		
		//printingPathDiagonal("",3,3);
		
		boolean arr[][] = new boolean[3][3];
		arr[1][1]=true; 
		pathRestrictions("",arr,0,0);

	}

	private static void pathRestrictions(String path, boolean[][] arr, int r, int c) 
	{
		if(r==arr.length-1 && c==arr[0].length-1)
		{
			System.out.println(path);
			return;
		}
		// if true it is a obstacle, so skip the path
		if(arr[r][c])
			return;
		
		if(r<arr.length-1)
			pathRestrictions(path+"D", arr, r+1, c);
		
		if(c<arr[0].length-1)
			pathRestrictions(path+"R", arr, r, c+1);
	}

	private static void printingPathDiagonal(String path, int r, int c) 
	{
		if(r==1 && c==1)
		{
			System.out.println(path);
			return;
		}
		
		if(r>1)
			printingPathDiagonal(path+"D", r-1, c);
		
		if(c>1)
			printingPathDiagonal(path+"R", r, c-1);
		
		if(r>1 && c>1)
			printingPathDiagonal(path+"d", r-1, c-1); // small letter d indicates diagonal
		
	}

	private static ArrayList<String> printingPath(String path,int r, int c) 
	{
		if(r==1 && c==1)
		{
			System.out.println(path);
			ArrayList<String> list = new ArrayList<String>();
			list.add(path);
			return list;
		}
		
		ArrayList<String> recursiveList = new ArrayList<String>();
		
		if(r>1)
			recursiveList.addAll(printingPath(path+"D",r-1,c));
		
		if(c>1)
			recursiveList.addAll(printingPath(path+"R",r,c-1));
		
		return recursiveList;
		
	}

	private static int countingPath(int r, int c) 
	{
		//return 1 when last col/row is reached
		if(r==1 || c==1)
			return 1;
		
		//Reducing row and col for each call till last row/col is reached 
		return countingPath(r-1, c)+countingPath(r, c-1);
		
	}
}
