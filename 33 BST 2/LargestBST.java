package bst2;

//Given a Binary tree, find the largest BST subtree. That is, you need to find the BST with maximum height in 
//the given binary tree. You have to return the height of largest BST.

class Quad{
	int min, max, maxHeight;
	boolean isBST;
	
	public Quad(int min, int max, int maxHeight, boolean isBST) {
		this.min = min;
		this.max = max;
		this.maxHeight = maxHeight;
		this.isBST = isBST;
	}     
}

public class LargestBST {

	public static Quad largestBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return new Quad(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
		}
		
		Quad ansLeft = largestBST(root.left);
		Quad ansRight = largestBST(root.right);
		
		int currMin, currMax, currMaxHeight;
		boolean currBST = true;
		
		if(!ansLeft.isBST || !ansRight.isBST) {
			currBST = false;
		}
		
		if(root.data <= ansLeft.max || root.data > ansRight.min) {
			currBST = false;
		}
		
		currMaxHeight = Math.max(ansLeft.maxHeight, ansRight.maxHeight);
		if(currBST) {
			currMaxHeight += 1;
		}
		currMin = Math.min(root.data, Math.min(ansLeft.min, ansRight.min));
		currMax = Math.max(root.data, Math.max(ansLeft.max, ansRight.max));
		
		
		return new Quad(currMin, currMax, currMaxHeight, currBST);
	}

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		return largestBST(root).maxHeight;
	}
}
