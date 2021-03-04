package patterns1;

import java.util.Scanner;

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//1
//22
//333
//4444

public class TriangularNumberPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		s.close();
	}
}
