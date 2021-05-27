package bstBonusProblems;

//You are given a BST in the level order form and a target node K. You have to find a node having the minimum absolute 
//difference with target value K and print the value of that minimum absolute difference.

public class FindTheClosestElement {
	
	public static int minDiff(BinaryTreeNode<Integer> root, int k, int min) {
		if(root == null) {
			return min;
		}
		if(Math.abs(root.data - k) < Math.abs(min - k)) {
			min = root.data;
		}
		if(k < root.data) {
			return minDiff(root.left, k, min);
		}else {
			return minDiff(root.right, k, min);
		}
    }
	public static int minDiff(BinaryTreeNode<Integer> root, int k) {
        return minDiff(root, k, Integer.MAX_VALUE);
    }
}
