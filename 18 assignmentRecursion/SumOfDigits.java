package assignmentRecursion;

//Write a recursive function that returns the sum of the digits of a given integer.

public class SumOfDigits {
	public static int sumOfDigits(int input){
		if(input<10) {
			return input;
		}
		return input%10+sumOfDigits(input/10);
	}
}
