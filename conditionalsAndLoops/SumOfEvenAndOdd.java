package conditionalsAndLoops;

import java.util.Scanner;

//Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.


public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int even=0;
		int odd=0;
		while(n>0) {
			int base=n%10;
			if(base%2 == 0) {
				even+=base;
			}else {
				odd+=base;
			}
			n/=10;
		}
		System.out.println(even+" "+odd);
		s.close();
	}
}
