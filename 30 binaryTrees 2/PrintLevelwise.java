package binaryTrees2;

import java.util.LinkedList;
import java.util.Queue;

//For a given a Binary Tree of type integer, print the complete information of every node, when traversed in a 
//level-order fashion.

public class PrintLevelwise {
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
}
