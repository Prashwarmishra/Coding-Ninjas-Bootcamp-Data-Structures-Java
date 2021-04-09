package linkedList2;

//Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
//'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not 
//a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.

class doubleNode{
	LinkedListNode<Integer> head;
	LinkedListNode<Integer> tail;
	public doubleNode(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
		this.head = head;
		this.tail = tail;
	}
}

public class KReverse {
	
	private static doubleNode reverseLinkedList(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return new doubleNode(head, head);
		}
		doubleNode ans = reverseLinkedList(head.next);
		ans.tail.next = head;
		head.next = null;
		return new doubleNode(ans.head, head);
	}
	
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		if(head == null) {
			return head;
		}
		int count = 1;
		LinkedListNode<Integer> temp = head;
		while(temp != null && count < k) {
			count++;
			temp = temp.next;
		}
		//put check here
		LinkedListNode<Integer> h2 = null;
		if(temp != null) {
			h2 = temp.next;
			temp.next = null;
		}
		doubleNode smallAns = reverseLinkedList(head);
		h2 = kReverse(h2, k);
		smallAns.tail.next = h2;
		
		return smallAns.head;
	}
}
