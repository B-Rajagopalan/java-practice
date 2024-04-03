package practice;
import java.util.*;

public class noofProvinces 
{
	public static void dfs(int node,int[] vis,ArrayList<ArrayList<Integer>> adj)
	{
		vis[node]=1;
		
		for(int ele:adj.get(node))
		{
			if(vis[ele]==0)
			{
				dfs(ele,vis,adj);
			}
		}
	}
	
	public static void provinces(int[][] arr,int n)
	{
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		
		for(int i=0;i<=n;i++)
			adj.add(new ArrayList<Integer>());
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]==1 && i!=j)
				{
					adj.get(i).add(j);
					adj.get(j).add(i);
				}
			}
		}
		
		int vis[]=new int[n+1];
		int count=0;
		
		for(int i=1;i<n;i++) 
		{
			if(vis[i]==0)
			{
				count++;
				dfs(i,vis,adj);
			}	
		}
		
		System.out.println(count);
	}
	
	
	public static void main(String[] args) 
	{
		int n=8;
		
		int[][] arr=new int[n+1][n+1];
		
		arr[1][2]=1;
		arr[2][1]=1;
		
		arr[3][2]=1;
		arr[2][3]=1;
		
		arr[5][6]=1;
		arr[6][5]=1;
		
		arr[4][5]=1;
		arr[5][4]=1;
		
		arr[7][8]=1;
		arr[8][7]=1;
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr.length;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		provinces(arr,n);
	}
}

