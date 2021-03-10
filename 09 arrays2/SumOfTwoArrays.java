package arrays2;

//Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. 
//Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). 
//The idea here is to represent each array/list as an integer in itself of digits N and M.
//You need to find the sum of both the input arrays/list treating them as two integers and put the result 
//in another array/list i.e. output array/list will also contain only single digit at every index.

public class SumOfTwoArrays {
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	int m=arr1.length, n=arr2.length;
    	int k=output.length-1, carry=0;
    	int i=m-1,j=n-1;
    	for(;i>=0 && j>=0;i--,j--) {
    		int sum=arr1[i]+arr2[j]+carry;
    		output[k--]=sum%10;
    		carry=sum/10;
    	}
    	while(i>=0) {
            int sum=arr1[i--]+carry;
    		output[k--]=(sum)%10;
            carry=sum/10;
    	}
    	while(j>=0) {
            int sum=arr2[j--]+carry;
    		output[k--]=(sum)%10;
            carry=sum/10;
    	}
        output[0]=carry;
    }
}
