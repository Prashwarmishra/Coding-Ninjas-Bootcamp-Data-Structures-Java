package binaryTrees2;

class Pair{
	boolean isBalanced;
	int height;
	
	 Pair(boolean isBalanced, int height) {
		this.isBalanced = isBalanced;
		this.height = height;
	}
}

public class BalancedBinaryTree {
	
	public static Pair isBinaryTreeBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return new Pair(true, 0);
		}
		
		Pair ansLeft = isBinaryTreeBalanced(root.left);
		Pair ansRight = isBinaryTreeBalanced(root.right);
		
		int maxHeight = 1 + Math.max(ansLeft.height, ansRight.height);
		
		if(!ansLeft.isBalanced || !ansRight.isBalanced) {
			return new Pair(false, maxHeight);
		}
		
		boolean currBalanced = true;
		
		if(Math.abs(ansLeft.height - ansRight.height) > 1) {
			currBalanced = false;
		}
		
		return new Pair(currBalanced, maxHeight);
	}
}
