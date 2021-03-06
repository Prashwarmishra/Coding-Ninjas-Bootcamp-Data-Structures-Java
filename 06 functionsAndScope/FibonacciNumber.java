package functionsAndScope;

import java.util.Scanner;

//Given a number N, figure out if it is a member of fibonacci series or not. Return true if 
//the number is member of fibonacci series else false.
//Fibonacci Series is defined by the recurrence
//F(n) = F(n-1) + F(n-2)

public class FibonacciNumber {
	private static boolean getFibonnaci(int n) {
		if(n == 0 || n == 1) {
			return true;
		}
		int p=0,q=1;
		while(q<=n) {
			int s=p+q;
			if(s == n) {
				return true;
			}
			p=q;q=s;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		System.out.println(getFibonnaci(n));
	}
}
