package bst;

//Given a BST, convert it into a sorted linked list. You have to return the head of LL.

class LLPair<T>{
	LinkedListNode<T> head;
	LinkedListNode<T> tail;
	
	public LLPair(LinkedListNode<T> head, LinkedListNode<T> tail) {
		this.head = head;
		this.tail = tail;
	}
}

class LinkedListNode<T> { 
	T data; 
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) { 
		this.data = data; 
	} 
}

public class BSTToLL {
	public static LLPair<Integer> construct(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return new LLPair<>(null, null);
		}
		
		LLPair<Integer> ansLeft = construct(root.left);
		LLPair<Integer> ansRight = construct(root.right);
		
		LinkedListNode<Integer> curr = new LinkedListNode<>(root.data);
		if(ansLeft.head == null) {
			curr.next = ansRight.head;
			if(ansRight.tail == null) {
				return new LLPair<>(curr, curr);
			}
			return new LLPair<>(curr, ansRight.tail);
		}else {
			ansLeft.tail.next = curr;
			curr.next = ansRight.head;
			if(ansRight.tail == null) {
				return new LLPair<>(ansLeft.head, curr);
			}
			return new LLPair<>(ansLeft.head, ansRight.tail);
		}
	}
	
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		return construct(root).head;
	}
}
