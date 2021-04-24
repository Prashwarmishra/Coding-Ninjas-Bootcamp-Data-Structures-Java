package queues;

import java.util.Queue;

//You have been given a queue that can store integers as the data. You are required to write a function that 
//reverses the populated queue itself without using any other data structures.


public class ReverseQueue {
	
	public static void reverseQueue(Queue<Integer> input) {
		if(input.size() <= 1) {
			return;
		}
		int temp = input.poll();
		reverseQueue(input);
		input.add(temp);
	}
}
