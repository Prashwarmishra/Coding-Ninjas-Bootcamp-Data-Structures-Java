package functionsAndScope;

import java.util.Scanner;

//Given a number, check if it's prime or not

public class CheckPrime {
	private static boolean check(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		System.out.println(check(n));
	}
}
