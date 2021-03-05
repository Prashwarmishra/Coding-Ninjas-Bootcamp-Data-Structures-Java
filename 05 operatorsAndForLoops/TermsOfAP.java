package operatorsAndForLoops;

import java.util.Scanner;

//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

public class TermsOfAP {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int count=0;
		int i=1;
		while(count<n) {
			int num=3*i+2;
			i++;
			if(num%4 == 0) {
				continue;
			}
			System.out.print(num+" ");
			count++;
		}
	}
}
