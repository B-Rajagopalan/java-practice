package circularLinkedList;

public class CLinkedListDemo 
{

	private Node head;
	private Node tail;
	
//	public CLinkedListDemo()
//	{
//		this.head=null;
//		this.tail=null;
//	}
	
	public void insertLast(int value)
	{
		Node node=new Node(value);
		
		if(head!=null)
		{
			tail.next=node;
			node.next=head;
			tail=node;
		}
		else
		{
			head=node;
			tail=node;
		}
	} 
	
	public void display()
	{
		Node temp=head;
		
		if(head!=null)
		{
			do {
				System.out.print(temp.value+" ");
				temp=temp.next;
			} while(temp!=head && temp!=null);
		}
	}
	
	public void delete(int element)
	{
		Node temp=head;
		
		if(head.value==element)
		{
			head=head.next;
			tail.next=head;
			return;
		}
		
		if(head!=null) 
		{	
			while(temp.next.value!=element) 
			{
				temp=temp.next;
				
				if(temp==head)
				{
					System.out.println("Not found");
					return;
				}
			}
			
			temp.next=temp.next.next;
		}
	}
	 
	private class Node
	{
		private Node next;
		private int value;
		
		public Node(Node next, int value) 
		{	
			this.next = next;
			this.value = value;
		}
		
		public Node(int value)
		{
			this.value=value;
		}
	}
}
