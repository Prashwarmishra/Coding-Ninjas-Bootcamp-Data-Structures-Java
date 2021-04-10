package linkedListBonusQuestions;

//You are given a pointer to a node and you have to delete that node from the singly linked list using only the given pointer.


public class DeleteANodeInLinkedList {
	public static void deleteNode(LinkedListNode<Integer> node) {
		node.data = node.next.data;
		node.next = node.next.next;
		return;
	}
}
