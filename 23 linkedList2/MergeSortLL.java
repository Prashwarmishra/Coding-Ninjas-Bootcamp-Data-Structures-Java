package linkedList2;

public class MergeSortLL {
	
	private static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> fast = head, slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	private static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		if(head1 == null) {
        	return head2;
        }
        if(head2 == null) {
        	return head1;
        }
        LinkedListNode<Integer> newHead = null, newTail = null;
        if(head1.data < head2.data) {
        	newHead = newTail = head1;
        	head1 = head1.next;
        }else {
        	newHead = newTail = head2;
        	head2 = head2.next;
        }
        while(head1 != null && head2 != null) {
        	if(head1.data < head2.data) {
            	newTail.next = head1;
            	newTail = newTail.next;
            	head1 = head1.next;
            }else {
            	newTail.next = head2;
            	newTail = newTail.next;
            	head2 = head2.next;
            }
        }
        
        while(head1 != null) {
        	newTail.next = head1;
        	head1 = head1.next;
        	newTail = newTail.next;
        }
        
        while(head2 != null) {
        	newTail.next = head2;
        	head2 = head2.next;
        	newTail = newTail.next;
        }
        
        return newHead;  
    }
	
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> mid = midPoint(head);
		LinkedListNode<Integer> temp = head;
		while(temp != mid) {
			temp = temp.next;
		}
		LinkedListNode<Integer> head2 = temp.next;
		temp.next = null;
		head = mergeSort(head);
		head2 = mergeSort(head2);
		head = mergeTwoSortedLinkedLists(head, head2);
		return head;
	}
}
