package test1;

import java.util.Scanner;

//Given input consists of n numbers. Check whether those n numbers form an 
//arithmetic progression or not. Print true or false.

public class CheckAP {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int prev=s.nextInt();
			int next=s.nextInt();
			int diff=next-prev;
			while(n>2) {
				prev=next;
				next=s.nextInt();
				if(next-prev != diff) {
					System.out.println(false);
					return;
				}
				n--;
			}
			System.out.println(true);
			s.close();
		}
	}
}
