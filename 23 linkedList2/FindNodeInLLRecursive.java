package linkedList2;

//Given a singly linked list of integers and an integer n, find and return the index for the first occurrence of 
//'n' in the linked list. -1 otherwise.
//Follow a recursive approach to solve this.

public class FindNodeInLLRecursive {
	public static int findNodeRec(LinkedListNode<Integer> head, int n, int s) {
		if(head == null) {
			return -1;
		}
		if(head.data == n) {
			return s;
		}
		return findNodeRec(head.next, n, s+1);
	}
	
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	return findNodeRec(head, n, 0);
	}
}
