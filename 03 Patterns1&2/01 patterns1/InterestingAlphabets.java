package patterns1;

import java.util.Scanner;

//Print the following pattern for the given number of rows.
//Pattern for N = 5
//E
//DE
//CDE
//BCDE
//ABCDE

public class InterestingAlphabets {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((char)(64+n-i+j+1));
			}
			System.out.println();
		}
		s.close();
	}
}
