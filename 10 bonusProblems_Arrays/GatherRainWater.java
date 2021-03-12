package bonusProblems_Arrays;

import java.util.Scanner;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//compute how much water it is able to trap after raining.


public class GatherRainWater {
	private static int getMaxIndex(int arr[]) {
		int max=Integer.MIN_VALUE;
		int maxIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxIndex=i;
			}
		}
		return maxIndex;
	}
	private static int getCollection(int[] arr) {
		int maxIndex=getMaxIndex(arr);
		int ans=0;
		
		int currMax=arr[0];
		for(int i=1;i<maxIndex;i++) {
			if(arr[i]>currMax) {
				currMax=arr[i];
			}else {
				ans+=(currMax-arr[i]);
			}
		}
		currMax=arr[arr.length-1];
		for(int i=arr.length-2;i>maxIndex;i--) {
			if(arr[i]>currMax) {
				currMax=arr[i];
			}else {
				ans+=(currMax-arr[i]);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		s.close();
		System.out.println(getCollection(arr));
	}
}
