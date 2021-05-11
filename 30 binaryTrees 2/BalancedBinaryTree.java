package binaryTrees2;

class numPair{
	boolean isBalanced;
	int height;
	
	numPair(boolean isBalanced, int height) {
		this.isBalanced = isBalanced;
		this.height = height;
	}
}

public class BalancedBinaryTree {
	
	public static numPair isBinaryTreeBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return new numPair(true, 0);
		}
		
		numPair ansLeft = isBinaryTreeBalanced(root.left);
		numPair ansRight = isBinaryTreeBalanced(root.right);
		
		int maxHeight = 1 + Math.max(ansLeft.height, ansRight.height);
		
		if(!ansLeft.isBalanced || !ansRight.isBalanced) {
			return new numPair(false, maxHeight);
		}
		
		boolean currBalanced = true;
		
		if(Math.abs(ansLeft.height - ansRight.height) > 1) {
			currBalanced = false;
		}
		
		return new numPair(currBalanced, maxHeight);
	}
}
