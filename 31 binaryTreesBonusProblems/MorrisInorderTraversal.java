package binaryTreesBonusProblems;

//Given a binary tree, print the inorder traversal of a given tree without using recursion and stack.

public class MorrisInorderTraversal {
	
	public static void inOrder(BinaryTreeNode<Integer> root) {
		BinaryTreeNode<Integer> fwd;
        while(root != null) {
        	fwd = root.left;
        	if(fwd == null) {
        		System.out.print(root.data + " ");
        		root = root.right;
        	}else {
        		while(fwd.right != null && fwd.right != root) {
        			fwd = fwd.right;
        		}
        		if(fwd.right == null) {
        			fwd.right = root;
        			root = root.left;
        		}else {
        			System.out.print(root.data + " ");
        			fwd.right = null;
        			root = root.right;
        		}
        	}
        }
    }
}
