package binaryTreesBonusProblems;

public class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	BinaryTreeNode<T> random;
	
	public BinaryTreeNode() {
		
	}
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
