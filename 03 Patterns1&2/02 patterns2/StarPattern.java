package patterns2;

import java.util.Scanner;

//Print the following pattern
//Pattern for N = 4
//   *
//  *** 
// *****
//*******
//The dots represent spaces.

public class StarPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
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
		s.close();
	}
}
