package bstBonusProblems;

import java.util.ArrayList;

//You are given an integer K and elements of a binary search tree in level order form. You have to return the sum of 
//elements which are smaller than or equal to Kth smallest element of the tree.

public class SumOfElementsLessThanOrEqualToKthElement {
	
	public static void constructArray(BinaryTreeNode<Integer> root, ArrayList<Integer> arr) {
		if(root == null) {
			return;
		}
		constructArray(root.left, arr);
		arr.add(root.data);
		constructArray(root.right, arr);
	}
	
	public static int solve(BinaryTreeNode<Integer> root, int k){
		ArrayList<Integer> arr = new ArrayList<>();
		constructArray(root, arr);
		int ans = 0;
		for(int i=0; i<k && i<arr.size(); i++) {
			ans+=arr.get(i);
		}
		return ans;
	}
}
