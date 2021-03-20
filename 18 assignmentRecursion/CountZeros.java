package assignmentRecursion;

//Given an integer N, count and return the number of zeros that are present in the given integer using recursion.

public class CountZeros {
	private static int countZerosRec(int input, int count) {
		if(input<10) {
			if(input==0) {
				count++;
			}
			return count;
		}
		if(input%10 == 0) {
			count++;
		}
		return countZerosRec(input/10, count);
	}
	public static int countZerosRec(int input){
		return countZerosRec(input, 0);
	}
}
