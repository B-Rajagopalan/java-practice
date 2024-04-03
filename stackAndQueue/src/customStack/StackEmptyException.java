package customStack;

@SuppressWarnings("serial")
public class StackEmptyException extends Exception 
{
	public StackEmptyException(String message) {
		super(message);
	}
}
