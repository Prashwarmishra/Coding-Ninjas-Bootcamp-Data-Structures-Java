package operatorsAndForLoops;

import java.util.Scanner;

//You are given S a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to 
//split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that 
//the first part is strictly decreasing while the second is strictly increasing one.


public class CheckNumberSequence {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		s.close();
		
		boolean isDecreasing=true;
		for(int i=0;i<n-1;i++) {
			int diff=arr[i+1]-arr[i];
			if(!isDecreasing && diff<0) {
				System.out.println(false);
				return;
			}else if(diff>=0) {
				if(i == n-2) {
					System.out.println(false);
					return;
				}
				isDecreasing=false;
			}
		}
		System.out.println(true);
	}
}
