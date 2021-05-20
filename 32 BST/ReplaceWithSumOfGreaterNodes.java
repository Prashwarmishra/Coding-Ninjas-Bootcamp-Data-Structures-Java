package bst;

//Given a binary search tree, you have to replace each node's data with the sum of all nodes which are greater or equal 
//than it. You need to include the current node's data also.

public class ReplaceWithSumOfGreaterNodes {
	
	public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root, int sum) {
		if(root == null) {
			return sum;
		}
		sum = replaceWithLargerNodesSum(root.right, sum);
		root.data+=sum;
		sum = root.data;
		sum = replaceWithLargerNodesSum(root.left, sum);
		return sum;
	}
	
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replaceWithLargerNodesSum(root, 0);

	}
	
}
