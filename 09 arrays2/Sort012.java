package arrays2;

//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort 
//this array/list in a 'single scan'.

public class Sort012 {
	public static void sort012(int[] arr){
    	int n=arr.length;
    	int p=0,q=n-1;
    	for(int i=0;i<=q;) {
    		if(arr[i]==0) {
    			int temp=arr[i];
    			arr[i++]=arr[p];
    			arr[p++]=temp;
    		}else if(arr[i] == 2) {
    			int temp=arr[i];
    			arr[i]=arr[q];
    			arr[q--]=temp;
    		}else {
    			i++;
    		}
    	}
    }
	public static void main(String[] args) {
		int[] arr= {2, 2, 0, 1, 1};
		sort012(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
