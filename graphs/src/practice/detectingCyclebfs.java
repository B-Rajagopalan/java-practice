package practice;
import java.util.*;

import javafx.util.Pair;
// Incomplete
public class detectingCyclebfs 
{
	
	public static boolean detecting(int n, ArrayList<ArrayList<Integer>> adj,int vis[])
	{
		Queue<Pair> q=new LinkedList();
		vis=new int[n+1];
		vis[1]=1;
		q.add(new Pair(1,-1));
		
		while(!q.isEmpty())
		{
			int node=q.peek().first();
			int parent=q.peek().second();
			
			for(int ele:adj.get(node))
			{
				if(vis[ele]==0)
				{
					vis[ele]=1;
					q.add(new Pair(ele,node));
				}
				else if(parent!=ele)
				{
					return true;
				}
			}
		}
		
		return false;
		
	}

	
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		
		for(int i=1;i<=7;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		list.get(1).add(2);
		list.get(1).add(3);
		list.get(2).add(1);
		list.get(2).add(5);
		list.get(3).add(1);
		list.get(3).add(4);
		list.get(3).add(6);
		list.get(4).add(3);
		list.get(5).add(2);
		list.get(5).add(7);
		list.get(6).add(3);
		list.get(6).add(7);
		list.get(7).add(5);
		list.get(7).add(6);
		
		int [] vis= new int[7+1];
		
		//single component of graph (single piece)
		//System.out.println(detecting(7,list,vis)); //7 is size (nodes)
		
		//incase of multiple components
		for(int i=1;i<=7;i++)
		{
			if(detecting(7,list,vis))
				System.out.println(true);
		}
	}
}
