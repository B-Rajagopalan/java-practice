package customStack;

public class DynamicStack extends CustomStack
{
	
	public DynamicStack() {
		super();
	}
	
	public DynamicStack(int size) {
		super(size);
	}
	
	@Override
	public boolean push(int element) {
		
		if(isFull())
		{
			int[] temp = new int[arr.length*2];
			
			for(int i=0;i<=pointer;i++)
			{
				temp[i] = arr[i];
			}
			
			arr = temp;
		}
		
		return super.push(element);
	}
}
