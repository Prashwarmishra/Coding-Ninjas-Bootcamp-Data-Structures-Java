package arrays2;

//You have been given a random integer array/list(ARR) of size N. You are required to find and return 
//the second largest element present in the array/list.
//If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31

public class SecondLargestInArray {
	public static int secondLargestElement(int[] arr) {
		if(arr.length == 0) {
			return Integer.MIN_VALUE;
		}
		int largest=arr[0];
		int secondLargest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i]<largest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
}
