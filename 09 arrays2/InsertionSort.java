package arrays2;

//Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 
//'Insertion Sort'.


public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
}
