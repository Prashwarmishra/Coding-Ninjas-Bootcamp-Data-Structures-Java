package bst;

class Triad{
	int min;
	int max;
	boolean isBST;
	
	public Triad(int min, int max, boolean isBST) {
		this.min = min;
		this.max = max;
		this.isBST = isBST;
	}
}

public class CheckBSTBetter {
	
	
	public static Triad checkBSTBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return new Triad(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
		}
		Triad ansLeft = checkBSTBetter(root.left);
		Triad ansRight = checkBSTBetter(root.right);
		
		int currMin = Math.min(root.data, Math.min(ansLeft.min, ansRight.min)); 
		int currMax = Math.max(root.data, Math.max(ansLeft.max, ansRight.max));
		
		if(!ansLeft.isBST || !ansRight.isBST) {
			return new Triad(currMin, currMax, false);
		}
		if(root.data <= ansLeft.max || root.data > ansRight.min) {
			return new Triad(currMin, currMax, false);
		}
		
		return new Triad(currMin, currMax, true);
	}
	

	
}
