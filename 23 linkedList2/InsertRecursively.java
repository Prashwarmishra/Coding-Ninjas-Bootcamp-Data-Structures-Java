package linkedList2;

public class InsertRecursively {
	
	public static Node<Integer> insertRec(Node<Integer> head, int pos, int data){
		if(head == null && pos > 0) {
			return head;
		}
		if(pos == 0) {
			Node<Integer> newHead = new Node<>(data);
			newHead.next = head;
			return newHead;
		}
		head.next = insertRec(head.next, pos-1, data);
		return head;
	}
}
