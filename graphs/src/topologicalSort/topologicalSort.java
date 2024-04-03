package topologicalSort;
import java.util.*;

public class topologicalSort 
{
	public static Stack<Integer> topodfs(ArrayList<ArrayList<Integer>> adj,Stack<Integer> s,int node,
			int[] vis)
	{
		vis[node]=1;
		
		for(Integer n:adj.get(node))
		{
			if(vis[n]==0)
				topodfs(adj,s,n,vis);
		}
		
		s.push(node);
		
		return s;
	}
	
	public static ArrayList<Integer> topobfs(ArrayList<ArrayList<Integer>> adj,int size)
	{
		//Kahn's Algorithm
		ArrayList<Integer> topo = new ArrayList<>();
		int[] parents=new int[size];
		
		for(int i=0;i<size;i++)
		{
			for(Integer n:adj.get(i))
			{
				parents[n]++;
			}
		}
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		for(int i=0;i<size;i++)
		{
			if(parents[i]==0)
				q.add(i);
		}
		
		while(!q.isEmpty())
		{
			int node=q.peek();
			topo.add(node);
			q.remove();
			
			for(Integer n:adj.get(node))
			{
				parents[n]--;
				if(parents[n]==0)
					q.add(n);
			}
		}
		
		return topo;
	}
	
	public static void main(String[] args) 
	{
		int size=4;
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		
		for(int i=0;i<size;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		list.get(0).add(1);
		list.get(1).add(2);
		list.get(2).add(3);
		
		//BFS
		System.out.println("BFS = "+topobfs(list,size));
		
		//DFS
		Stack<Integer> s=new Stack<Integer>();
		int[] vis=new int[size];
		
		for(int i=0;i<size;i++)
		{
			if(vis[i]==0)
				s=topodfs(list,s,i,vis);
		}
		
		ArrayList<Integer> ansList = new ArrayList<>();
		
		while(!s.isEmpty())
		{
			ansList.add(s.pop());
		}
		
		System.out.println("DFS = "+ansList);
		
	}
}
