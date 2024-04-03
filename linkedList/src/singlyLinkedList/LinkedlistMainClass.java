package singlyLinkedList;

public class LinkedlistMainClass 
{
	public static void main(String[] args) 
	{
		LinkedListReverse ll=new LinkedListReverse();
		ll.insertFirst(3);
		ll.insertFirst(4);
		ll.insertFirst(7);
		ll.insertFirst(19);

		
		ll.insertLast(33);
//		ll.insertLast(20);
//		
//		ll.insert(4, 18);
//		ll.insert(2, 99);
		ll.display();
//		System.out.println("size = "+ll.size());
//		System.out.println("deleted first element "+ll.deleteFirst());
//		ll.display();
//		System.out.println("deleted last element "+ll.deleteLast());
//		ll.display();
//		System.out.println("deleted last element "+ll.deleteLast());
//		System.out.println("deleted first element "+ll.deleteFirst());
//		ll.display();
		
		ll.reverseList();
		ll.display();
	}
}
