package bst2;

import java.util.*;

//Given a binary search tree and an integer S, find pair of nodes in the BST which sum to S. 
//You can use extra space of the order of O(log n).

public class PairSumInBST {
	
	public static void printPair(ArrayList<Integer> arr, int s) {
		int n = arr.size();
		
		for(int i=0, j=n-1; i<j; ) {
			int currSum = arr.get(i) + arr.get(j);
			if(currSum < s) {
				i++;
			}else if(currSum > s) {
				j--;
			}else {
				System.out.println(arr.get(i++) + " " + arr.get(j--));
			}
		}
	}
	
	public static void buildArray(BinaryTreeNode<Integer> root, ArrayList<Integer> arr) {
		if(root == null) {
			return;
		}
		buildArray(root.left, arr);
		arr.add(root.data);
		buildArray(root.right, arr);
	}
	
	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		ArrayList<Integer> arr = new ArrayList<>();
		buildArray(root, arr);
		printPair(arr, s);
	}
}
