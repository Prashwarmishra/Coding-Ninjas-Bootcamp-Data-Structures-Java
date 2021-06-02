package hashMap;

//Given an array consisting of positive and negative integers, find the length of the longest subarray whose sum is zero.

public class LongestSubsetZeroSum {
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			int sum = arr[i];
			for(int j=i+1; j<arr.length; j++) {
				sum += arr[j];
				count++;
				if(sum == 0 && count > max) {
					max = count;
				}
			}
		}
		return max;
	}
}
