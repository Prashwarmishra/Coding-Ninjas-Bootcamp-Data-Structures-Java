package bonusProblems_Arrays;

import java.util.Scanner;

//You are given a sorted array of size n, containing only numbers 0 and 1, you have to find the 
//transition point of the given input array. The transition point is a point where “0” ends and “1” begins.
//If there are no 1's in the input array then print -1

public class FindTransitionPoint {
	private static int findTransition(int[] arr) {
		int n=arr.length;
		int s=0,e=n-1;
		while(s<=e) {
			int m=(s+e)/2;
			if(arr[m] == 0) {
				s=m+1;
			}else {
				if(m == 0) {
					return 0;
				}else if(arr[m-1]==0) {
					return m;
				}else {
					e=m-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		s.close();
		System.out.println(findTransition(arr));
	}
}
