package binaryTreesBonusProblems;

import java.util.ArrayList;

//You are given an N-sized array that represents a binary tree such that array indexes are values in tree nodes and array 
//values give the parent node of that particular index (or node). The value of the root index is -1 as there is no parent of 
//the root node. You have to construct a binary tree from the given parent array.

public class ConstructBinaryTreeFromParent {
	
	public static BinaryTreeNode<Integer> root = null;
	
	public static void constructBT(int[] parent, int n, ArrayList<BinaryTreeNode<Integer>> arr, int i) {
        if(arr.get(i) == null) {
        	BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(i);
        	arr.set(i, newNode);
        	int curr = parent[i];
        	if(curr == -1) {
        		root = newNode;
        		return;
        	}
        	if(arr.get(curr) == null) {
        		constructBT(parent, n, arr, curr);
        		BinaryTreeNode<Integer> parentNode = arr.get(i);
        		if(parentNode.left == null) {
        			parentNode.left = newNode;
        		}else {
        			parentNode.right = newNode;
        		}
        	}
        }
    }
	
	public static BinaryTreeNode<Integer> constructBT(int[] parent, int n) {
        ArrayList<BinaryTreeNode<Integer>> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
        	arr.add(null);
        }
        for(int i=0; i<n; i++) {
        	constructBT(parent, n, arr, i);
        }
        return root;
    }
}
