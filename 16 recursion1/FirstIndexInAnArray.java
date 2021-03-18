package recursion1;

//Given an array of length N and an integer x, you need to find and return the first index of integer x 
//present in the array. Return -1 if it is not present in the array.
//First index means, the index of first occurrence of x in the input array.

public class FirstIndexInAnArray {
	private static int firstIndex(int input[], int x, int s) {
		if(s == input.length) {
			return -1;
		}
		if(input[s] == x) {
			return s;
		}
		return firstIndex(input, x, s+1);
	}
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x, 0);
	}
}
