package customQueue;

@SuppressWarnings("serial")
public class QueueEmptyException extends Exception 
{
	public QueueEmptyException() {
		super("Queue is Empty");
	}
}
