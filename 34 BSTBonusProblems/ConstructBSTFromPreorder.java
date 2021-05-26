package bstBonusProblems;

//You are given preorder traversal of a Binary Search Tree, you have to construct a BST from this preorder traversal.

public class ConstructBSTFromPreorder {	

	static int s = 0;
	
	public static BinaryTreeNode<Integer> constructBST(int[] preorder, int min, int max) {
        if(s == preorder.length || s < min || s > max) {
        	return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preorder[s++]);
        root.left = constructBST(preorder, min, root.data-1);
        root.right = constructBST(preorder, root.data, max);
        return root;
    }
	
	public static BinaryTreeNode<Integer> constructBST(int[] preorder) {
        return constructBST(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
