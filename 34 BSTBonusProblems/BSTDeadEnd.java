package bstBonusProblems;

//You are given a Binary Search Tree containing positive integer values greater than 0. You have to check whether 
//this tree contains a dead-end or not. The dead-end is a leaf node, after which we are not able to insert any node. 
//That is, a dead end is said to exist in a BST if there is a leaf node to which a new child node cannot be added 
//without violating the properties of a BST.

public class BSTDeadEnd {
	public static boolean deadEnd(BinaryTreeNode<Integer> root, int min, int max) {
        if(root == null) {
        	return false;
        }
        if(min >= max) {
        	return true;
        }
        
        return deadEnd(root.left, min, root.data-1) || deadEnd(root.right, root.data+1, max);
    }
	public static boolean deadEnd(BinaryTreeNode<Integer> root) {
        return deadEnd(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
