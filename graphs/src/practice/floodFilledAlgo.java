package practice;

public class floodFilledAlgo 
{
	//depthFirstAlgorithm
	public static char[][] floodFilled(int row,int col,char arr[][],char initClr,char newClr)
	{
		arr[row][col]=newClr;
		int[] delrow= {-1,0,+1,0};
		int[] delcol= {0,+1,0,-1};
		int n=arr.length,m=arr[0].length;
		
		for(int i=0;i<4;i++)
		{
			int nrow=row+delrow[i];
			int ncol=col+delcol[i];
			
			if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && arr[nrow][ncol]==initClr && arr[nrow][ncol]!=newClr)
			{
				floodFilled(nrow,ncol,arr,initClr,newClr);
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) 
	{
		int row=0,col=1;
		char newClr='2';
		int n=5,m=4;
		char[][] arr=new char[n][m];
		
		arr[0][1]='1';
		
		arr[0][2]='1';
		
		arr[1][1]='1';
		
		arr[1][2]='1';
		
		arr[2][2]='1';

		arr[4][0]='1';
		
		arr[4][1]='1';
		
		arr[4][3]='1';
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]=='\0')
					arr[i][j]='0';
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		char initialColor=arr[row][col];
		
		floodFilled(row,col,arr,initialColor,newClr);
		
		System.out.println("---------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
