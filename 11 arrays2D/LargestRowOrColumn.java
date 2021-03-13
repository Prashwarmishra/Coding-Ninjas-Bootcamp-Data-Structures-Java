package arrays2D;

//For a given two-dimensional integer array/list of size (N x M), you need to find out 
//which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.


public class LargestRowOrColumn {
	public static void findLargest(int arr[][]){
		int max=Integer.MIN_VALUE;
		String ans="row 0 "+max;
		if(arr.length<=0) {
			System.out.println(ans);
			return;
		}
		int r=arr.length, c=arr[0].length;
		for(int i=0;i<r;i++) {
			int sum=0;
			for(int j=0;j<c;j++) {
				sum+=arr[i][j];
			}
			if(sum>max) {
				max=sum;
				ans="row "+i+" "+max;
			}
		}
		for(int j=0;j<c;j++) {
			int sum=0;
			for(int i=0;i<r;i++) {
				sum+=arr[i][j];
			}
			if(sum>max) {
				max=sum;
				ans="column "+j+" "+max;
			}
		}
		System.out.println(ans);
	}
}
