package bst;

//Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST 
//from this input array. Return the root of constructed BST.

public class ConstructBST {
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int s, int e){
		if(s > e) {
			return null; 
		}
		int mid = (s+e)/2;
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left = SortedArrayToBST(arr, s, mid-1);
		root.right = SortedArrayToBST(arr, mid+1, e);
		
		return root;
    }
	
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		return SortedArrayToBST(arr, 0, n-1);
    }
}
