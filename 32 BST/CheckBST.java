package bst;

public class CheckBST {
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int ansLeft = minimum(root.left);
		int ansRight = minimum(root.right);
		
		return Math.min(root.data, Math.min(ansLeft, ansRight));
	}
	
	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int ansLeft = maximum(root.left);
		int ansRight = maximum(root.right);
		
		return Math.max(root.data, Math.max(ansLeft, ansRight));
	}
	
	public static boolean checkBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int maxOnLeft = maximum(root.left);
		if(root.data <= maxOnLeft) {
			return false;
		}
		int minOnRight = minimum(root.right);
		if(root.data > minOnRight) {
			return false;
		}
		if(!checkBST(root.left) || !checkBST(root.right)) {
			return false;
		}
		return true;
	}
	
}
