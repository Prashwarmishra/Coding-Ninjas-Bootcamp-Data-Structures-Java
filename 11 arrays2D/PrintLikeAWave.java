package arrays2D;

//For a given two-dimensional integer array/list of size (N x M), print the array/list in a 
//sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.


public class PrintLikeAWave {
	public static void wavePrint(int mat[][]){
		int r=mat.length;
		if(r<=0) {
			return;
		}
		int c=mat[0].length;
		int count=0;
		while(count<c) {
			if(count%2 == 0) {
				for(int i=0;i<r;i++) {
					System.out.print(mat[i][count]+" ");
				}
			}else {
				for(int i=r-1;i>=0;i--) {
					System.out.print(mat[i][count]+" ");
				}
			}
			count++;
		}
	}
}
