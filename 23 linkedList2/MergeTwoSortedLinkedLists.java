package linkedList2;

//You have been given two sorted(in ascending order) singly linked lists of integers.
//Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) 
//and return the new head to the list.

public class MergeTwoSortedLinkedLists {
	
//	Recursive solution, though would not work for last test case as the list is too big
//	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
//        if(head1 == null) {
//        	return head2;
//        }
//        if(head2 == null) {
//        	return head1;
//        }
//        if(head1.data < head2.data) {
//        	head1.next = mergeTwoSortedLinkedLists(head1.next, head2);
//        	return head1;
//        }else {
//        	head2.next = mergeTwoSortedLinkedLists(head1, head2.next);
//        	return head2;
//        }
//    }
	
	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
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
}
