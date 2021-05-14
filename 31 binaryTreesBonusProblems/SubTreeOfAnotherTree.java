package binaryTreesBonusProblems;

//Given two binary trees T and S, check whether tree S has exactly the same structure and node values with a subtree of 
//T, i.e. check if tree S is a subtree of the tree T.

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class SubTreeOfAnotherTree {
	
	public static boolean check(TreeNode T, TreeNode S) {
		
		if(T == null && S == null) {
			return true;
		}
		
		if(T == null || S == null) {
			return false;
		}
		
		if(!check(T.left, S.left)) {
			return false;
		}
		
		if(!check(T.right, S.right)) {
			return false;
		}
		if(T.val != S.val) {
			return false;
		}
		
		return true;
	}
	
	public static boolean isSubtree(TreeNode T, TreeNode S) {
		if(S == null) {
			return true;
		}
		if(T == null) {
			return false;
		}
		
		if(T.val == S.val) {
			return check(T, S);
		}
		isSubtree(T.left, S);
		isSubtree(T.right, S);
		return false;
	}
}
