package BonusProblemsStringAndMatrices;

import java.util.Scanner;

//You are given a string. You have is to find the length of the largest possible substring which is not a palindrome.


public class LargesNonPallindromicString {
	private static boolean checkIfPallindrome(String str, int s, int e) {
		for(int i=s, j=e;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static int getLargestNonPallindromeLength(String str) {
		int n=str.length();
		int s=0,e=n-1;
		while(checkIfPallindrome(str, s, e) && s<=e) {
			e--;
		}
		return e-s+1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		s.close();
		System.out.println(getLargestNonPallindromeLength(str));	
	}
}
