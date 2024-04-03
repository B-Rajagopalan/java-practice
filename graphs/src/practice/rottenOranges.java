package practice;
import javafx.util.*;
import java.util.LinkedList;
import java.util.Queue;

//INCOMPLETE
public class rottenOranges 
{
	static int vis[][]=new int[3][3];
	static int rottencount=0;
	static int tm=0;
	//breadthFirstAlgorithm
	public static void rottenOrange(Queue q,int rotten,int fresh,int arr[][])
	{
		int delrow[]= {-1,0,+1,0};
		int delcol[]= {0,+1,0,-1};
		int n=arr.length;
		int m=arr[0].length; 
	
		
		while(!q.isEmpty()) {
		int r=q.peek().row;
		int c=q.peek().col;
		int t=q.peek().tm;
		int tm=Math.max(tm, t);
		q.remove();
		for(int i=0;i<4;i++)
		{
			int nrow=r+delrow[i];
			int ncol=c+delcol[i];
			
			if(arr[nrow][ncol]==fresh && nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]!=rotten)
			{
				vis[nrow][ncol]=rotten;
				q.add(new Pair(nrow,ncol,t+1));
				rottencount++;
			}
		}
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		int n=3,m=3;
		int rotten=2,fresh=1;
		int[][] arr=new int[n][m];
		
		arr[0][1]=1;
		arr[1][1]=1;
		arr[2][1]=1;
		arr[2][0]=2;
		arr[0][2]=2;
		arr[1][2]=1;
		arr[2][2]=1;
		
		Queue<Pair> q=new LinkedList();
		int freshcount=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]==2)
				{
					q.add(new Pair(i,j,0));
					vis[i][j]=2;
				}
				
				if(arr[i][j]==1)
					freshcount++;
			}
		}
		
		rottenOrange(q,rotten,fresh,arr);
		
		if(freshcount!=rottencount)
			System.out.println(-1);
		else
			System.out.println(tm);
	}
}
