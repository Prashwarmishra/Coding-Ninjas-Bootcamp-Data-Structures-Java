package arrays2D;

//For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both 
//the diagonals and at all the four boundaries.


public class TotalSumOfBoundariesAndDiagonals {
	public static void totalSum(int[][] mat) {
		int r=mat.length;
		if(r<=0) {
			System.out.println(0);
			return;
		}
		int sum=0;
		int c=mat[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(j==0 || j==c-1 || i==0 || i==r-1 || i==j || i==r-j-1) {
					sum+=mat[i][j];
					mat[i][j]=0;
				}
			}
		}
		System.out.println(sum);
	}
}
