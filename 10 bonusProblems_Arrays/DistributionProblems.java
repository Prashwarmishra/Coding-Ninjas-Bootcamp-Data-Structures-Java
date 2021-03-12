package bonusProblems_Arrays;

import java.util.*;

//Anuj is one of the finest instructors at Coding Ninjas. He takes a batch of m students. 
//He has been given n number of chocolate cartons. Each carton can have a variable number 
//of chocolates. He has been given a task to distribute the chocolates to his students on 
//the occasion of Holi. Now, here is the tricky part, he needs to distribute the chocolates 
//in such a way that:
//
//	1. Each student gets one carton of chocolate.
//	2. The difference between the chocolate carton with the maximum number of chocolates 
//	and the carton with the minimum number of chocolates given to the students is minimum.


public class DistributionProblems {
	
	public static int findMin(int[] arr, int k) {
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-k+1;i++) {
			int diff=arr[i+k-1]-arr[i];
			if(diff<min) {
				min=diff;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		s.close();
		System.out.println(findMin(arr, k));
	}
}
