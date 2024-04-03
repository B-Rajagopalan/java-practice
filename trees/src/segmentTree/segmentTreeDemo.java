package segmentTree;

public class segmentTreeDemo 
{
	private class Node
	{
		private int data;
		private int[] range;
		private Node left;
		private Node right;
		
		public Node(int data, int[] range, Node left, Node right) 
		{
			super();
			this.data = data;
			this.range = range;
			this.left = left;
			this.right = right;
		}
		
		public Node(int[] range)
		{
			this.range=range;
		}
	}
	
	private Node root;
	
	private int[] arr;
	
	public void insert(int[] arr)
	{
		root=new Node(new int[] {0,arr.length});
		insert(0,arr.length,root);
	}
	
	public Node insert(int start,int end,Node node)
	{
		if(node==null)
		{
			return new Node(new int[] {start,end});
		}
		
		int mid=start+end/2;
		
		node.left=insert(start,mid,node.left);
		
		node.right=insert(mid+1,end,node.right);
		
		if(node.range[0]==node.range[1])
			node.data=arr[node.range[0]];
		else
			node.data=node.right.data+node.left.data;
		
		return node;
	}
}
