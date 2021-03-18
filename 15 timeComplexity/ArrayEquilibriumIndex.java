package timeComplexity;

//For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.
//Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] 
//is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item 
//at the index 'i' is not included in either part.

public class ArrayEquilibriumIndex {
	public static int arrayEquilibriumIndex(int[] arr){  
		int sum=0, n=arr.length;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		int leftSum=0;
		for(int i=0;i<n;i++) {
			sum-=arr[i];
			if(leftSum == sum) {
				return i;
			}
			leftSum+=arr[i];
		}
		return -1;
	}
}
