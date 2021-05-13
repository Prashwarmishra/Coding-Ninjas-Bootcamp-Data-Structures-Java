package binaryTreesBonusProblems;

//You are given a binary tree with random pointers. A random pointer of a node points to any random node of the binary 
//tree and it can even point to NULL. You have to clone this binary tree and return the root of the cloned binary tree.

public class CloneABinaryTree {
	
	public static BinaryTreeNode<Integer> copyBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		root.left = copyBinaryTree(root.left);
		root.right = copyBinaryTree(root.right);
		
		BinaryTreeNode<Integer> copy = new BinaryTreeNode<>(root.data);
		copy.left = root.left;
		root.left = copy;
		return root;
	}
	
	public static void cloneBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null) {
			return;
		}
		cloneBinaryTree(root.left.left);
		cloneBinaryTree(root.right);
		
		if(root.right != null){
            root.left.right = root.right.left;
        }
		
		return;
	}
	
	public static void cloneRandomPointers(BinaryTreeNode<Integer> root){
		if(root == null) {
			return;
		}
		cloneRandomPointers(root.left.left);
		cloneRandomPointers(root.right);
		
		if(root.random != null) {
			root.left.random = root.random.left;
		}
		
		return;
	}
	
	public static BinaryTreeNode<Integer> generateCopiedTree(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		
		BinaryTreeNode<Integer> newRoot = root.left;
		
		newRoot.left = generateCopiedTree(root.left.left);
		newRoot.right = generateCopiedTree(root.right);
		
        root.left = root.left.left;
		
		return newRoot;
	}
    
	public static BinaryTreeNode<Integer> clonedTree(BinaryTreeNode<Integer> root) {
        root = copyBinaryTree(root);
        cloneBinaryTree(root);
        cloneRandomPointers(root);
    	BinaryTreeNode<Integer> newRoot = generateCopiedTree(root);
        return newRoot;
    }
}
