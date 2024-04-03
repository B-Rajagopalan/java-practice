package practice;
import java.util.*;

import javafx.util.*;
//Incomplete
public class noOfIslands 
{
	public static void bfs(int i, int j, int[][] vis,char[][] arr)
	{
		vis[i][j]=1;
		int n=arr.length;
		int m=arr[0].length;
		
		Queue q=new LinkedList();
		//cannot implement Pair
		q.add(new Pair(i,j));
		
		while(!q.isEmpty()) 
		{
			int row=q.peek().first();
			int col=q.peek().second();
			q.remove();
			
			for(int delrow=-1;delrow<=1;delrow++)
			{
				for(int delcol=-1;delcol<=1;delcol++)
				{
					int nrow=row+delrow;
					int ncol=col+delcol;
					
					if(vis[nrow][ncol]==0 && arr[nrow][ncol]=='1' && (nrow<n && nrow>=0) && (ncol<m && ncol>=0))
					{
						vis[nrow][ncol]=1;
						q.add(new Pair(nrow,ncol));
					}
				}
			}
		}
	}
	
	public static int noofIslands(int n,int m,char arr[][])
	{
		int count=0;
		int vis[][]=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(vis[i][j]==0 && arr[i][j]=='1')
				{
					count++;
					bfs(i,j,vis,arr);
				}
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) 
	{
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
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println(noofIslands(n,m,arr));
	}
}
