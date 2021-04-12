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
	
	
	public static DoublyLinkedListNode<Integer> sorting(DoublyLinkedListNode<Integer> head) {
        if(head == null || head.next == null) {
        	return head;
        }
		DoublyLinkedListNode<Integer> temp = head.next;
		while(temp.next != null) {
			if(temp.data >= temp.prev.data && temp.data >= temp.next.data) {
				DoublyLinkedListNode<Integer> head2 = temp.next;
				temp.next = null;
				head2.prev = null;
			}
			temp = temp.next;
		}
		
		return head;
    }	
}
