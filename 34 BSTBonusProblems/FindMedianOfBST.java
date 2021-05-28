package bstBonusProblems;

//You are given a BST, return the integral part of the median of the given BST.
//If the number of nodes are even, then median=((n/2)th node+(n/2+1)th node)/2
//If the number of nodes are odd, then median=(n/2)th node

public class FindMedianOfBST {
	
	public static int count(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		return count(root.left) + count(root.right) + 1;
	}
	
	public static int findMedian(BinaryTreeNode<Integer> root, boolean isEven, int x) {
		int prev = 0;
		int count = 0;
		while(root != null) {
			if(count == x) {
				if(isEven == true) {
					while(root.left != null) {
						root = root.left;
					}
					return (root.data + prev)/2;
				}
				return root.data;
			}
			BinaryTreeNode<Integer> fwd = root.left;
			if(fwd == null) {
				count++;
				prev = root.data;
				root = root.right;
			}else {
				while(fwd.right != null && fwd.right != root) {
					fwd = fwd.right;
				}
				if(fwd.right == null) {
					fwd.right = root;
					prev = root.data;
					root = root.left;
				}else {
					count++;
					fwd.right = null;
					prev = root.data;
					root = root.right;
				}
			}
			
		}
		return 0;
	}
	
	public static int median(BinaryTreeNode<Integer> root) {
        int count = count(root);
        if(count%2 == 0) {
        	return findMedian(root, true, count/2);
        }
        return findMedian(root, false, count/2);
    }
}
