package bonusProblems_Arrays;

import java.util.Scanner;

//Aahad and Harshit always have fun by solving problems. Harshit took a sorted array and rotated it 
//clockwise by unknown amount. For example, he took a sorted array = [1, 2, 3, 4, 5] and if he rotates 
//it by 2, then the array becomes: [4, 5, 1, 2, 3].
//After rotating a sorted array, Harshit gave Aahad a number which Harshit wanted him to search in the array. 
//If he founds it, he had to shout the index of the number, otherwise he had to shout -1.

public class SearchInArray {
	private static int findPivotIndex(int[] arr, int s, int e) {
		int n=arr.length;
		while(s<=e) {
			int mid=(s+e)/2;
			int prev=(mid-1+n)%n, next=(mid+1)%n;
			if(arr[mid]>=arr[prev] && arr[mid]>=arr[next]) {
				return mid;
			}else if(arr[mid]<arr[s]) {
				e=mid-1;
			}else {
				s=mid+1;
			}
		}
		return -1;
	}
	private static int binarySearch(int arr[], int x, int s, int e) {
		while(s<=e) {
			int m=(s+e)/2;
			if(arr[m] == x) {
				return m;
			}else if(arr[m]>x){
				e=m-1;
			}else {
				s=m+1;
			}
		}
		return -1;
	}
	private static int findElement(int[] arr, int x) {
		int pivotIndex = findPivotIndex(arr, 0, arr.length);
		if(x<arr[0]) {
			return binarySearch(arr, x, pivotIndex+1, arr.length);
		}else {
			return binarySearch(arr, x, 0, pivotIndex);
		}
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
		System.out.println(findElement(arr, x));
	}
}
