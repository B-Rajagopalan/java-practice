import java.util.*;
public class matrix 
{
	public static void main(String[] args) 
	{
		int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};
//		Map<Integer,Integer> map=new HashMap<>();
		List <Integer> list=new ArrayList<Integer>();
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr.length;j++)
//			{
//				if(arr[i][j]==0)
//					map.put(i, j);
//			}
//		}
//		
//		map.forEach((row,col)-> {
//		for(int i=0;i<arr.length;i++){
//			arr[i][col]=0;
//			arr[row][i]=0;
//		} });
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				System.out.print(arr[i][j]+" ");			
//			}
//			System.out.println();
//		}
		
		//System.out.println(Arrays.deepToString(arr));
		
// Using List
		int pos=0;
		for(int ele:list)
		{
			if(pos%2==0)
			{
				for(int j=0;j<arr.length;j++)
					arr[ele][j]=0;
			}
			
			if(pos%2!=0)
			{
				for(int i=0;i<arr.length;i++)
					arr[i][ele]=0;
			}
			pos++;
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");			
			}
			System.out.println();
		}
	}
}
