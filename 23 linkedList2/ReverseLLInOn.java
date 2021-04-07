package linkedList2;

class Pair{
	Node<Integer> head;
	Node<Integer> tail;
	public Pair(Node<Integer> head, Node<Integer> tail) {
		this.head = head;
		this.tail = tail;
	}
}

public class ReverseLLInOn {
	
	public static Pair reverseLL(Node<Integer> head) {
		if(head == null || head.next == null) {
			return new Pair(head, head);
		}
		Pair ans = reverseLL(head.next);
		ans.tail.next = head;
		head.next = null;
		return new Pair(ans.head, head);
	}
	
	public static Node<Integer> reverseLinkedListRec(Node<Integer> head){
		return reverseLL(head).head;
	}
}
