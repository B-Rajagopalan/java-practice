package customQueue;

//First In First Out or Last In Last Out
//Need to implement DynamicQueue
public class MainClass 
{
	public static void main(String[] args) throws Exception
	{
		CircularQueue queue = new DynamicQueue();
		queue.add(0);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		queue.add(10);
		queue.add(10);
		queue.add(10);
		queue.add(10);
		queue.add(11);
		queue.add(12);
				
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		//System.out.println(queue.poll());
		//System.out.println(queue.poll());
		//System.out.println(queue.poll());
		
		System.out.print("Display Queue :\n");
		queue.display();
		
	}
}
