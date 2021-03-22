package test4;

//Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..
//(n-1)th row will be printed 1 time.

public class Print2DArray {
	public static void print2DArray(int input[][]) {
		for(int i=0;i<input.length;i++) {
			int count = 0;
			while(count < (input.length-i)) {
				for(int j=0;j<input[i].length;j++) {
					System.out.print(input[i][j]+" ");
				}
				System.out.println();
				count++;
			}
		}
	}
}
