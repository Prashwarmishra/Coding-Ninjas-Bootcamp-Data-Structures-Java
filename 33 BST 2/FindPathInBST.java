package bst2;

import java.util.*;

//Given a BST and an integer k. Find and return the path from the node with data k and root (if a node with data k 
//is present in given BST) in a list. Return empty list otherwise.


public class FindPathInBST {
	
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root == null) {
			return null;
		}
		if(root.data == data) {
			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(root.data);
			return arr;
		}
		if(root.data > data) {
			ArrayList<Integer> arr = getPath(root.left, data);
			if(arr == null) {
				return arr;
			}
			arr.add(root.data);
			return arr;
		}else {
			ArrayList<Integer> arr = getPath(root.right, data);
			if(arr == null) {
				return arr;
			}
			arr.add(root.data);
			return arr;
		}
	}
}
