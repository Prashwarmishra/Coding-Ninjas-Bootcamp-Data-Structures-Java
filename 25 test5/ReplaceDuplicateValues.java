package test5;

//Given a linked list that contain some random integers from 1 to n with many duplicates. You need to replace each duplicate 
//element that is present in the linked list with the values n+1, n+2, and so on (starting from left to right in given LL).

public class ReplaceDuplicateValues {
	
	public static void changeLL(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return;
		}
		
		LinkedListNode<Integer> temp = head;
		int max = Integer.MIN_VALUE;
		
		while(temp != null) {
			if(temp.data > max) {
				max = temp.data;
			}
			temp = temp.next;
		}
		
		boolean[] arr = new boolean[max+1];
		temp = head;
		
		while(temp != null) {
			if(arr[temp.data]) {
				temp.data = ++max;
			}else {
				arr[temp.data] = true;
			}
			temp = temp.next;
		}
	}
}
