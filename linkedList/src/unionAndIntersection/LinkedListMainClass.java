package unionAndIntersection;

public class LinkedListMainClass 
{
	public static void main(String[] args) 
	{
		LinkedListDemo list1 = new LinkedListDemo();
		LinkedListDemo list2 = new LinkedListDemo();
		
		list1.insert(0);
		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		
		list2.insert(4);
		list2.insert(5);
		list2.insert(2);
		list2.insert(7);
		
		LinkedListDemo unionList = new LinkedListDemo();
		unionList.union(list1.head, list2.head);
		
		LinkedListDemo intersectionList = new LinkedListDemo();
		intersectionList.intersection(list1.head, list2.head);
		
		System.out.print("List 1 : ");
		list1.display();
		
		System.out.print("List 2 : ");
		list2.display();
		
		System.out.print("Union List : ");
		unionList.display();
		
		System.out.print("Intersection List : ");
		intersectionList.display();
	}
}
