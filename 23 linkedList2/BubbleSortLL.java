package linkedList2;

//Given a singly linked list of integers, sort it using 'Bubble Sort.'

public class BubbleSortLL {
	private static int length(LinkedListNode<Integer> head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		int len = length(head);
		
		for(int i=0; i<len-1; i++) {
			LinkedListNode<Integer> current = head, prev = null, fwd = null;
			if(head.data > head.next.data) {
				fwd = head.next;
				head.next = fwd.next;
				fwd.next = head;
				head = fwd;
			}
			while(current.next != null) {
				if(current.data > current.next.data) {
					fwd = current.next;
					prev.next = fwd;
					current.next = fwd.next;
					fwd.next = current;
					prev = prev.next;
				}else {
					prev = current;
					current = current.next;
				}
			}
		}
		return head;
	}
}
