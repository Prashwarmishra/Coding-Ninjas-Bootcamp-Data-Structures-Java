package test2;

import java.util.Scanner;

public class NumberStarPattern {
	private static void printPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j);
			}
			for(int j=0;j<i;j++) {
				System.out.print("**");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print(n-i-j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		printPattern(n);
		s.close();
	}
}
