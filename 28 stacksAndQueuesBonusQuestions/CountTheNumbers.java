package stacksAndQueuesBonusQuestions;

import java.util.Stack;

//You are given an integer n, you have to count all those natural numbers from 1 to n whose all permutations is greater 
//than or equal to that number n.

public class CountTheNumbers {
	
	public static int permutations(int n) {
		if(n < 10) {
			return n;
		}
        int count = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=1; i<10; i++) {
        	st.push(i);
        }
        while(!st.isEmpty()) {
        	int temp = st.pop();
        	for(int i=temp%10; i<10; i++) {
        		int num = temp*10+i;
        		if(num < n) {
        			st.add(num);
        		}
        	}
        	count++;
        }
        return count;
    }
}
