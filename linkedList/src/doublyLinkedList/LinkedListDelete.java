package doublyLinkedList;

public class LinkedListDelete extends LinkedListDemo
{
	public void delete(int index)
	{
		Node temp=head;
		int i=0;
		
		if(head==null)
			return;
		
		while(temp!=null)
		{	
			if(index==i)
			{
				temp.previous.next=temp.next;
				if(temp.next!=null)
					temp.next.previous=temp.previous;
				return;
			}
			
			temp=temp.next;
			i++;
		}
		
		System.err.println("Index not found");
	}
	
	public void deleteLast()
	{
		Node temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=null;
	}
}
