package arrays;

//You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
//Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging 
//from 0 to 3 and among these, there is a single integer value that is present twice. You need to find 
//and return that duplicate number present in the array.

public class FindDuplicate {
	public static int duplicateNumber(int arr[]) {
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		//sum of n natural numbers is (n*(n-1))/2, here we have n-2 numbers
		
		int temp=((n-1)*(n-2))/2;
		return (sum-temp);
	}
}
