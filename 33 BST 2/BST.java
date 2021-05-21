package bst2;

class BSTPair{
	BinaryTreeNode<Integer> root;
	boolean isDeleted;
	
	public BSTPair(BinaryTreeNode<Integer> root, boolean isDeleted) {
		this.root = root;
		this.isDeleted = isDeleted;
	}
}

public class BST {
	private BinaryTreeNode<Integer> root;
	private int size;
	
	private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int x) {
		BinaryTreeNode<Integer> curr = new BinaryTreeNode<Integer>(x);
		if(root == null) {
			return curr;
		}
		if(x < root.data) {
			root.left = insert(root.left, x);
		}
		else {
			root.right = insert(root.right, x);
		}
		return root;
	}
	
	public void insert(int x){
		root = insert(root, x);
		size++;
	}
	
//	private static int findMax(BinaryTreeNode<Integer> root) {
//		if(root == null) {
//			return Integer.MIN_VALUE;
//		}
//		int ansLeft = findMax(root.left);
//		int ansRight = findMax(root.right);
//		return Math.max(root.data, Math.max(ansRight, ansLeft));
//	}
	private static int findMin(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int ansLeft = findMin(root.left);
		int ansRight = findMin(root.right);
		return Math.min(root.data, Math.min(ansRight, ansLeft));
	}
	private static BSTPair delete(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return new BSTPair(root, false);
		}
		if(x < root.data) {
			BSTPair ans = delete(root.left, x);
			root.left = ans.root;
			return new BSTPair(root, ans.isDeleted);
		}
		else if(x > root.data) {
			BSTPair ans = delete(root.right, x);
			root.right = ans.root;
			return new BSTPair(root, ans.isDeleted);
		}
		else {
			if(root.left == null && root.right == null) {
				return new BSTPair(null, true);
			
			}
			else if(root.left != null && root.right == null) {
				return new BSTPair(root.left, true);
			}
			else if(root.left == null && root.right != null) {
				return new BSTPair(root.right, true);
			}else {
				int minRight = findMin(root.right);
				root.data = minRight;
				BSTPair ans = delete(root.right, minRight);
				root.right = ans.root;
				return new BSTPair(root, ans.isDeleted);
			}
		}
	}
	
	public boolean delete(int x) {
		BSTPair ans = delete(root, x);
		if(ans.isDeleted) {
			size--;
			root = ans.root;
			return true;
		}
		return false;
	}
	
	private static boolean isPresent(int x, BinaryTreeNode<Integer> root) {
		if(root == null) {
			return false;
		}
		if(root.data == x) {
			return true;
		}
		if(x < root.data) {
			return isPresent(x, root.left);
		}else {
			return isPresent(x, root.right);
		}
	}
	
	public boolean isPresent(int x) {
		return isPresent(x, root);
	}
	
	private static void print(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + ": ");
		
		if(root.left != null) {
			System.out.print("L:" + root.left.data);
		}
		if(root.right != null) {
			System.out.print(", R:" + root.right.data);
		}
		System.out.println();
		
		print(root.left);
		print(root.right);
	}
	
	public void print() {
		print(root);
	}
	
	public int size() {
		return size;
	}
}
