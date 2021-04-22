package stacks;

import java.util.Stack;

//For a given a string expression containing only round brackets or parentheses, check if they are 
//balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.

public class BracketsBalanced {
	
	public static boolean isBalanced(String expression) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<expression.length(); i++) {
			char curr = expression.charAt(i);
			if(curr == '(') {
				st.push(curr);
			}else if(curr == ')') {
				if(st.isEmpty() || st.peek() != '(') {
					return false;
				} else{
					st.pop();
				}
			}
		}
		if(!st.isEmpty()) {
			return false;
		}
		
		return true;
    }
}
