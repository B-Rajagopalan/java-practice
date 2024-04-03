package singlyLinkedList;

public class LinkedListReverse extends LinkedListDelete
{
	public void reverseList()
	{
		if(head==tail)
		{
			System.out.println(head.value);
			return;
		}
		
		if(head==null)
			return;
		
		
		Node temp=head,before=null,after=null;
		head=tail;
		tail=temp;
		
		for(int i=0;i<size;i++)
		{
			after=temp.next;
			temp.next=before;
			before=temp;
			temp=after;
		}
		
//		Node temp=tail;
		
//		for(int i=size-2;i>=0;i--)
//		{
//			Node node = new Node(getNode(i).value,temp.next);
//			temp.next=node;
//			
//			if(i==0) {
//				head=tail;
//				tail=temp.next;
//			}
//			else
//				temp=temp.next;
//		}

		System.out.println("reverse done");
	}
}
