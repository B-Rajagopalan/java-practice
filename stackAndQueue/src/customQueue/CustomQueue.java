package customQueue;

public class CustomQueue 
{
	int[] arr;
	static int pointer = 0;
	static int size = 5;
	
	public CustomQueue() {
		// TODO Auto-generated constructor stub
		this(size);
	}
	
	public CustomQueue(int size) {
		// TODO Auto-generated constructor stub
		this.arr = new int[size];
	}
	
	//add() method
	public boolean add(int element)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
			return false;
		}
		
		arr[pointer++] = element;
		return true;
	}
	
	//poll() method
	public int poll() throws QueueEmptyException
	{
		if(isEmpty())
		{
			throw new QueueEmptyException();
		}
		
		int element = arr[0];
		
		// O(n) 
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1] = arr[i];
		}
		
		pointer--;
		
		return element;
	}

	protected boolean isEmpty() {
		// TODO Auto-generated method stub
		return pointer==0;
	}

	protected boolean isFull() {
		// TODO Auto-generated method stub
		return pointer==arr.length;
	}
	
	protected void display()
	{
		for(int i=0;i<pointer;i++)
		{
			System.out.print(arr[i]+"<-");
		}
		System.out.println("END");
	}
}
