package BonusProblemsStringAndMatrices;

import java.util.Scanner;

//You are given a string of all digits, you have to convert this string to a palindrome by changing at 
//most K digits. If many solutions are possible then you have to print lexicographically largest possible string.
//If it is not possible to convert this string to a palindrome by changing at most k digits then print NOT POSSIBLE.

public class LargestPalindromeString {
	public static String lPString(String str, int x) {
		char arr[]=str.toCharArray();
		char copy[]=str.toCharArray();
		int n=arr.length;
		int count=0;
		for(int i=0,j=n-1;i<j;i++, j--) {
			if(arr[i] != arr[j]) {
				count++;
				if(arr[i]>arr[j]) {
					arr[j]=arr[i];
				}else {
					arr[i]=arr[j];
				}
			}
		}
		if(count>x) {
			return "NOT POSSIBLE";
		}
		for(int i=0,j=n-1;i<=j;i++, j--) {
			if(i == j && x-count>=1) {
				arr[i]='9';
				break;
			}
			if(arr[i] == copy[i] && arr[j] == copy[j] && x-count>=2) {
				arr[i]=arr[j]='9';
				count+=2;
			}else if((arr[i]!=copy[i] || arr[j] != copy[j]) && x-count>=1) {
				arr[i]=arr[j]='9';
				count++;
			}
		}
		String ans="";
		for(int i=0;i<n;i++) {
			ans+=arr[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int x=s.nextInt();
		s.close();
		System.out.println(lPString(str, x));
	}
}
