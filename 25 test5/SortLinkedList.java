package test5;

//Given a Linked List, which has nodes in alternating ascending and descending orders. Sort the list efficiently and 
//space complexity should be O(1).

public class SortLinkedList {
	
	private static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		LinkedListNode<Integer> curr = head, prev = null, fwd = null;
		while(curr != null) {
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		return prev;
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
	
	public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		LinkedListNode<Integer> head2 = null, tail = null, temp = head;
		
		while(temp != null) {
			if(head2 == null) {
				head2 = temp.next;
				tail = temp.next;
			}else {
				tail.next = temp.next;
				if(tail.next != null) {
					tail = tail.next;
				}
			}
			if(temp.next != null) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
		head2 = reverse(head2);
		head = mergeTwoSortedLinkedLists(head, head2);
		return head;
	}
}
