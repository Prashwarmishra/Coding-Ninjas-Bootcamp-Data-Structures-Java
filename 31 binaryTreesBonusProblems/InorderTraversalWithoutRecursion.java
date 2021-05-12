package binaryTreesBonusProblems;

import java.util.Stack;

//Given a binary tree, print the inorder traversal of a given tree without using recursion.

public class InorderTraversalWithoutRecursion {
	
	public static void inOrder(BinaryTreeNode<Integer> root) {
        Stack<BinaryTreeNode<Integer>> st = new Stack<>();
        st.add(root);
        
        while(!st.isEmpty()) {
        	BinaryTreeNode<Integer> curr = st.peek();
        	if(curr.left != null && curr.left.data != -1) {
        		st.add(curr.left);
        	}else {
        		System.out.print(st.pop());
        		if(curr.right != null && curr.right.data != -1) {
        			st.add(curr.right);
        		}
        		curr.data = -1;
        	}
        }
    }
}
