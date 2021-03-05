package operatorsAndForLoops;

import java.util.Scanner;

//Given a number N, find its square root. You need to find and print only the integral part of square root of N.


public class SquareRoot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int ans=0;
		while(ans*ans<=n) {
			ans++;
		}
		System.out.println(ans-1);
	}
}
