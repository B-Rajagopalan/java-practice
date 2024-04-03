package practice;

import java.util.Stack;

public class ValidParanthesis 
{
	public static void main(String[] args) 
	{
		String s = "))()";
		int count = 0,i = 0,max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);

        while(i < s.length())
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else
            {
                stack.pop();
                if(stack.isEmpty())
                {
                    stack.push(i);
                }
                else
                {
                    count = i - stack.peek();
                    max = Math.max(max,count);
                }
            }
            i++;
        }
        
        System.out.println(max);
	}
}
