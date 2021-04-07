package linkedList2;

public class ReverseLLInO2n {
	
	public static Node<Integer> reverse(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> newHead = reverse(head.next);
		Node<Integer> temp = newHead;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		head.next = null;
		temp.next = head;
		return newHead;
	}
}
