package binaryTrees2;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUsingInorderAndPreorder {
	
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		int n = preOrder.length;
		if(n <= 0) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preOrder[0]);
		int i = 0;
		while(root.data != inOrder[i]) {
			i++;
		}
		
		int[] lis = new int[i], ris = new int[n - i-1];
		int[] lps = new int[lis.length], rps = new int[ris.length];

		for(int j=1; j<=i; j++) {
			lps[j-1] = preOrder[j];
		}
		
		int k = 0;
		for(int j=i+1; j<n; j++) {
			rps[k++] = preOrder[j];
		}
		
		for(int j=0; j<i; j++) {
			lis[j] = inOrder[j];
		}
		k = 0;
		for(int j=i+1; j<n; j++) {
			ris[k++] = inOrder[j];
		}
				
		root.left = buildTree(lps, lis);
		root.right = buildTree(rps, ris);
		return root;
	}
	
}
