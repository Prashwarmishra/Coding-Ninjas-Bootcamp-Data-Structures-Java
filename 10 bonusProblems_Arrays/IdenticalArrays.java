package bonusProblems_Arrays;

import java.util.Scanner;

//You are given two input arrays of same size n, which contains the same elements but placed in a different order. 
//Elements present in the first or second array should be distinct. You have to make the second array same as the 
//first array using a minimum number of swaps.


public class IdenticalArrays {
	private static int compareArr(int[] arr1, int[] arr2) {
		int n=arr1.length;
		int count=0;
		int[] num=new int[n];
		//build the expectation array
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr2[i]==arr1[j]) {
					num[i]=j;
					break;
				}
			}
		}
		//compare the index with the content of the expectation array, if unequal, put array's content to it's 
		//correct place
		for(int i=0;i<n;i++) {
			if(i != num[i]) {
				for(int j=(i+1)%n;j<n;j++) {
					if(i == num[j]) {
						count++;
						int temp=num[i];
						num[i]=num[j];
						num[j]=temp;
						break;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=s.nextInt();
		}
		s.close();
		System.out.println(compareArr(arr1, arr2));
	}
}
