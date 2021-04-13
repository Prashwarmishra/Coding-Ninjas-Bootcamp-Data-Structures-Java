package linkedListBonusQuestions;

//You are given a doubly linked list such that it is first increasing and then decreasing. 
//You have to sort this doubly linked list.
//Such types of linked lists are called biotonic doubly linked list. A strictly increasing or a strictly decreasing 
//list is also a biotonic doubly linked list.

class DoublyLinkedListNode<T> {
    T data;
    DoublyLinkedListNode<T> next;
    DoublyLinkedListNode<T> prev;
    
    DoublyLinkedListNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class SortTheLinkedList {
	
	public static DoublyLinkedListNode<Integer> reverse(DoublyLinkedListNode<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		DoublyLinkedListNode<Integer> ans = reverse(head.next);
		DoublyLinkedListNode<Integer> tail = head.next;
		tail.next = head;
		head.next = null;
		head.prev = tail;
		return ans;
	}
	
	public static DoublyLinkedListNode<Integer> merge(DoublyLinkedListNode<Integer> head1, DoublyLinkedListNode<Integer> head2){
		if(head1 == null) {
			return head2;
		}else if(head2 == null) {
			return head1;
		}
		DoublyLinkedListNode<Integer> newHead = null, newTail = null;
		
		if(head1.data < head2.data) {
			newHead = newTail = head1;
			head1 = head1.next;
		}else {
			newHead = newTail = head2;
			head2 = head2.next;
		}
		
		DoublyLinkedListNode<Integer> prev = null;
		
		while(head1 != null && head2 != null) {
			if(head1.data < head2.data) {
				newTail.next = head1;
				head1 = head1.next;
			}else {
				newTail.next = head2;
				head2 = head2.next;
			}
			prev = newTail;
			newTail = newTail.next;
			newTail.prev = prev;
		}
		
		while(head1 != null) {
			newTail.next = head1;
			head1 = head1.next;
			prev = newTail;
			newTail = newTail.next;
			newTail.prev = prev;
		}
		while(head2 != null) {
			newTail.next = head2;
			head2 = head2.next;
			prev = newTail;
			newTail = newTail.next;
			newTail.prev = prev;
		}
		
		return newHead;
	}
	
	public static DoublyLinkedListNode<Integer> sorting(DoublyLinkedListNode<Integer> head) {
        if(head == null || head.next == null) {
        	return head;
        }
		DoublyLinkedListNode<Integer> temp = head;
		
		while(temp.next != null) {
			if(temp.data > temp.next.data) {
				DoublyLinkedListNode<Integer> h2 = temp.next;
				temp.next = h2.prev = null;
				h2 = reverse(h2);
				return merge(head, h2);
			}
			temp = temp.next;
		}
		return head;
    }	
}
