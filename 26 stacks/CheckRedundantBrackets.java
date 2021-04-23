package stacks;

import java.util.Stack;

//For a given expression in the form of a string, find if there exist any redundant brackets or not. It is given that 
//the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.

public class CheckRedundantBrackets {
	public static boolean checkRedundantBrackets(String expression) {
		if(expression.length() <= 0) {
			return false;
		}
		Stack<Character> st = new Stack<>();
		for(int i=0; i<expression.length(); i++) {
			char current = expression.charAt(i);
			if(current != ')') {
				st.add(current);
			}else {
				int count = 0;
				while(st.peek() != '(') {
					st.pop();
					count++;
				}
				st.pop();
				if(count < 2) {
					return true;
				}
			}
		}
        return false;
	}
}
