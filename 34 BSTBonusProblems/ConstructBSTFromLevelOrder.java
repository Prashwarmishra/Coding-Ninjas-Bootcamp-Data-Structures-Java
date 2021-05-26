package bstBonusProblems;

import java.util.LinkedList;
import java.util.Queue;

//You are given level order traversal of a Binary Search Tree in N-sized array, you have to construct a BST from 
//this level order traversal.

class Trio{
	BinaryTreeNode<Integer> root;
	int min, max;
	
	public Trio(BinaryTreeNode<Integer> root, int min, int max) {
		this.root = root;
		this.min = min;
		this.max = max;
	}
}

public class ConstructBSTFromLevelOrder {
	
	public static BinaryTreeNode<Integer> constructBST(int[] preorder, int n) {
		if(preorder.length <= 0) {
			return null;
		}
		
		Queue<Trio> q = new LinkedList<>();
		int s = 0;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preorder[s++]);
		Trio temp = new Trio(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		q.add(temp);
		
		while(s < preorder.length && !q.isEmpty()) {
			Trio curr = q.poll();
			if(preorder[s] < curr.root.data && preorder[s] > curr.min) {
				BinaryTreeNode<Integer> ansLeft = new BinaryTreeNode<Integer>(preorder[s++]);
				curr.root.left = ansLeft;
				q.add(new Trio(ansLeft, curr.min, curr.root.data));
			}
			if(s < preorder.length && preorder[s] >= curr.root.data && preorder[s] < curr.max) {
				BinaryTreeNode<Integer> ansRight = new BinaryTreeNode<Integer>(preorder[s++]);
				curr.root.right = ansRight;
				q.add(new Trio(ansRight, curr.root.data, curr.max));
			}
		}
		return root;
    }
}
