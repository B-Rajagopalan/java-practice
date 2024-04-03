package depthFirstSearch;

import java.util.ArrayList;

public class dfsMainClass 
{
	public static void main(String[] args) 
	{
		int n=4;
		ArrayList<ArrayList<Integer>> list=new ArrayList();
		
		for(int i=0;i<=n;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		list.get(0).add(1);
		list.get(0).add(2);
			
		list.get(2).add(3);
		list.get(2).add(4);
		
		dfs dfs=new dfs();
		System.out.println(dfs.depthFirst(n+1, list));
	}
}
