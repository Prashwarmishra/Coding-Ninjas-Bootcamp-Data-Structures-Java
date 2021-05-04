package binaryTrees;

//For a given a Binary Tree of integers, replace each of its data with the depth of the tree.


public class ReplaceNodeWithDepth {
	public static void changeToDepthTree(BinaryTreeNode<Integer> root, int k) {
	    if(root == null) {
	    	return;
	    }
	    root.data = k;
	    changeToDepthTree(root.left, k+1);
	    changeToDepthTree(root.right, k+1);
	}
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    changeToDepthTree(root, 0);
	}
}
