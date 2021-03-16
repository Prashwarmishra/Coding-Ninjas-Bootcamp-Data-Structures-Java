package test3;

//Given 2 sorted arrays (in increasing order), find a path through the intersections that produces 
//maximum sum and return the maximum sum.
//That is, we can switch from one array to another array only at common elements.
//If no intersection element is present, we need to take sum of all elements from the array with greater sum.

public class MaximiseTheSum {
	public static long maximumSumPath(int ar1[], int ar2[]) {
		long s1=0, s2=0, maxSum=0;
		int i=0,j=0;
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i]<ar2[j]) {
				s1+=ar1[i++];
			}else if(ar1[i]>ar2[j]) {
				s2+=ar2[j++];
			}else {
                s1+=ar1[i++];
                s2+=ar2[j++];
				maxSum+=Math.max(s1, s2);
				s1=s2=0;
			}
		}
		while(i<ar1.length) {
			s1+=ar1[i++];
		}
		while(j<ar2.length) {
			s2+=ar2[j++];
		}
		maxSum+=Math.max(s1, s2);
		return maxSum;
	}
	
}
