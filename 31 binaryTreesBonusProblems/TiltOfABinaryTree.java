package binaryTreesBonusProblems;

//You are given a binary tree and you have to return the tilt of the whole tree.

class TiltSum{
	int sum;
	int tilt;
	
	public TiltSum(int sum, int tilt) {
		this.sum = sum;
		this.tilt = tilt;
	}
}

public class TiltOfABinaryTree {

	public static TiltSum getTiltSum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return new TiltSum(0, 0);
		}
		TiltSum ansLeft = getTiltSum(root.left);
		TiltSum ansRight = getTiltSum(root.right);
		int newSum = ansLeft.sum + ansRight.sum + root.data;
		int newTilt = Math.abs(ansLeft.sum - ansRight.sum) + ansLeft.tilt + ansRight.tilt;
		
		return new TiltSum(newSum, newTilt);
	}
	
	public static int getTilt(BinaryTreeNode<Integer> root) {
        return getTiltSum(root).tilt;
    }
}
