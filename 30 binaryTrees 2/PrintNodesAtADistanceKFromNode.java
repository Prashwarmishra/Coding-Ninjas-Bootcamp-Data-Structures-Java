package binaryTrees2;

//You are given a Binary Tree of type integer, a target node, and an integer value K.
//Print the data of all nodes that have a distance K from the target node. The order in which they would be printed 
//will not matter.

class duo{
	boolean isFound;
	int length;

	public duo(boolean isFound, int length) {
		this.isFound = isFound;
		this.length = length;
	}
}

public class PrintNodesAtADistanceKFromNode {

	public static void printNodes(BinaryTreeNode<Integer> root, int k) {
		if(root == null) {
			return;
		}
		if(root != null && k == 0) {
			System.out.println(root.data);
			return;
		}
		printNodes(root.left, k-1);
		printNodes(root.right, k-1);
	}

	public static duo atDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		if(root == null) {
			return new duo(false, 0);
		}
		duo ansLeft = atDistanceK(root.left, node, k);
		duo ansRight = atDistanceK(root.right, node, k);
		if(root.data == node) {
			printNodes(root, k);
			return new duo(true, 0);
		}
		if(ansLeft.isFound) {
			int len = k-ansLeft.length-1;
			if(len == 0) {
				System.out.println(root.data);
			}else {
				printNodes(root.right, len-1);
			}
			return new duo(true, ansLeft.length+1);
		}else if(ansRight.isFound) {
			int len = k-ansRight.length-1;
			if(len == 0) {
				System.out.println(root.data);
			}else {
				printNodes(root.left, len-1);
			}
			return new duo(true, ansRight.length+1);
		}else {
			return new duo(false, 0);
		}
	}

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		atDistanceK(root, node, k);
	}
}
