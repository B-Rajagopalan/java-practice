
public class newtonRaphson 
{
	public static void main(String[] args) 
	{
		int n = 40;
		
		double x = n;
		double root=0;
		while(true)
		{
			root=0.5*(x+n/x);
		
			if(Math.abs(root-x)<0.5)
				break;
			
			x=root;
		}
		
		System.out.println(root);
	}
}
