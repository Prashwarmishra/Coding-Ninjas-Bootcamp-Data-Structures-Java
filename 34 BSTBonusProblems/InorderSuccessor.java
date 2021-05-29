package bstBonusProblems;

//Given an arbitrary binary tree and a node of this tree, you need to find the inorder successor of this node in the tree.
//The inorder successor of a node in a binary tree is that node which will be visited immediately after the given node in 
//inorder traversal of the tree. If the given node is visited last in the inorder traversal, then its inorder successor is NULL.

public class InorderSuccessor {
	private static BinaryTreeNode<Integer> ans = null;
	private static BinaryTreeNode<Integer> next = null;
	
	public static void inorder(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> Node) {
        if(root == null) {
        	return;
        }
        inorder(root.right, Node);
        if(root == Node) {
        	ans = next;
        }
        next = root;
        inorder(root.left, Node);
        return;
    }
	public static BinaryTreeNode<Integer> inorderSuccesor(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> Node) {
        ans = next = null;
        inorder(root, Node);
        return ans;
    }
}
