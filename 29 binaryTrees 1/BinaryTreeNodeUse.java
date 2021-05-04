package binaryTrees;

import java.util.Scanner;

public class BinaryTreeNodeUse {
	
	public static int countLeafNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		int ansLeft = countLeafNodes(root.left);
		int ansRight = countLeafNodes(root.right);
		
		return ansLeft+ansRight;
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s, int rootData, boolean isRoot, boolean isLeft){
		if(isRoot) {
			System.out.println("Enter root data: ");
		}else {
			if(isLeft) {
				System.out.println("Enter " + rootData + "'s left data:");
			}else {
				System.out.println("Enter " + rootData + "'s right data:");
			}
		}
		int n = s.nextInt();
		if(n == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
		root.left = takeInput(s, n, false, true);
		root.right = takeInput(s, n, false, false);
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		
		return takeInput(s, 0, true, false);
	}
	
	public static void printRec(BinaryTreeNode<Integer> root){
		if(root == null) {
			return;
		}
		System.out.print(root.data+"-> ");
		if(root.left != null) {
			System.out.print("L:"+root.left.data+", ");
		}
		if(root.right != null) {
			System.out.print("R:"+root.right.data);
		}
		System.out.println();
		printRec(root.left);
		printRec(root.right);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		System.out.println(countLeafNodes(root));
		s.close();
	}
}
