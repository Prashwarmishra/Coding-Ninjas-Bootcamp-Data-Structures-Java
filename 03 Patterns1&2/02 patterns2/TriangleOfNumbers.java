package patterns2;

import java.util.Scanner;

//Print the following pattern for the given number of rows.
//Pattern for N = 4
//   1
//  232
// 34543
//4567654
//The dots represent spaces.

public class TriangleOfNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			int max=0;
			for(int j=0;j<i;j++) {
				max=i+j;
				System.out.print(max);
			}
			for(int j=1;j<i;j++) {
				System.out.print(max-j);
			}
			System.out.println();
		}
		s.close();
	}
}
