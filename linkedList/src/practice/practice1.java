package practice;
import java.util.*;

public class practice1 
{
	static int count=0;
	static boolean st=false;
	static boolean ed=false;
	private class Node
	{
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value, Node left, Node right) {
			super();
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
		public Node(int value)
		{
			this.value=value;
		}
	}
	
	private Node root;
	
	public void head(int value)
	{
		root=new Node(value);
		insert(new Scanner(System.in),root);
	}
	
	private void insert(Scanner sc,Node node)
	{
		System.out.println("Want to insert node in left of "+node.value);
		boolean left=sc.nextBoolean();
		if(left) {
		System.out.println("Enter node value");
		int lvalue=sc.nextInt();
		node.left=new Node(lvalue);
		count++;
		insert(sc,node.left);
		}
		
		System.out.println("Want to insert node in right of "+node.value);
		boolean right=sc.nextBoolean();
		if(right) {
		System.out.println("Enter node value");
		int rvalue=sc.nextInt();
		node.right=new Node(rvalue);
		count++;
		insert(sc,node.right);
		}
	}
	
	public void display()
	{
		prettyDisplay(root,0);
	}
	
	private void prettyDisplay(Node node, int level)
	{
		if(node==null)
			return;
		
		prettyDisplay(node.right,level+1);
		
		if(node!=root)
		{
			for(int i=0;i<level-1;i++)
			{
				System.out.print("|\t");
			}
			
			System.out.println("|------>"+node.value);
		}
		else
		{
			System.out.println(node.value);
		}
		
		prettyDisplay(node.left,level+1);
	}
	
	public void trace(int start, int end)
	{
		trace(start,end,root,new int[count+1],'\0');
	}
	
	private void trace(int start,int end,Node node,int vis[],char dir)
	{
		if(node==null)
			return;
		
		vis[node.value]=1;
		
		trace(start,end,node.left,vis,'L');
		
		if(node.value==start && !st)
		{
			st=true;
			int rightCount=0;
			for(int i=0;i<vis.length;i++)
			{
				if(vis[i]==1)
					rightCount++;
			}
		}
		
		if(node.value==end && !ed)
		{
			ed=true;
			int leftCount=0;
			for(int i=0;i<vis.length;i++)
			{
				if(vis[i]==1)
					leftCount++;
			}
		}
		
		trace(start,end,node.right,vis,'R');
		
	}
}
