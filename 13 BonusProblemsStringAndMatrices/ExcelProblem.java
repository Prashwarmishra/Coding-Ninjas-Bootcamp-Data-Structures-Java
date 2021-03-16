package BonusProblemsStringAndMatrices;

import java.util.Scanner;

//In MS Excel you have columns pattern as A, B, C, … ,Z, AA, AB, AC,…. ,AZ, BA, BB, … ZZ, AAA, AAB ….. etc. 
//This means, column 1 is named as “A”, column 2 as “B”, column 27 as “AA”.
//You are given a column number, and you have to find its corresponding Excel column name

public class ExcelProblem {
	private static String convertToAlpha(int n) {
		String ans="";
		while(n>0) {
			int rem=n%26;
			ans=(char)(64+rem)+ans;
			n/=26;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		System.out.println(convertToAlpha(n));
	}
}
