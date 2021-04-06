package linkedList;

//For a given singly linked list of integers, find and return its length. Do it using an iterative method.

public class LengthOfLinkedList {
	public static int length(LinkedListNode<Integer> head){
		int count=0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
}	
