package arrays;

//You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and 
//you need not worry about the array.
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 
//1,3,.......4,2.

public class ArrangeNumbersInAnArray {
	public static void arrange(int[] arr, int n) {
    	int current=1;
        if(n%2 == 1) {
    		arr[n/2]=n;
    	}
    	for(int i=0,j=n-1;i<j;i++,j--) {
    		arr[i]=current++;
    		arr[j]=current++;
    	}
    }
}
