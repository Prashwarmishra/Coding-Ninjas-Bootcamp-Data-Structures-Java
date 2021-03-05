package operatorsAndForLoops;

import java.util.Scanner;

//Write a program that asks the user for a number N and a choice C. And then give them the 
//possibility to choose between computing the sum and computing the product of all integers in the range 1 to N
//
//If C is equal to -
//1, then print the sum
//2, then print the product
//Any other number, then print '-1' 

public class SumOrProduct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		if(c == 1) {
			System.out.println((n*(n+1))/2);
		}else if(c == 2) {
			int ans=1;
			for(int i=1;i<=n;i++) {
				ans*=i;
			}
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}
		s.close();
	}
}
