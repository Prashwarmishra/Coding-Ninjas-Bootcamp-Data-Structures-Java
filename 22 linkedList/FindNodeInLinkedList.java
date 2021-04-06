package linkedList;

//You have been given a singly linked list of integers. Write a function that returns the index/position of an 
//integer data denoted by 'N' (if it exists). Return -1 otherwise.

public class FindNodeInLinkedList {
	
	public static int findNode(LinkedListNode<Integer> head, int n) {
		int index = 0;
		while(head != null) {
			if(head.data == n) {
				return index;
			}
			index++;
			head = head.next;
		}
		return -1;
	}
}
