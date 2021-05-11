package binaryTrees2;

//For a given postorder and inorder traversal of a Binary Tree of type integer stored in an array/list, 
//create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.


public class ConstructTreeUsingInorderAndPostOrder {
	
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		int n = postOrder.length;
		if(n <= 0) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(postOrder[n-1]);
		int count = 0;
		while(root.data != inOrder[count]) {
			count++;
		}
		
		int[] lpt = new int[count], rpt = new int[n-count-1];
		int[] lit = new int[count], rit = new int[n-count-1];
		
		for(int i=0; i< count; i++) {
			lpt[i] = postOrder[i];
		}
		int j = 0;
		for(int i = count; i<n-1; i++) {
			rpt[j++] = postOrder[i];
		}
		
		for(int i=0; i< count; i++) {
			lit[i] = inOrder[i];
		}
		j = 0;
		for(int i= count+1; i<n; i++) {
			rit[j++] = inOrder[i];
		}
		root.left = buildTree(lpt, lit);
		root.right = buildTree(rpt, rit);
		return root;
	}
	
}
