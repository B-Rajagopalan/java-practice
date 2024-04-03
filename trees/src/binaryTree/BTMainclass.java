package binaryTree;
import java.util.*;

public class BTMainclass 
{
	public static void main(String[] args) 
	{
		BTImpl tree=new BTImpl();
		tree.populate(new Scanner(System.in));
		tree.display();
	}
}
