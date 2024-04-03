import java.util.*;

public class pascals 
{
	public static void main(String[] args) 
	{
		int N=5,r=5,c=3;
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int i=0;i<N;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		
		list.get(0).add(1);
		
		for(int i=1;i<N;i++)
		{
			list.get(i).add(1);
			
			for(int j=0;j<list.get(i-1).size()-1;j++)
			{
				list.get(i).add(list.get(i-1).get(j) + list.get(i-1).get(j+1));
			}
			
			list.get(list.get(i-1).size()).add(1);
		}
		
		//variation 1
		System.out.println(list.get(r-1).get(c-1)+"\n");
		
		//variation 2
		System.out.println(list.get(N-1)+"\n");
		
		//variation 3
		for(ArrayList<Integer> arr:list)
		{
			System.out.println(Arrays.asList(arr));
		}
	}
}
