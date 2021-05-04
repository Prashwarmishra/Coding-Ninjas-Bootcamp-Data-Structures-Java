package binaryTrees;

public class NumberOfLeafNodes {
	
	public static int countLeafNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		return countLeafNodes(root.left)+countLeafNodes(root.right);
	}
}
