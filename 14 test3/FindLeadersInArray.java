package test3;

//Given an integer array A of size n. Find and print all the leaders present in the input array. 
//An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) 
//are less than or equal to A[i].

//Print all the leader elements separated by space and in the reverse order. That means whichever leader 
//comes at last should be printed first.

public class FindLeadersInArray {
	public static void leaders(int[] input) {
		int max=Integer.MIN_VALUE;
		for(int i=input.length-1;i>=0;i--) {
			if(input[i]>=max) {
				max=input[i];
				System.out.print(input[i]+" ");
			}
		}
	}
}
