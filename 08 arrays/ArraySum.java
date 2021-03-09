package arrays;

//Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

public class ArraySum {
	public static int sum(int[] arr) {
        int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		return sum;
	}
}
