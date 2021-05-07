package binaryTrees2;

import java.util.LinkedList;
import java.util.Queue;

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
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> st = new LinkedList<>();
		st.add(root);
		while(!st.isEmpty()) {
			BinaryTreeNode<Integer> curr = st.poll();
			System.out.print(curr.data+":");
			if(curr.left != null) {
				System.out.print("L:" + curr.left.data);
				st.add(curr.left);
			}else {
				System.out.print("L:-1");
			}
			if(curr.right != null) {
				System.out.print(",R:" + curr.right.data);
				st.add(curr.right);
			}else {
				System.out.print(",R:-1");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] preOrder = {4,5,2,6,7,3,1};
		int[] inOrder = {4,2,5,1,6,3,7};
		BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);
		printLevelWise(root);
	}
	
}
