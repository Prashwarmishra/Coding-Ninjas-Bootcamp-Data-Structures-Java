package timeComplexity;

import java.util.Arrays;

//You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number 
//of pairs in the array/list which sum to 'num'.

public class PairSumInArray {
	public static int pairSum(int[] arr, int num) {
		Arrays.sort(arr);
		int ans=0;
		int n=arr.length;
		for(int i=0,j=n-1;i<j;) {
			int curr=arr[i]+arr[j];
			if(curr<num) {
				i++;
			}else if(curr>num) {
				j--;
			}else {
				if(arr[i] == arr[j]) {
					return ans+((j-i)*(j-i+1))/2;
				}
				int p=i+1,q=j-1;
				while(arr[p] == arr[i]) {
					p++;
				}
				while(arr[q] == arr[j]) {
					q--;
				}
				ans+=(p-i)*(j-q);
				i=p;j=q;
			}
		}
		return ans;
	}
}
