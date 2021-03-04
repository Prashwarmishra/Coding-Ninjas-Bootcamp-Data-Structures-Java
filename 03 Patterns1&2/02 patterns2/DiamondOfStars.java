package patterns2;

import java.util.Scanner;

//Print the following pattern for the given number of rows.
//Note: N is always odd.
//Pattern for N = 5
//  *
// ***
//*****
// ***
//  *

public class DiamondOfStars {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int m=(p+1)/2;
		int n=p-m;
		for(int i=1;i<=m;i++) {
			for(int j=0;j<m-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print('*');
			}
			for(int j=1;j<i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n-i+1;j++) {
				System.out.print('*');
			}
			for(int j=0;j<n-i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		s.close();
	}
}
