package binaryTreesBonusProblems;

import java.util.Stack;

//Given a binary tree, print the iterative postorder traversal of a given tree.

public class IterativePostOrderTraversal {
	
	public static void postOrder(BinaryTreeNode<Integer> root) {
        Stack<BinaryTreeNode<Integer>> st = new Stack<>();
        st.add(root);
        while(!st.isEmpty()) {
        	BinaryTreeNode<Integer> curr = st.peek();
        	if(curr.left != null && curr.left.data != -1) {
        		st.add(curr.left);
        	}else{
        		if(curr.right == null || curr.right.data == -1) {
        			System.out.print(st.pop().data + " ");
        			curr.data = -1;
        		}else {
        			st.add(curr.right);
        		}
        	}
        }   
    }
}
