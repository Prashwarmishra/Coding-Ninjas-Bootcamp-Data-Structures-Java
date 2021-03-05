package operatorsAndForLoops;

import java.util.Scanner;

//Given a binary number as an integer N, convert it into decimal and print

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int i=0;
		int ans=0;
		while(n>0) {
			int base=n%10;
			ans+=(int)(Math.pow(2, i))*base;
			i++;
			n/=10;
		}
		System.out.println(ans);
	}
}
