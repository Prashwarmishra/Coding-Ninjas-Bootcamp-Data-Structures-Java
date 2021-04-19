package test5;

//Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place
//(i.e. without using extra space).

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class NextNumber {
	
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> fwd = null;
		
		while(curr != null) {
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		
		return prev;
	}
	
	
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		
		head = reverse(head);
		
		LinkedListNode<Integer> temp = head;
		boolean isIncreased = false;
		
		while(temp.next != null && !isIncreased) {
			if(temp.data != 9) {
				temp.data += 1;
				isIncreased = true;
			}else {
				temp.data = 0;
			}
			temp = temp.next;
		}
		
		if(temp.next == null && !isIncreased) {
			if(temp.data != 9) {
				temp.data += 1;
			}else {
				temp.data = 0;
				LinkedListNode<Integer> newNode = new LinkedListNode<>(1);
				temp.next = newNode;
			}
		}
		
   		return reverse(head);
	}
}
