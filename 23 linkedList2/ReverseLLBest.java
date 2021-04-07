package linkedList2;

public class ReverseLLBest {
	public static Node<Integer> reverseLLBest(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> ans = reverseLLBest(head.next);
		Node<Integer> ansTail = head.next;
		ansTail.next = head;
		head.next = null;
		return ans;
	}
}
