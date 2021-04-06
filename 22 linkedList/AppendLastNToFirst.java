package linkedList;

//You have been given a singly linked list of integers along with an integer 'N'. Write a function 
//to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.

public class AppendLastNToFirst {
	private static int countTotal(LinkedListNode<Integer> head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		int len = countTotal(head);
        if(n >= len || n == 0){
            return head;
        }
		int count = 0;
		LinkedListNode<Integer> temp = head;
		
		while(temp != null && count < len-n-1) {
			count++;
			temp = temp.next;
		}
		
		LinkedListNode<Integer> head2 = temp.next;
		temp.next = null;
		temp = head2;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		return head2;
	}
}
