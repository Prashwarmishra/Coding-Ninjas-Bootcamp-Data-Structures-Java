package recursion2;
//Sort an array A using Quick Sort.
public class QuickSort {
	
	public static void quickSort(int[] input, int s, int e) {
		if(s>=e) {
			return;
		}
		int pivot = input[s];
		int count=0;
		for(int i=s+1; i<=e; i++) {
			if(input[i]<pivot) {
				count++;
			}
		} 
		input[s] = input[s+count];
		input[s+count] = pivot;
		
		int i=s, j=e;
		while(i<j) {
			if(input[i]<pivot) {
				i++;
			}else if(input[j]>=pivot) {
				j--;
			}else {
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;j--;
			}
		}
		quickSort(input, s, s+count-1);
		quickSort(input, s+count+1, e);
	}
	public static void main(String[] args) {
		int[] input= {9,8,7,4,5,6,3,2,1};
		quickSort(input, 0, input.length-1);
		for(int i:input) {
			System.out.print(i+" ");
		}
	}
}
