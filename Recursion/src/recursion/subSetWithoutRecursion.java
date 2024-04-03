package recursion;

import java.util.*;

public class subSetWithoutRecursion 
{
	public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        
        outerList.add(new ArrayList<Integer>());
        //picking and leaving for 1 -> [] [1] and then adding simply the other elements 2 and 3 
        //in each arraylist [] and [1] => [],[1],[2],[1,2] and so on..
        for(int num : arr)
        {
        	int n=outerList.size();
        	for(int i=0;i<n;i++)
        	{
        		List<Integer> innerList = new ArrayList<Integer>(outerList.get(i));
        		innerList.add(num);
        		outerList.add(innerList);
        	}
        }
        
        return outerList;
    }
}
