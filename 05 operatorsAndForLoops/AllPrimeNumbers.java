package operatorsAndForLoops;

import java.util.Scanner;

//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
//Print the prime numbers in different lines

public class AllPrimeNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		if(n<2) {
			return;
		}
		System.out.println(2);
		for(int i=3;i<=n;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j == 0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
	}
}
