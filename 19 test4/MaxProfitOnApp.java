package test4;

import java.util.Arrays;

//You have made a smartphone app and want to set its subscription price such that the profit earned is maximised. 
//There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
//You will be provided with a list of size N having budgets of subscribers and you need to return the maximum 
//profit that you can earn.
//Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit 
//you can earn is :
//	 m * x
//where m is total number of subscribers whose budget is greater than or equal to x.

public class MaxProfitOnApp {
	
	public static int maximumProfit(int budget[]) {
		Arrays.sort(budget);
		int n=budget.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int currProfit = budget[i]*(n-i);
			if(currProfit > max) {
				max = currProfit;
			}
		}
		return max;
    }
}
