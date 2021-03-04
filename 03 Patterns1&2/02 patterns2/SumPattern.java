package patterns2;

import java.util.Scanner;

//Write a program to print triangle of user defined integers sum.

public class SumPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int sum=0;
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				sum+=j;
				if(j<i) {
					System.out.print('+');
				}else {
					System.out.println("="+sum);
				}
			}
		}
		s.close();
	}
}
