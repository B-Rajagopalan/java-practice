package singlyLinkedList;

public class LinkedListDemo 
{
	protected Node head;
	protected Node tail;
	protected int size;
	
	public LinkedListDemo()
	{
		this.size=0;
	}
	
	public int size()
	{
		return size;
	}
	
	public void insertFirst(int value)
	{
		Node node=new Node(value);
		node.next=head;
		head=node;
		
		if(tail==null)
			tail=head;
		
		size++;
	}
	
	public void insertLast(int value)
	{
		if(tail==null)
		{
			insertFirst(value);
			return;
		}
		Node node=new Node(value);
		tail.next=node;
		tail=node;
		size++;
	}
	
	public void insert(int index, int value)
	{
		if(index==0)
		{
			insertFirst(value);
			return;
		}
		
		if(index==size)
		{
			insertLast(value);
			return;
		}
		
		Node temp=head;
		
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		
		Node node=new Node(value,temp.next);
		temp.next=node;
		
		size++;
	}
	
	public void display()
	{
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		
		System.out.println();
	}
	
	protected class Node
	{
		protected int value;
		protected Node next;
		
		public Node(int value)
		{
			this.value=value;
		}
		
		public Node(int value,Node next)
		{
			this.value=value;
			this.next=next;
		}
	}
}


