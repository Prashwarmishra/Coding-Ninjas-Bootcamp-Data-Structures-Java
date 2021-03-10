package arrays2;

public class PushZerosToEnd {
	public static void pushZerosAtEnd(int[] arr) {
		int curr=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[curr++]=arr[i];
			}
		}
		while(curr<arr.length) {
			arr[curr++]=0;
		}
	}
}
