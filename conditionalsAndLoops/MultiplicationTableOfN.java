package conditionalsAndLoops;

import java.util.Scanner;

//Write a program to print multiplication table of n


public class MultiplicationTableOfN {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<11) {
			System.out.println(n*i++);
		}
		s.close();
	}
}
