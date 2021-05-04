package binaryTrees;


public class LargestNode {
	
	public static int largestBinaryTreeNode(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int ansLeft = largestBinaryTreeNode(root.left);
		int ansRight = largestBinaryTreeNode(root.right);
		return Math.max(root.data, Math.max(ansLeft, ansRight));
	}
	
}
