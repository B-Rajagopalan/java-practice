package binarySearchTree;

public class BSTMainclass 
{
	public static void main(String[] args) 
	{
		BSTImpl tree=new BSTImpl();
//		tree.shootElements();
//		tree.display();
//		System.out.println(tree.balanced());
//		tree.prettyDisplay();
		
		System.out.println("----------------------------------------------------");
		
		tree.shootSortedElements();
		tree.display();
		System.out.println(tree.balanced());
		tree.prettyDisplay();
	}
}
