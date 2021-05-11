package binaryTrees2;

import java.util.ArrayList;

//For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the 
//node data along the path is equal to K.

public class PathSumRootToLeaf {
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, ArrayList<Integer> arr) {
		if(root == null || k < 0) {
			return;
		}
		if(root.left == null && root.right == null && k == 0) {
			for(int i:arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		arr.add(root.data);
		rootToLeafPathsSumToK(root.left, k-root.data, arr);
		rootToLeafPathsSumToK(root.right, k-root.data, arr);
		arr.remove(arr.size()-1);
	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		ArrayList<Integer> arr = new ArrayList<>();
		rootToLeafPathsSumToK(root, k, arr);
	}
}
