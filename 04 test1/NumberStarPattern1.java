package test1;

import java.util.Scanner;

//Print the following pattern for given number of rows.
//For n=5:
//5432*
//543*1
//54*21
//5*321
//*4321

public class NumberStarPattern1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(j);
			}
			System.out.print('*');
			for(int j=1;j<i;j++) {
				System.out.print(i-j);
			}
			System.out.println();
		}
		s.close();
	}
}
