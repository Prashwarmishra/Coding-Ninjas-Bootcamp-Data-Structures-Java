package timeComplexity;

import java.util.Arrays;

//You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in 
//the array/list which sum to X.

public class TripletSum {
	public static int tripletSum(int[] arr, int num) {
		int count=0;
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			for(int j=i+1,k=n-1;j<k;) {
				int curr = arr[i]+arr[j]+arr[k];
				if(curr<num) {
					j++;
				}else if(curr>num) {
					k--;
				}else {
					if(arr[j] == arr[k]) {
						count+=((k-j)*(k-j+1))/2;
						break;
					}
					int p=j+1,q=k-1;
					while(arr[p] == arr[j]) {
						p++;
					}
					while(arr[q] == arr[k]) {
						q--;
					}
					count+=(p-j)*(k-q);
					j=p;k=q;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println(tripletSum(arr, 12));
	}
}
