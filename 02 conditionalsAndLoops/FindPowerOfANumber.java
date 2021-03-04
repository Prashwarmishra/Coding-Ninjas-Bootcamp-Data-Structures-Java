package conditionalsAndLoops;

import java.util.Scanner;

//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.

public class FindPowerOfANumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int ans=1;
		while(n>0) {
			ans*=x;
			n--;
		}
		System.out.println(ans);
		s.close();
	}
}
