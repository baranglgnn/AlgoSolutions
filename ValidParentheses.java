package ittihat;

import java.util.*;

public class ValidParentheses {

	public static void main(String[] args) {
		String s="(]";
		System.out.println("isValid : " + isValid(s));
		

	}
	 public static boolean isValid(String s) {
		 Stack<Character> stringStack = new Stack();
		 for (char parentheses : s.toCharArray()) {
			if(parentheses == '(' || parentheses == '[' || parentheses == '{')
			{
				stringStack.push(parentheses);
			}else 
			{
	            if (stringStack.isEmpty()) {
	            	return false;
	            }
	            char last = stringStack.pop();
	            if ((parentheses == ')' && last != '(') ||
	                (parentheses == ']' && last != '[') ||
	                (parentheses == '}' && last != '{'))
	            {
	                return false;
	            }
	        }
		}
		return stringStack.empty();     
	    }
}
