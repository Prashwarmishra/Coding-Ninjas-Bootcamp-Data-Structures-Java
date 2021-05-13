package binaryTreesBonusProblems;

//You are given a binary tree in level wise order where all the values are from 0 to n-1. You have to construct an 
//ancestor matrix of size n x n from the given binary tree.

public class AncestorMatrixFromGivenBinaryTree {
	
	public static void findAncestor(BinaryTreeNode<Integer> root, int[][] matrix) {
		if(root == null) {
			return;
		}
		int curr = root.data;
		if(root.left != null) {
			matrix[curr][root.left.data] = 1;
		}
		if(root.right != null) {
			matrix[curr][root.right.data] = 1;
		}
		
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][curr] == 1) {
				if(root.left != null) {
					matrix[i][root.left.data] = 1;
				}
				if(root.right != null) {
					matrix[i][root.right.data] = 1;
				}
			}
		}
		findAncestor(root.left, matrix);
		findAncestor(root.right, matrix);
    }
	
	public static void ancestor(BinaryTreeNode<Integer> root, int[][] matrix) {
        findAncestor(root, matrix);
        for(int i=0; i<matrix.length; i++) {
        	for(int j=0; j<matrix[i].length; j++) {
        		System.out.print(matrix[i][j] + " ");
        	}
        	System.out.println();
        }
    }
	
}
