package queues;

import java.util.*;

//For a given queue containing all integer data, reverse the first K elements.
//You have been required to make the desired change in the input queue itself.

public class ReverseFirstKElementsOfTheQueue {
	
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		if(k <= 1) {
			return input;
		}
		Stack<Integer> st = new Stack<>();
		int count = 0;
		while(count < k) {
			st.add(input.poll());
			count++;
		}
		while(!st.isEmpty()) {
			input.add(st.pop());
		}
		count = input.size()-k;
		while(count > 0) {
			int temp = input.poll();
			input.add(temp);
			count--;
		}
		return input;
	}
}
