package operatorsAndForLoops;

import java.util.Scanner;

//write a code to find the “Nth” Fibonacci number.

public class NthFibonacciNumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		if(n == 0) {
			System.out.println(0);
			return;
		}else if(n == 1) {
			System.out.println(1);
			return;
		}
		int p=0,q=1,k=0;
		while(n>1) {
			k=p+q;
			p=q; q=k; n--;
		}
		System.out.println(k);
	}
}
