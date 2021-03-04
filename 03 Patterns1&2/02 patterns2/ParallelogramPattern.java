package patterns2;

import java.util.Scanner;

//Write a program to print parallelogram pattern for the given N number of rows.
//For N = 5
//*****
// *****
//  *****
//   *****
//    *****
//The dots represent spaces.

public class ParallelogramPattern {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		s.close();
	}
}
