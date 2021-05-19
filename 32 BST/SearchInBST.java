package bst;

//Given a BST and an integer k. Find if the integer k is present in given BST or not. You have to return true, if node 
//with data k is present, return false otherwise.

public class SearchInBST {
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return false;
		}
		if(root.data == k) {
			return true;
		}
		
		if(root.data > k) {
			return searchInBST(root.left, k);
		}
		else {
			return searchInBST(root.right, k);
		}	
	}
}
