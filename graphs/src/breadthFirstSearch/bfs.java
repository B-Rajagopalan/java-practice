package breadthFirstSearch;

import java.util.*;

public class bfs 
{
	public ArrayList<Integer> breadthFirst(int size,ArrayList<ArrayList<Integer>> adj)
	{
		ArrayList <Integer> finalList=new ArrayList<Integer>();
		Queue<Integer> q=new LinkedList<Integer>();
		boolean vis[]=new boolean[size+1]; 
		
		q.add(0);
		vis[0]=true;
		
		while(!q.isEmpty())
		{
			Integer node= q.poll();
			finalList.add(node);
			
			for(Integer ele:adj.get(node))
			{
				if(!vis[ele])
				{
					vis[ele]=true;
					q.add(ele);
				}
			}
		}
		
		return finalList;
		
	}
	
}
