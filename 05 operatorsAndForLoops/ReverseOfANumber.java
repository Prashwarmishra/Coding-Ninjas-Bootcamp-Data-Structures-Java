package operatorsAndForLoops;

import java.util.Scanner;

//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.


public class ReverseOfANumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int reverse=0;
		while(n>0) {
			reverse=reverse*10+(n%10);
			n/=10;
		}
		System.out.println(reverse);
	}
}
