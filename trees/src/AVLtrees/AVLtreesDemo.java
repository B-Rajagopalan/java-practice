package AVLtrees;

public class AVLtreesDemo 
{
	private class Node
	{
		private int value;
		private Node left;
		private Node right;
		int height;
		
		public Node(int value, Node left, Node right) 
		{
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
	
	public int height()
	{
		return height(root);
	}
	
	public int height(Node node)
	{
		if(node==null)
			return -1;
		return node.height;
	}
	
	private Node root;
	
	public void insert(int value)
	{
		root=insert(root,value);
	}
	
	public Node insert(Node node,int value)
	{
		if(node==null)
		{
			node=new Node(value);
			return node;
		}
		
		if(value<node.value)
		{
			node.left=insert(node.left,value);
		}
		
		if(value>node.value)
		{
			node.right= insert(node.right,value);
		}
		
		node.height=Math.max(height(node.left), height(node.right))+1;
		
		//return node;
		return rotate(node);
	}
	
	public Node rotate(Node node)
	{
		if(height(node.left)-height(node.right)>1)
		{
			if(height(node.left.left)-(height(node.left.right))>0)
				return rightRotate(node);
			
			if(height(node.left.left)-(height(node.left.right))<0)
			{
				leftRotate(node.left);
				return rightRotate(node);
			}
		}
		
		if(height(node.left)-height(node.right)<-1)
		{
			if(height(node.right.left)-(height(node.right.right))>0)
			{
				rightRotate(node.right);
				return leftRotate(node);
			}
			
			if(height(node.right.left)-(height(node.right.right))<0)
			{
				return rightRotate(node);
			}
		}
		
		return node;
	}
	
	public Node leftRotate(Node p)
	{
		Node c=p.right;
		Node t=c.left;
		
		c.left=p;
		p.right=t;
		
		p.height=Math.max(height(p.left), height(p.right))+1;
		c.height=Math.max(height(c.left), height(c.right))+1;
		
		return c;
	}
	
	public Node rightRotate(Node p)
	{
		Node c=p.left;
		Node t=c.right;
		
		c.right=p;
		p.left=t;
		
		p.height=Math.max(height(p.left), height(p.right))+1;
		c.height=Math.max(height(c.left), height(c.right))+1;

		return c;
	}
	
	public void display()
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
			
			System.out.println("|------>"+node.value);
		}
		
		else
			System.out.println(node.value);
		
		prettyDisplay(node.left,level+1);
	}
}

