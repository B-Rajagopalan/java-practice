package practice;

import java.util.ArrayList;

public class detectingCycledfs 
{
	public static boolean detecting(int node,int parent,ArrayList<ArrayList<Integer>> adj, int[] vis)
	{
		vis[node]=1;
		
		for(int ele:adj.get(node))
		{
			if(vis[ele]==0)
			{
				if(detecting(ele,node,adj,vis)==true)
				{
					return true;
				}
			}
			
			else if(parent!=ele)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		
		for(int i=0;i<=7;i++)
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

		//single component of graph (single piece) // 1 is starting node
		//System.out.println(detecting(1,-1,list,vis));
		
		//multiple components
		for(int i=1;i<=7;i++)
		{
			if(vis[i]==0) {
			if(detecting(i,-1,list,vis)) { //-1 is parent(assume)
				System.out.println(true);
				break;
			}	
			}
		}
	}
}
