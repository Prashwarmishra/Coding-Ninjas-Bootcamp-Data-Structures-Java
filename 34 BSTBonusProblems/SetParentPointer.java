package bstBonusProblems;

//You are given elements of a binary search tree in level order form. The level order form is described in input format. 
//You have to build that tree and print the preorder traversal of the tree. Please refer to output format for more details.

class Node {
	int data;
	Node left;
	Node right;
	Node parent;

	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}

public class SetParentPointer {
	
	public static Node constructBST(int[] arr, int i, Node parent) {
		if(i >= arr.length || arr[i] == -1) {
			return null;
		}
		Node root = new Node(arr[i], null, null);
		root.parent = parent;
		root.left = constructBST(arr, (2*i+1), root);
		root.right = constructBST(arr, (2*i+2), root);
		
		return root;
	}
	public static Node solve(int[] arr){
		Node root = constructBST(arr, 0, null);
		return root;
	}
}
