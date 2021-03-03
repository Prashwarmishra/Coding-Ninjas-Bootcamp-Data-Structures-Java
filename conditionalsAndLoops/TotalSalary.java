package conditionalsAndLoops;

//Write a program to calculate the total salary of a person. The user has to enter the basic salary 
//(an integer) and the grade (an uppercase character), 
//and depending upon which the total salary is calculated as:
//    totalSalary = basic + hra + da + allow – pf

import java.util.Scanner;

public class TotalSalary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base=s.nextInt();
		char grade=s.next().charAt(0);
		
		double hra=(0.20*base);
		double da=(0.50*base);
		double allow=1300;
		if(grade == 'A') {
			allow=1700;
		}else if(grade == 'B') {
			allow=1500;
		}
		double pf=(0.11*base);
		int total=(int)Math.round((base+hra+da+allow-pf));
		System.out.println(total);
		s.close();
	}
}
