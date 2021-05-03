package binaryTrees;

public class NumberOfNodes {

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int countLeft = countNodes(root.left);
		int countRight = countNodes(root.right);
		return countLeft+countRight+1;
	}
}
