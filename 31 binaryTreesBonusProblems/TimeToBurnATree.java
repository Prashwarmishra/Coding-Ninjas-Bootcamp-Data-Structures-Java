package binaryTreesBonusProblems;

class Quad{
	int height, heightFromNode, ans;
	boolean isFound;
	public Quad() {
		
	}
	public Quad(int height, int heightFromNode, int ans, boolean isFound) {
		this.height = height;
		this.heightFromNode = heightFromNode;
		this.ans = ans;
		this.isFound = isFound;
	}
}

public class TimeToBurnATree {
	public static Quad timeToBurn(BinaryTreeNode<Integer> root, int start) {
		if(root == null) {
			return new Quad(0, 0, 0, false);
		}
		Quad leftTree = timeToBurn(root.left, start);
		Quad rightTree = timeToBurn(root.right, start);
		
		int currHeight, currHeightFromNode, currAns;
		boolean currIsFound = false;
		
		currHeightFromNode = currAns = 0;
		
		currHeight = Math.max(leftTree.height, rightTree.height)+1;
		if(root.data == start) {
			
			currHeightFromNode = 0;
			currAns = Math.max(leftTree.height, rightTree.height);
			currIsFound = true;
		}else if(leftTree.isFound) {
			currHeightFromNode = leftTree.heightFromNode+1;
			currAns = Math.max(currHeightFromNode+rightTree.height, leftTree.ans);
			currIsFound = true;
		}else if(rightTree.isFound) {
			currHeightFromNode = rightTree.heightFromNode+1;
			currAns = Math.max(currHeightFromNode+leftTree.height, rightTree.ans);
			currIsFound = true;
		}
		
		return new Quad(currHeight, currHeightFromNode, currAns, currIsFound);
	}
}
