package bonusProblems_Arrays;

import java.util.Scanner;

public class PairWithGivenSum {
	private static int findPivotIndex(int[] arr,int s, int e) {
		int n=arr.length;
		while(s<=e) {
			int m=(s+e)/2;
			int prev=(m-1+n)%n;
			int next=(m+1)%n;
			if(arr[m]>arr[prev] && arr[m]>arr[next]) {
				return m;
			}else if(arr[m]<arr[s]) {
				e=m-1;
			}else {
				s=m+1;
			}
		}
		return -1;
	}
	private static boolean pairSum(int[] arr, int x) {
		int pivotIndex=findPivotIndex(arr, 0, arr.length);
		System.out.println(pivotIndex);
		for(int i=pivotIndex,j=pivotIndex+1;i>=0 && j<arr.length;) {
			int sum=arr[i]+arr[j];
			if(sum == x) {
				return true;
			}else if(sum>x) {
				i--;
			}else {
				j++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		s.close();
		System.out.println(pairSum(arr, x));
	}
}
