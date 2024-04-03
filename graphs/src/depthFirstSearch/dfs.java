package depthFirstSearch;
import java.util.*;

public class dfs 
{	
	public ArrayList<Integer> depthFirst(int size,ArrayList<ArrayList<Integer>> adj)
	{
		ArrayList<Integer> finalList=new ArrayList<Integer>();
		boolean vis[]=new boolean[size];
		
		dfsProcess(0,adj,vis,finalList);
		
		return finalList;
	}
	
	public void dfsProcess(int node,ArrayList<ArrayList<Integer>> adj,boolean vis[],ArrayList<Integer> finalList)
	{
		vis[node]=true;
		finalList.add(node);
		
		for(int ele:adj.get(node))
		{
			if(!vis[ele])
				dfsProcess(ele,adj,vis,finalList);
		}
	}
}
