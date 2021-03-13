package arrays2D;

//For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, 
//you need to print in the order followed for every iteration:

public class PrintSpiral {
	public static void spiralPrint(int matrix[][]){
		int r=matrix.length;
		if(r<=0) {
			return;
		}
		int c=matrix[0].length;
		int rs=0,re=r-1;
		int cs=0,ce=c-1;
		int count=0;
		while(count<(r*c)) {
			for(int i=cs;i<=ce;i++) {
				System.out.print(matrix[rs][i]+" ");
				count++;
			}
            rs++;
			for(int i=rs;i<=re;i++) {
				System.out.print(matrix[i][ce]+" ");
				count++;
			}
            ce--;
			for(int i=ce;i>=cs;i--) {
				System.out.print(matrix[re][i]+" ");
				count++;
			}
            re--;
			for(int i=re;i>=rs;i--) {
				System.out.print(matrix[i][cs]+" ");
				count++;
			}
            cs++;
		}
	}
}
