package practice;
import java.util.*;
//BFS //incomplete //Pairclass issue
public class findNearest1 
{
	public static void find(int arr[][],int vis[][],Queue q)
	{
		int delrow[]= {-1,0,+1,0};
		int delcol[]= {0,+1,0,-1};
		int n=arr.length;
		int m=arr[0].length;
		
		int[][] distance=new int[n][m];
		while(!q.isEmpty())
		{
			int row=q.peek().first.first();
			int col=q.peek().first.second(); //need to be revised 
			int dist=q.peek().second();
			distance[row][col]=dist;
			q.remove();
			for(int i=0;i<4;i++)
			{
				int nrow=row+delrow[i];
				int ncol=col+delcol[i];
				
				if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0)
				{
					vis[nrow][ncol]=1;
					q.add(nrow,ncol,dist+1);
				}
			}
		}
		
		System.out.println("//Print distance array");
	}
	
	
	public static void main(String[] args) 
	{
		int[][] arr=new int[3][3];
		int[][] vis=new int[3][3];
		arr[1][1]=1;
		arr[2][0]=1;
		
		Queue<Pair<Pair,Integer>,Integer> q=new LinkedList();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==1)
				{
					vis[i][j]=1;
					q.add(i,j,0);
				}
			}
		}
		
		find(arr,vis,q);
		
	}
}
