package patterns2;

import java.util.Scanner;

//Write a program to print the pattern for the given N number of rows.
//For N = 4
//1357
//3571
//5713
//7135

public class OddSquare {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		n*=2;
		for(int i=1;i<n;i+=2) {
			for(int j=i;j<n;j+=2) {
				System.out.print(j);
			}
			for(int j=1;j<i;j+=2) {
				System.out.print(j);
			}
			System.out.println();
		}
		s.close();
	}
}
