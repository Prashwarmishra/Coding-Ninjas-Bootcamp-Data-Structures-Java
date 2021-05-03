package binaryTrees;

//For a given Binary Tree of integers, find and return the sum of all the nodes data.

public class SumOfNodes {
	public static int getSum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftSum = getSum(root.left);
		int rightSum = getSum(root.right);
		
		return leftSum + rightSum + root.data;
	}
}
