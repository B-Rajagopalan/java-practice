package circularLinkedList;

public class LinkedListMainClass
{
	public static void main(String[] args) {
		CLinkedListDemo cl = new CLinkedListDemo();
		cl.insertLast(0);
		cl.insertLast(2);
		cl.insertLast(3);
		cl.insertLast(5);
		cl.display();
		cl.delete(0);
		System.out.println();
		cl.display();
	}
}
