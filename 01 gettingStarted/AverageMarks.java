package gettingStarted;

import java.util.Scanner;

//Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 
//of a student considering all the three marks have been given in integer format. Now, you need to 
//calculate the average of the given marks and print it along with the name as mentioned in the output format section.
//All the test marks are in integers and hence calculate the average in integer as well. That is, you need to print 
//the integer part of the average only and neglect the decimal part.

public class AverageMarks {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char name=s.next().charAt(0);
		int marks1=s.nextInt();
		int marks2=s.nextInt();
		int marks3=s.nextInt();
		
		int ans=(marks1+marks2+marks3)/3;
		System.out.println(name);
		System.out.println(ans);
		
		s.close();
	}
}
