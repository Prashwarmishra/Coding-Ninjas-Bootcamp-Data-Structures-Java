package binaryTreesBonusProblems;

//Given a binary tree, print the Morris preorder traversal of the given tree.

public class MorrisPreOrderTraversal {
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
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
					System.out.print(root.data + " ");
					fwd.right = root;
					root = root.left;
				}else {
					fwd.right = null;
					root = root.right;
				}
			}
		}
    }
}
