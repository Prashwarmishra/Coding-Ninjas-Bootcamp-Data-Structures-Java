package queues;

import java.util.*;

//Implement a Stack Data Structure specifically to store integer data using two Queues. You have to implement it in 
//such a way that the push operation is done in O(1) time and the pop and top operations are done in O(N) time.
//There should be two data members, both being Queues to store the data internally. You may use the inbuilt Queue.

public class StackUsingTwoQueues {
	Queue<Integer> main;
	Queue<Integer> helper;
	
	public StackUsingTwoQueues() {
		main = new LinkedList<>();
		helper = new LinkedList<>();
	}
	
	public int getSize() { 
        return main.size();
    }

    public boolean isEmpty() {
        return main.isEmpty();
    }

    public void push(int element) {
        main.add(element);
    }

    public int pop() {
    	if(main.size() == 0) {
    		return -1;
    	}
        while(main.size() > 1) {
        	helper.add(main.poll());
        }
        int temp = main.poll();
        while(!helper.isEmpty()) {
        	main.add(helper.poll());
        }
        return temp;
    }

    public int top() {
    	if(main.size() == 0) {
    		return -1;
    	}
        while(main.size() > 1) {
        	helper.add(main.poll());
        }
        int temp = main.poll();
        while(!helper.isEmpty()) {
        	main.add(helper.poll());
        }
        main.add(temp);
        return temp;
    }
}
