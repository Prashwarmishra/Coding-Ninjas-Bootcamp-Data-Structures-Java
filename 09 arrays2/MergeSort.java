package arrays2;

//You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them 
//into a third array/list such that the third array is also sorted.


public class MergeSort {
	public static int[] merge(int arr1[], int arr2[]) {
		int m=arr1.length,n=arr2.length;
		int[] arr=new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				arr[k++]=arr1[i++];
			}else{
				arr[k++]=arr2[j++];
			}
		}
		while(i<m) {
			arr[k++]=arr1[i++];
		}
		while(j<n) {
			arr[k++]=arr2[j++];
		}
		return arr;
	}
}
