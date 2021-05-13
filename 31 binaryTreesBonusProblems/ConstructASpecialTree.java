package binaryTreesBonusProblems;

//You are given an array(preor) representing preorder traversal of a special binary tree where each node of this 
//binary tree has either 0 or 2 children. One more array(preorLN) is given to you to represent if the current node 
//is the leaf node or not with values "L" or "N" respectively. You have to write a function to construct this special 
//tree and return the root of this tree.

public class ConstructASpecialTree {
	
	static int current = 0;
	
	public static BinaryTreeNode<Integer> specialtree(int[] preor, char[] preorLN, int n) {
        if(current >= n) {
        	return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(preor[current++]);
        if(preorLN[current] == 'N') {
        	root.left = specialtree(preor, preorLN, n);
        	root.right = specialtree(preor, preorLN, n);
        }
        return root; 
    }
}
