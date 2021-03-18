package recursion1;

//Given an array of length N and an integer x, you need to find if x is present in the array or not. 
//Return true or false.

public class CheckNumberInArray {
	private static boolean checkNumber(int input[], int x, int s) {
		if(input.length == s) {
			return false;
		}
		if(input[s] == x) {
			return true;
		}
		return checkNumber(input, x, s+1);
	}
	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input, x, 0);
	}
}
