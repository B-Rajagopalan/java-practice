
public class findSqrt 
{
	public static void main(String[] args) 
	{
		int n=40;
		int p=1;
		
		int s=0,e=n,m=0;
		
		while(s<=e)
		{
			m=s+(e-s)/2;
			
			if(m*m==n) {
				System.out.println("From binary search "+m);
				//System.exit(0);
			}
			
			if(m*m>n)
				e=m-1;
			else
				s=m+1;
		}
		
		//if val=m-1 (or) e, then the value of m is used here to find the imperfect root value
		// as m has the nearest greater value of imperfect sqr root, precision=0.1,loop (i<p)
		
		// if val=0, then the program starts from precision=1 coz we need to find the 
		// whole value first (m is not used) and need to run loop to i<=p as we need to find 
		// whole value too.
		
		// if val started from 0.0 then no binary search needed to solve this program
		double val = 0, precision=1;
	
		for(int i=0;i<=p;i++)
		{	
			while(val*val<=n)
			{
				val+=precision;
			}
			
			val-=precision;
			precision/=10;
		}
		
		System.out.println("From precision "+val);
	}
}
