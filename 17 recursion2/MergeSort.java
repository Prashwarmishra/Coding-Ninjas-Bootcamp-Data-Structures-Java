package recursion2;

public class MergeSort {
	private static void merge(int[] arr, int[] arr1, int[] arr2) {
		int i=0,j=0,k=0;
		int m=arr1.length, n=arr2.length;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				arr[k++]=arr1[i++];
			}else {
				arr[k++]=arr2[j++];
			}
		}
		while(i<m) {
			arr[k++]=arr1[i++];
		}
		while(j<n) {
			arr[k++]=arr2[j++];
		}
	}
	public static void mergeSort(int[] input){
		if(input.length <= 1) {
			return;
		}
		int m = input.length/2;
		int[] arr1 = new int[m];
		int[] arr2 = new int[input.length - arr1.length];
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=input[k++];
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=input[k++];
		}
		mergeSort(arr1);
		mergeSort(arr2);
		merge(input, arr1, arr2);
	}
	public static void main(String[] args) {
		int[] arr={9,8,7,4,5,6,3,2,1};
		mergeSort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
