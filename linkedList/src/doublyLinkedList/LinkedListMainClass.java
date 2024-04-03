package doublyLinkedList;

public class LinkedListMainClass 
{
	public static void main(String[] args) 
	{
		LinkedListDelete ll=new LinkedListDelete();
//		ll.insertFirst(13);
//		ll.insertFirst(45);
//		ll.insertFirst(60);
		ll.insertLast(99);
		ll.insertLast(100);
		ll.insertLast(101);
		
		ll.insert(98,3);
		ll.display();
		
		System.out.println();
		
		//ll.delete(3);
		ll.deleteLast();
		ll.display();
	}
}
