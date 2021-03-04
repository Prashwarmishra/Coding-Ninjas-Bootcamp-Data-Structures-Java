package conditionalsAndLoops;

//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
//you need to convert all Fahrenheit values from Start to End at the gap of W, into their 
//corresponding Celsius values and print the table.

import java.util.Scanner;

public class FarenheitTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int step=s.nextInt();
		
		while(start<=end) {
			double cel=(start-32)*(5.0/9);
			System.out.println(start+" "+(int)cel);
			start+=step;
		}
		s.close();
	}
}
