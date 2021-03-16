package BonusProblemsStringAndMatrices;

import java.util.Scanner;

//Given an N*N integer square matrix, rotate it by 90 degrees in anti-clockwise direction.
//Try doing it without any extra space.

public class RotateMatrix {
	public static void rotate(int arr[][]){
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0,j=n-1;i<j;i++,j--) {
			for(int k=0;k<n;k++) {
				int temp=arr[i][k];
				arr[i][k]=arr[j][k];
				arr[j][k]=temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		s.close();
		rotate(arr);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
