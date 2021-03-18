package recursion1;

//Given an array of length N, you need to find and return the sum of all elements of the array.

public class SumOfArray {
	private static int sum(int input[], int s) {
		if(s == input.length) {
			return 0;
		}
		return input[s]+sum(input, s+1);
	}
	public static int sum(int input[]) {
		return sum(input, 0);
	}
}
