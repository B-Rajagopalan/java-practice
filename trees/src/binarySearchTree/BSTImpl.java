package binarySearchTree;

public class BSTImpl 
{
	private class Node
	{
		private int value;
		private int height;
		private Node left;
		private Node right;
		
		public Node(int value)
		{
			this.value=value;
		}
		
		public int getValue()
		{
			return value;
		}
	}
	
	private Node root;
	
	public int height(Node node)
	{
		if(node==null)
			return -1;
		return node.height;
	}
	
	public void shootSortedElements()
	{
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		shootSortedElements(arr,0,arr.length);
	}
	
	public void shootSortedElements(int[] arr,int start,int end)
	{
		if(start>=end)
			return;
		
		int mid=(start+end)/2;
		insert(arr[mid]);
		
		shootSortedElements(arr,start,mid);
		shootSortedElements(arr,mid+1,end);
	}
	
	public void shootElements()
	{
		int arr[]=new int[] {4,8,6,3,5,9,7};
		
		for(int i=0;i<arr.length;i++)
			insert(arr[i]);
	}
	
	public void insert(int value)
	{
		root=insert(value,root);
	}
	
	public Node insert(int value, Node node)
	{
		if(node==null)
		{
			node=new Node(value);
			return node;
		}
		
		if(value<node.value)
			node.left=insert(value,node.left);
		
		if(value>node.value)
			node.right=insert(value,node.right);
		
		node.height=Math.max(height(node.left), height(node.right))+1;
		
		return node;
	}
	
	public String balanced() 
	{
		if(balanced(root))
			return "balanced";
		return "unbalanced";
	}
	
	public boolean balanced(Node node)
	{
		if(node==null)
			return true;
		
		return Math.abs(height(node.left)-height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
	}
	
	public void prettyDisplay()
	{
		prettyDisplay(root,0);
	}
	
	public void prettyDisplay(Node node,int level)
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
			System.out.println("|----->"+node.value);
		}
		else
			System.out.println(node.value);
		
		prettyDisplay(node.left,level+1);
	}

	
	public void display()
	{
		display(root,"Root Value : ");
	}
	
	public void display(Node node, String details)
	{
		if(node==null)
			return;
		
		System.out.println(details+node.value);
		
		display(node.left,"Left node of "+node.value+" :");
		display(node.right, "Right node of "+node.value+" :");
	}
}
