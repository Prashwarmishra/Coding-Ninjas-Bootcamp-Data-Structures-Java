package linkedList2;

//For a given singly linked list of integers, arrange the elements such that all the even numbers are 
//placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.

public class EvenAfterOddLinkedList {
	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> oddHead = null;
		LinkedListNode<Integer> oddTail = null;
		LinkedListNode<Integer> evenHead = null;
		LinkedListNode<Integer> evenTail = null;
		
		while(head != null) {
			LinkedListNode<Integer> curr = new LinkedListNode<Integer>(head.data);
			if(head.data%2 != 0) {
				if(oddHead == null) {
					oddHead = curr;
					oddTail = curr;
				}else {
					oddTail.next = curr;
					oddTail = oddTail.next;
				}
			}else {
				if(evenHead == null) {
					evenHead = curr;
					evenTail = curr;
				}else {
					evenTail.next = curr;
					evenTail = evenTail.next;
				}
			}
			head = head.next;
		}
		
		if(oddHead == null) {
			return evenHead;
		}else {
			oddTail.next = evenHead;
			return oddHead;
		}
	}
}
