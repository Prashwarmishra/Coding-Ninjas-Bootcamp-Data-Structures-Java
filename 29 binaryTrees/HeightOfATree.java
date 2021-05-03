package binaryTrees;

//For a given Binary Tree of integers, find and return the height of the tree.

public class HeightOfATree {
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight)+1;
	}
}
