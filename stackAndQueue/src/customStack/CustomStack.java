package customStack;

public class CustomStack 
{
	//First In Last Out or Last In First Out
	int[] arr;
	static int pointer = -1;
	static int size = 5;
	
	public CustomStack() {
		// TODO Auto-generated constructor stub
		this(size);
	}
	
	public CustomStack(int size) {
		// TODO Auto-generated constructor stub
		this.arr = new int[size];
	}
	
	//push() method
	public boolean push(int element)
	{
		if(isFull())
		{
			throw new StackOverflowError();
		}
		
		arr[++pointer] = element;
		return true;
	}
	
	//pop() method
	public int pop() throws StackEmptyException
	{
		if(isEmpty())
		{
			throw new StackEmptyException("Stack is Empty");
		}
		
		return arr[pointer--];
	}

	protected boolean isEmpty() {
		// TODO Auto-generated method stub
		return pointer<0;
	}

	protected boolean isFull() {
		// TODO Auto-generated method stub
		return pointer==arr.length-1;
	}
}
