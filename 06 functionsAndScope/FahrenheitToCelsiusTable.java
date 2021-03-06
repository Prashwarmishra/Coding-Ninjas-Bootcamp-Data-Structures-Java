package functionsAndScope;

import java.util.Scanner;

//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all 
//Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

public class FahrenheitToCelsiusTable {
	
	public static void convertFToC(int s, int e, int w) {
		while(s<=e) {
			int ans=(int)((s-32)*(5.0/9));
			System.out.println(s+" "+ans);
			s+=w;
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int w=s.nextInt();
		s.close();
		convertFToC(start, end, w);
	}
}
