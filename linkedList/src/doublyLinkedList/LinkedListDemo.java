package doublyLinkedList;

public class LinkedListDemo 
{
	protected Node head;
	
	public void insertFirst(int value)
	{
		Node node=new Node(value);
		node.next=head;
		node.previous=null;
		if(head!=null)
			head.previous=node;
		head=node;
		
	}
	
	public void insertLast(int value)
	{
		Node node=new Node(value);
		Node last=head;
		node.next=null;
		
		if(head==null)
		{
			head=node;
			head.previous=null;
			return;
		}
		
		while(last.next!=null)
		{
			last=last.next;
		}
		
		last.next=node;
		node.previous=last;
	}
	
	public void insert(int value,int index)
	{
		Node node=new Node(value);
		Node temp=head;
		int i=0;
		
		if(index==0) {
			insertFirst(value);
			return;
		}
		
		while(temp!=null)
		{	
			if(index-1==i)
			{
				node.next=temp.next;
				
				if(node.next!=null)
					node.next.previous=node;
				
				temp.next=node;
				node.previous=temp;
				return;
			}	
			
			i=i+1;
			temp=temp.next;
		}
		
		System.err.println("Index Exceeded");
	}
	
	public void display()
	{
		Node temp=head;
		Node last=null;
		
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			last=temp;
			temp=temp.next;
		}
		
//		System.out.println("\nReverse");
		
//		while(last!=null)
//		{
//			System.out.print(last.value+" ");
//			last=last.previous;
//		}
//		
		System.out.println();
		
	}
	
	protected class Node
	{
		protected int value;
		protected Node next;
		protected Node previous;
		
		public Node(int value)
		{
			this.value=value;
		}

		public Node(int value, Node next, Node previous) 
		{
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
	}
}
