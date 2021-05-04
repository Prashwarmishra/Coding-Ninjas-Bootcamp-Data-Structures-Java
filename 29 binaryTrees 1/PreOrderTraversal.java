package binaryTrees;

//For a given Binary Tree of integers, print the pre-order traversal.

public class PreOrderTraversal {
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
