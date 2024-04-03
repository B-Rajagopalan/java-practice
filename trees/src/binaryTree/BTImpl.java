package binaryTree;
import java.util.*;

public class BTImpl 
{
	private class Node
	{
		private Node left;
		private Node right;
		int value;
		
		public Node(Node left, Node right, int value) {
			super();
			this.left = left;
			this.right = right;
			this.value = value;
		}
		
		public Node(int value)
		{
			this.value=value;
		}
	}
	
	private Node root;
	
	public void populate(Scanner scanner)
	{
		System.out.println("Enter the root node ");
		int value=scanner.nextInt();
		root=new Node(value);
		populate(scanner,root);
	}
	
	public void populate(Scanner scanner, Node node)
	{
		System.out.println("Do you want to enter left node of "+node.value);
		boolean left=scanner.nextBoolean();
		
		if(left)
		{
			System.out.println("Enter the value ");
			int value=scanner.nextInt();
			node.left=new Node(value);
			populate(scanner,node.left);
		}
		
		System.out.println("Do you want to enter right node of "+node.value);
		boolean right=scanner.nextBoolean();
		
		if(right)
		{
			System.out.println("Enter the value ");
			int value=scanner.nextInt();
			node.right=new Node(value);
			populate(scanner,node.right);
		}	
	}
	
	public void display()
	{
		display(root," ");
		System.out.println();
		displayClear(root,0);
	}
	
	public void display(Node node,String indent)
	{
		if(node==null)
		{
			return;
		}
		
		System.out.println(indent+node.value);
		
		display(node.left,indent+"\t");
		display(node.right,indent+"\t");
	}
	

	public void displayClear(Node node,int level)
	{
		if(node==null)
		{
			return;
		}
		
		displayClear(node.right,level+1);
		
		if(node!=root)
		{
			for(int i=0;i<level-1;i++)
			{
				System.out.print("|\t");
			}
			System.out.println("|------>"+node.value);
		}
		else
			System.out.println(node.value);
		
		displayClear(node.left,level+1);	
	}
}
