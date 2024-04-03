package customQueue;

public class DynamicQueue extends CircularQueue
{
	public DynamicQueue() {
		super();
	}
	
	public DynamicQueue(int size) {
		super(size);
	}
	
	@Override
	public boolean add(int element) {
		
		if(isFull())
		{
			int temp[] = new int[arr.length*2];
			
			for(int i=0;i<sizeTrack;i++)
			{
				temp[i] = arr[(i+start)%arr.length];
			}
			
		    //make end as length of previous array for continuity of inserting other elements
			end = arr.length;
			start = 0;
			arr = temp;
		}
		
		return super.add(element);
	}
}
