package BonusProblemsStringAndMatrices;

import java.util.Scanner;

//Given a string S, you need to find and return the lexicographically first palindrome string that 
//can be made using characters of S.
//Return an empty string if no palindrome can be created using S.

public class FirstPallindrome {
	public static String nextPalindrome(String input) {
		int[] arr=new int[26];
		int n=input.length();
		for(int i=0;i<n;i++) {
			char temp=input.charAt(i);
			arr[temp-97]++;
		}
		if(n%2 == 0) {
			for(int i=0;i<26;i++) {
				if(arr[i]%2 != 0) {
					return "";
				}
			}
		}else {
			boolean oneOdd=false;
			for(int i=0;i<26;i++) {
				if(arr[i]%2 != 0) {
					if(oneOdd == true) {
						return "";
					}
					oneOdd=true;
				}
			}
		}
		char[] temp=new char[n];
		int s=0,e=n-1;
		for(int i=0;i<26;i++) {
			if(arr[i]%2 == 1) {
				temp[n/2] = (char)(i+97);
				arr[i]--;
			}
			while(arr[i]>1) {
				temp[s++]=temp[e--]=(char)(i+97);
				arr[i]-=2;
			}
		}
		String ans="";
		for(int i=0;i<n;i++) {
			ans+=temp[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		s.close();
		System.out.println(nextPalindrome(input));
	}
}
