package BonusProblemsStringAndMatrices;

import java.util.Scanner;

//You are given a matrix mat[M][N] of size M X N having 0's and 1's only, you have to modify it such 
//that if a matrix cell mat[i][j] is 1, then make all the cells of ith row and jth column as 1.

public class BinaryMatrix {
	public static void convertToBinary(int[][] arr, int r, int c) {
		if(r<=0) {
			return;
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j] == 1) {
					for(int p=0;p<r;p++) {
						if(arr[p][j] == 0) {
							arr[p][j]=-1;
						}
					}
					for(int p=0;p<c;p++) {
						if(arr[i][p] == 0) {
							arr[i][p]=-1;
						}
					}
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j] == -1) {
					arr[i][j]=1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		s.close();
		convertToBinary(arr, r, c);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
