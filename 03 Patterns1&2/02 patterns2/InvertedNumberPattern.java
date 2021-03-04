package patterns2;

import java.util.Scanner;

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//4444
//333
//22
//1


public class InvertedNumberPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		s.close();
	}
}
