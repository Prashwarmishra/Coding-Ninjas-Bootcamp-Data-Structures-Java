package stacks;

import java.util.Stack;

//You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the
//other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.

public class ReverseStack {
	
	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		if(input.size() == 0) {
			return;
		}
		int temp = input.pop();
		reverseStack(input, extra);
		while(!input.isEmpty()) {
			extra.push(input.pop());
		}
		input.push(temp);
		while(!extra.isEmpty()) {
			input.push(extra.pop());
		}
	}
}
