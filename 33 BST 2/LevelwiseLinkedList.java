package bst2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Given a binary tree, write code to create a separate linked list for each level. You need to return the array which 
//contains head of each level linked list.

class LinkedListNode<T> { 
	T data; 
	LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.data = data; 
	} 
}

public class LevelwiseLinkedList {
	
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		
		q.add(root);
		q.add(null);
		
		LinkedListNode<Integer> head = null, tail = null;
		
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> curr = q.poll();
			if(curr == null) {
				ans.add(head);
				head = tail = null;
				if(q.isEmpty()) {
					break;
				}
				q.add(null);
			}else {
				LinkedListNode<Integer> temp = new LinkedListNode<>(curr.data);
				if(head == null) {
					head = tail = temp;
				}else {
					tail.next = temp;
					tail = tail.next;
				}
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
		}
		
		return ans;
	}
}
