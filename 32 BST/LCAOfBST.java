package bst;

//Given a binary search tree and data of two nodes, find 'LCA' (Lowest Common Ancestor) of the given two nodes in the BST.

public class LCAOfBST {
	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root == null) {
			return -1;
		}
		if(root.data == a || root.data == b || (root.data > a && root.data <= b)) {
			return root.data;
		}
		if(root.data <= a && root.data <= b) {
			return getLCA(root.right, a, b);
		}
		else if(root.data > a && root.data > b) {
			return getLCA(root.left, a, b);
		}
		else {
			int leftAns = getLCA(root.left, a, b);
			if(leftAns == -1) {
				return getLCA(root.right, a, b);
			}
			return leftAns;
		}
	}
}
