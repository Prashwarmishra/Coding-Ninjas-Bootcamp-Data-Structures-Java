package binaryTrees;

//For a given a binary tree of integers and an integer X, find and return the total number of nodes of the given 
//binary tree which are having data greater than X.

public class NodesGreaterThanX {
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return 0;
		}
		int ansLeft = countNodesGreaterThanX(root.left, x);
		int ansRight = countNodesGreaterThanX(root.right, x);
		if(root.data > x) {
			return ansLeft+ansRight+1;
		}
		return ansLeft+ansRight;
	}
}
