package singlyLinkedList;

public class LinkedListDelete extends LinkedListDemo
{
	public int deleteFirst()
	{
		int value= head.value;
		head=head.next;
		
		if(head==null)
			tail=null;
		
		size--;
		return value;
	}
	
	public Node getNode(int index)
	{
		Node temp=head;
		int i=1;
		while(i<=index)
		{
			temp=temp.next;
			i++;
		}
		return temp;
	}
	
	public int deleteLast()
	{
		int value=tail.value;
		if(size<=1)
		{
			deleteFirst();
			return value;
		}
		
		tail=getNode(size-2);
		tail.next=null;
		size--;
		return value;
	}
}
