package bonusProblems_Arrays;

import java.util.Scanner;

//1. CodingNinjas has given you a number. You have to print number, preceded by given number in 
//lexicographically sorted permutation of all digits of given number.
//2. If the number is last element of lexicographically sorted permutation of all digits of given 
//number, then print the first element of the sorted list.

public class SuccessorProblem {
	private static int[] convertToArray(int n) {
		int temp=n;
		int count=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		int[] arr=new int[count];
		int i=arr.length-1;
		while(n>0) {
			arr[i--]=n%10;
			n/=10;
		}
		return arr;
	}
	private static void reverse(int[] arr, int s, int e) {
		while(s<e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;e--;
		}
	}
	private static int findSuccessor(int[] arr) {
		int n=arr.length;
		boolean isGreatest=true;
		for(int i=n-1;i>0;i--) {
			if(arr[i-1]<arr[i]) {
				isGreatest=false;
				int num=arr[i-1];
				for(int j=n-1;j>=0;j--) {
					if(arr[j]>num) {
						arr[i-1]=arr[j];
						arr[j]=num;
						reverse(arr, i, n-1);
						break;
					}
				}
				break;
			}
		}
		if(isGreatest) {
			reverse(arr,0, n-1);
		}
		String ans="";
		for(int i=0;i<n;i++) {
			ans+=arr[i];
		}
		return Integer.parseInt(ans);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		int[] arr=convertToArray(n);
		System.out.println(findSuccessor(arr));
	}
}
