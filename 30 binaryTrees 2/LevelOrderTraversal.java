package binaryTrees2;

//For a given a Binary Tree of type integer, print it in a level order fashion where each level will be printed on a new line. 
//Elements on every level will be printed in a linear fashion and a single space will separate them.

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		BinaryTreeNode<Integer> levelLast = new BinaryTreeNode<>(-1);
		q.add(levelLast);
		
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> curr = q.poll();
			if(curr.data == -1) {
                if(q.isEmpty()){
                    return;
                }
				System.out.println();
				q.add(levelLast);
			}else {
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
				System.out.print(curr.data +" ");
			}
		}		
	}
}
