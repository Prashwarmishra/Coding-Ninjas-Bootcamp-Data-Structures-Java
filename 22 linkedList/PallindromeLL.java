package linkedList;

//You have been given a head to a singly linked list of integers. Write a function check to whether the list 
//given is a 'Palindrome' or not.

public class PallindromeLL {
	
	private static int countLength(LinkedListNode<Integer> head) {
		int count = 0;
		while(head != null) {
			head = head.next;
			count++;
		}
		return count;
	}
	
	private static LinkedListNode<Integer> reverseLL(LinkedListNode<Integer> head){
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
	
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if(head == null || head.next == null){
            return true;
        }
		int len = countLength(head);
		int mid = len/2;
		LinkedListNode<Integer> temp = head;
		int count=0;
        
		while(temp != null && count < mid-1) {
			temp = temp.next;
			count++;
		}
		LinkedListNode<Integer> head2 = temp.next;
		temp.next = null;
		head2 = reverseLL(head2);
		
		while(head != null && head2 != null) {
			if(head.data != head2.data) {
				return false;
			}
			head = head.next;
			head2 = head2.next;
		}
		return true;
	}
	
}
