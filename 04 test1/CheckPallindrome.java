package test1;

import java.util.Scanner;

//Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
//Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121

public class CheckPallindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		int reverse=0;
		while(temp>0) {
			int base=temp%10;
			reverse=reverse*10+base;
			temp/=10;
		}
		System.out.println(reverse == num);
		s.close();
	}
}
