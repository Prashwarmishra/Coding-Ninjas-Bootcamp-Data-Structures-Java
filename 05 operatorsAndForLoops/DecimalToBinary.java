package operatorsAndForLoops;

import java.util.Scanner;

//Given a decimal number (integer N), convert it into binary and print.


public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		s.close();
		long ans=0;
		long pow=1;
		while(n>0) {
			long remainder=n%2;
			ans+=remainder*pow;
			pow*=10;
			n/=2;
		}
		System.out.println(ans);
	}
}
