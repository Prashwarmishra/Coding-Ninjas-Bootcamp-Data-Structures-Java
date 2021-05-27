package bstBonusProblems;

//You are given an N-sized array of integers, replace every element of this array with the least greater element on 
//its right side in the array. If there is no greater element on the right side, replace it with -1.

public class ReplaceWithLeastGreater {
	
	public static BinaryTreeNode<Integer> constructBST(BinaryTreeNode<Integer> root, int data, int[] arr, int x){
		if(root == null) {
			BinaryTreeNode<Integer> ans = new BinaryTreeNode<Integer>(arr[data]);
			arr[data] = x;
			return ans;
		}
		if(arr[data] < root.data) {
			root.left = constructBST(root.left, data, arr, root.data);
		}else {
			root.right = constructBST(root.right, data, arr, x);
		}
		return root;
	}
	
	public static void replace(int[] arr, int n) {
		BinaryTreeNode<Integer> root = null;
		for(int i=n-1; i>=0; i--) {
			root = constructBST(root, i, arr, -1);
		}
    }
}
