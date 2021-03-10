package arrays2;

//You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and 
//then rotated by some number 'K' in the clockwise direction.


public class CheckArrayRotation {
	public static int arrayRotateCheck(int[] arr){
		int min=Integer.MAX_VALUE;
		int minIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minIndex=i;
			}
		}
		return minIndex;
	}
}
