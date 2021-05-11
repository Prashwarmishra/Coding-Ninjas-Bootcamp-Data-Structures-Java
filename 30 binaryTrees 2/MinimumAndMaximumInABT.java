package binaryTrees2;

//For a given a Binary Tree of type integer, find and return the minimum and the maximum data values.
//Return the output as an object of Pair class, which is already created.

class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}

public class MinimumAndMaximumInABT {
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
		}
		Pair<Integer, Integer> ansLeft = getMinAndMax(root.left);
		Pair<Integer, Integer> ansRight = getMinAndMax(root.right);
		
		int newMin = Math.min(root.data, Math.min(ansLeft.minimum, ansRight.minimum));
		int newMax = Math.max(root.data, Math.max(ansLeft.maximum, ansRight.maximum));
		
		return new Pair<>(newMin, newMax);
	}
	
}
