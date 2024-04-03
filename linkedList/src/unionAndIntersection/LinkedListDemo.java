package unionAndIntersection;

public class LinkedListDemo 
{
	protected Node head;
	
	//inserting elements as first value everytime and making it as head
	public void insert(int value)
	{
		Node node=new Node(value);
		node.next=head;
		head=node;
	}
	
	public void union(Node head1, Node head2) //list1 and list2 heads
	{
		Node temp = head1;
		
		//First adding all elements in list1 (head1 is actually list1.head)
		while(temp!=null) {
			insert(temp.value);
			temp = temp.next;
		}
		
		temp = head2; //temp reassigned to list2
		
		//Now all list2 elements which are not present in list1 added(union rule)
		while(temp!=null)
		{
			if(!isPresent(head1,temp.value)) //check if head1 data is present in head2
				insert(temp.value);
			
			temp = temp.next;
		}
	}
	
	public void intersection(Node head1, Node head2) //list1 and list2 heads
	{
		Node temp = head2; 
		
		//adding common elements from list1 and list2 (intersection rule)
		while(temp!=null)
		{
			if(isPresent(head1,temp.value)) //check if head1 data is present in head2
				insert(temp.value);
			
			temp = temp.next;
		}
	}
	
	public boolean isPresent(Node temp, int data)
	{
		while(temp!=null)
		{
			if(temp.value==data)
				return true;
			temp = temp.next;
		}
		
		return false;
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
	
	// Node class
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
