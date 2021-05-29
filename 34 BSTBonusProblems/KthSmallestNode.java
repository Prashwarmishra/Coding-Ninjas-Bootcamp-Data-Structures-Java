package bstBonusProblems;

//Given a BST and an integer K, you need to find the Kth smallest element present in the BST. Return INT_MIN if that 
//is not present in the BST.

public class KthSmallestNode {
	
	static int count = 0;
	public static int kthSmallest(BinaryTreeNode<Integer> root, int k){
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int ansLeft = kthSmallest(root.left, k);
		if(ansLeft != Integer.MIN_VALUE) {
			return ansLeft;
		}
		if (++count == k) {
			return (root.data);
		}
		return kthSmallest(root.right, k);
	}
	
	public static int kthSmallestNode(BinaryTreeNode<Integer> root,int k){
		return kthSmallest(root, k);
	}
}
