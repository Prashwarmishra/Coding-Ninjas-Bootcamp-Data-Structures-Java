package stacks;

import java.util.Stack;

//Afzal has been working with an organization called 'Money Traders' for the past few years. The organization is into the 
//money trading business. His manager assigned him a task. For a given array/list of stock's prices for N days, find the 
//stock's span for each day.
//The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and going 
//backwards) for which the price of the stock was less than today's price.

public class StockSpan {
	
	public static int[] stockSpan(int[] price) {
		if(price.length <= 0) {
			return null;
		}
		int n = price.length;
		int[] ans = new int[n];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<n; i++) {
			while(!st.isEmpty() && price[st.peek()] < price[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i] = i+1;
			}else {
				ans[i] = i-st.peek();
			}
			st.add(i);
		}
		
		return ans;
	}
}
