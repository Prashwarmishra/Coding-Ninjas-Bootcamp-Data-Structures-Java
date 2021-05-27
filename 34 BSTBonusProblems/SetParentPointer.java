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
	
	public static Node constructBST(Node root, int data) {
		if(data == -1){
            return root;
        }
		if(root == null) {
			return new Node(data, null, null);
		}
		if(data < root.data) {
			Node ansLeft = constructBST(root.left, data);
			root.left = ansLeft;
			ansLeft.parent = root;
		}else{
			Node ansRight = constructBST(root.right, data);
			root.right = ansRight;
			ansRight.parent = root;
		}
		return root;
	}
	public static Node solve(int[] arr){
		Node root = null;
		
		for(int i=0; i<arr.length; i++) {
			root = constructBST(root, arr[i]);
		}
		return root;
	}
}
