package patterns2;

import java.util.Scanner;

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//   1 
//  12
// 123
//1234
//The dots represent spaces.

public class MirrorImageNumberPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		s.close();
	}
}
