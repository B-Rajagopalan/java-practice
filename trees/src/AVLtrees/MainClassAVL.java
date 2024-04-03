package AVLtrees;

public class MainClassAVL 
{
	public static void main(String[] args) 
	{
		AVLtreesDemo trees=new AVLtreesDemo();
		int[] arr= {5,4,8,9,3,2,6};
		
		for(int i=0;i<arr.length;i++)
		{
			trees.insert(arr[i]);
		}
		
		trees.display();
		
		System.out.println("\n\tHeight of the tree = "+trees.height());
	}
}
