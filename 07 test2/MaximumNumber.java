package test2;

import java.util.Scanner;

//We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make 
//by removing one digit from the given integer.

public class MaximumNumber {
	private static int findSmallest(int n) {
		int min=Integer.MAX_VALUE;
		while(n>0) {
			int base=n%10;
			if(base<min) {
				min=base;
			}
			n/=10;
		}
		return min;
	}
	
	private static int constructSmallest(int n, int s) {
		int ans=0;
		int pow=1;
		while(n>0) {
			int rem=n%10;
			if(rem == s) {
				n/=10;
				continue;
			}
			ans=ans+(rem*pow);
			n/=10;
			pow*=10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int smallest=findSmallest(n);
		System.out.println(constructSmallest(n, smallest));
		s.close();
	}
}
