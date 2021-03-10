package arrays2;

//You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list 
//by D elements(towards the left).

public class RotateArray {
	public static void reverse(int[] arr, int s, int e) {
		for(int i=s,j=e-1;i<j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	public static void rotate(int[] arr, int d) {
		int n=arr.length;
		reverse(arr, 0, n);
		reverse(arr, 0, n-d);
		reverse(arr, n-d, n);
	}
}
