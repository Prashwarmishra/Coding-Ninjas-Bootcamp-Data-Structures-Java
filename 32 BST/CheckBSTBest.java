package bst;

public class CheckBSTBest {
	public static boolean checkBST(BinaryTreeNode<Integer> root, int min, int max) {
		if(root == null) {
			return true;
		}
		if(root.data <= min || root.data > max) {
			return false;
		}
		
		return checkBST(root.left, min, root.data-1) || checkBST(root.right, root.data, max);
	}
	
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
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		BinaryTreeNode<Integer> root = SortedArrayToBST(arr, n);
		System.out.println(checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
}
