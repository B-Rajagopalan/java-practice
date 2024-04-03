package customQueue;

public class CircularQueue 
{
	int[] arr;
	static int end = 0, start = 0;
	static int size = 5;
	static int sizeTrack = 0;
	
	public CircularQueue() {
		// TODO Auto-generated constructor stub
		this(size);
	}
	
	public CircularQueue(int size) {
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
		
		end = end % arr.length;  //makes the end=0 again when it reaches arr.length
		arr[end++] = element;
		sizeTrack++;
		
		return true;
	}
	
	//poll() method
	public int poll() throws QueueEmptyException
	{
		if(isEmpty())
		{
			throw new QueueEmptyException();
		}
		
		sizeTrack--;
		
		return arr[start++];
	}

	protected boolean isEmpty() {
		// TODO Auto-generated method stub
		return sizeTrack==0;
	}

	protected boolean isFull() {
		// TODO Auto-generated method stub
		return sizeTrack==arr.length;
	}
	
	protected void display()
	{
		for(int i=0;i<sizeTrack;i++)   //limit upto actual size to avoid the removed element poll()
		{
			System.out.println(arr[(i+start)%arr.length]+" <- ");
		}
		System.out.println("END");
	}
}
