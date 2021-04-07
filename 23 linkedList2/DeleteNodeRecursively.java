package linkedList2;

//Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position 
//in the linked list recursively.

public class DeleteNodeRecursively {
	
	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	if(head == null) {
    		return head;
    	}
		if(pos == 0) {
			return head.next;
		}
		head.next = deleteNodeRec(head.next, pos-1);
		return head;
	}
}
