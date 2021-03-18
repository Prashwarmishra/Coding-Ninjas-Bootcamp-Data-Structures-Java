package recursion1;

//Given is the code to print numbers from 1 to n in increasing order recursively. 
//But it contains few bugs that you need to rectify such that all the test cases pass.

public class PrintFirstNNaturalNumbers {
	public static void print(int n){
		if(n <= 1){
			System.out.print(n + " ");
            return;
		}
		print(n - 1);
        System.out.print(n+" ");
	}
}
