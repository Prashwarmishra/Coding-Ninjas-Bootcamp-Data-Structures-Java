package stacks;

import java.util.Stack;

//For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order 
//to make the expression balanced. The expression will only contain curly brackets.
//If the expression can't be balanced, return -1.

public class MinimumBracketsReversal {
	
	public static int countBracketReversals(String input) {
		if(input.length() <=0 || input.length()%2 != 0) {
			return -1;
		}
		
		Stack<Character> st = new Stack<>();
		for(int i=0; i<input.length(); i++) {
			char curr = input.charAt(i);
			if((curr == '{') || (curr == '}' && (st.isEmpty() || st.peek() == '}'))) {
				st.add(curr);
			}else if(curr == '}' && st.peek() == '{') {
				st.pop();
			}
		}
		
		int count = 0;
		while(!st.isEmpty()) {
			char curr = st.pop();
			if(st.peek() == curr) {
				count++;
			}else {
				count+=2;
			}
			st.pop();
		}
		
		return count;
	}
}
