package recursion1;

//Given an array of length N and an integer x, you need to find and return the last index of integer x 
//present in the array. Return -1 if it is not present in the array. Last index means - if x is present 
//multiple times in the array, return the index at which x comes last in the array.
//You should start traversing your array from 0, not from (N - 1).

public class LastIndexInAnArray {
	private static int lastIndex(int input[], int x, int s, int ans) {
		if(s == input.length) {
			return ans;
		}
		if(input[s] == x) {
			ans=s;
		}
		return lastIndex(input, x, s+1, ans);
	}
	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, 0, -1);
	}
}
