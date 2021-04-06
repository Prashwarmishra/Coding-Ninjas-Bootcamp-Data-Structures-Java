package linkedList;

//You have been given a linked list of integers. Your task is to write a function that deletes a node from a given 
//position, 'pos'.

public class DeleteNodeInLL {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		if(pos == 0) {
			return head.next;
		}
		LinkedListNode<Integer> temp = head;
		int count=0;
		while(temp != null && count < pos-1) {
			count++;
			temp = temp.next;
		}
		if(count == pos-1 && temp.next != null) {
			temp.next = temp.next.next;
		}
		return head;
	}
}
