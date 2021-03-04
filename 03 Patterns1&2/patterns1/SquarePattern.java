package patterns1;

import java.util.Scanner;

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//4444
//4444
//4444
//4444

public class SquarePattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(n);
			}
			System.out.println();
		}
		s.close();
	}
}
