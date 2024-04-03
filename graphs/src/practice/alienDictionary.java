package practice;
import java.util.*;

public class alienDictionary 
{
	public static List<Character> alienDic(ArrayList<ArrayList<Integer>> adj,int N)
	{
		int[] indegree=new int[N];
		
		for(int i=0;i<N;i++)
		{
			for(int ele:adj.get(i))
			{
				indegree[ele]++;
			}
		}
		
		Queue<Integer> q=new LinkedList<>();
		List<Character> topoList=new ArrayList<>();
		
		for(int i=0;i<N;i++)
		{
			if(indegree[i]==0)
				q.add(i);
		}
		
		while(!q.isEmpty())
		{
			int node=q.peek();
			topoList.add((char) (node+'a'));
			q.remove();
			
			for(Integer ele:adj.get(node))
			{
				indegree[ele]--;
				
				if(indegree[ele]==0)
					q.add(ele);
			}
		}
		
		return (topoList);
	}
	
	public static void main(String[] args) 
	{
		int n=4;
		String arr[]= {"baa","abcd","abca","cab","cad"};
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
				
		for(int i=0;i<n;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			String eleOne=arr[i];
			String eleTwo=arr[i+1];
			
			int len=Math.min(eleOne.length(), eleTwo.length());
			
			for(int j=0;j<len;j++)
			{
				if(eleOne.charAt(j)!=eleTwo.charAt(j))
				{
					list.get(eleOne.charAt(j)-'a').add(eleTwo.charAt(j)-'a');
					break;
				}
			}
		}
		
		System.out.println(alienDic(list,n));
	}
}
