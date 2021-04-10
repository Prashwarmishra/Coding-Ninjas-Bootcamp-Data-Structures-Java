package linkedListBonusQuestions;

public class SumOfTwoNumbers {
	
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> ans = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return ans;
	}
	
	public static LinkedListNode<Integer> addNumbers(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2
			, LinkedListNode<Integer> ansHead, LinkedListNode<Integer> ansTail, int carry) {  
		
		if(head1 == null) {
			while(head2 != null) {
				int sum = head2.data+carry;
				ansTail.next = new LinkedListNode<Integer>(sum%10);
				carry = sum/10;
				head2 = head2.next;
				ansTail = ansTail.next;
			}
			return ansHead;
		}
		if(head2 == null) {
			while(head1 != null) {
				int sum = head1.data+carry;
				ansTail.next = new LinkedListNode<Integer>(sum%10);
				carry = sum/10;
				head1 = head1.next;
				ansTail = ansTail.next;
			}
			return ansHead;
		}
		int sum = head1.data + head2.data;
		ansTail.next = new LinkedListNode<Integer>(sum%10);
		
        return addNumbers(head1.next, head2.next, ansHead, ansTail.next, sum/10);
	}
	
	public static LinkedListNode<Integer> addNumbers(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) { 
		if(head1 == null) {
			return head2;
		}if(head2 == null) {
			return head1;
		}
		head1 = reverse(head1);
		head2 = reverse(head2);
		int sum = head1.data + head2.data;
		LinkedListNode<Integer> ansHead = new LinkedListNode<Integer>(sum%10);
		LinkedListNode<Integer> ansTail = ansHead;
		int carry = sum/10;
        return reverse(addNumbers(head1.next, head2.next, ansHead, ansTail, carry));
	}
}
