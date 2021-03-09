package arrays;

//You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements 
//in the array/list.

public class SwapAlternate {
	public static void swapAlternate(int arr[]) {
    	for(int i=0;i<arr.length-1;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
    }
}
