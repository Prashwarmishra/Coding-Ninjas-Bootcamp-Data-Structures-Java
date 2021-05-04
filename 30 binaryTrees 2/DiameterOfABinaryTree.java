package binaryTrees2;

//For a given Binary of type integer, find and return the ‘Diameter’.

class doubleVal{
	int diameter;
	int height;
	doubleVal(int diameter, int height) {
		this.diameter = diameter;
		this.height = height;
	}
}

public class DiameterOfABinaryTree {
	
	public static doubleVal diameter(BinaryTreeNode<Integer> root){
		if(root == null) {
			return new doubleVal(0, 0);
		}	
		doubleVal leftHeight = diameter(root.left);
		doubleVal rightHeight = diameter(root.right);
		
		int currHeight = Math.max(leftHeight.height, rightHeight.height)+1;
		int currDiameter = leftHeight.diameter + rightHeight.diameter + 1;
		
		return new doubleVal(currDiameter, currHeight);
	}
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		doubleVal ans = diameter(root);
		return Math.max(ans.height, ans.diameter);
	}
	
}
