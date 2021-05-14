package binaryTreesBonusProblems;

import java.util.ArrayList;

//You are given a binary tree and you have to serialize and deserialize the given binary tree. Serialization is to store 
//the tree in an array so that it can be restored later while deserialization reading tree back from that array.

public class SerializeAndDeserialize {
	public static void serialize(BinaryTreeNode<Integer> root, ArrayList<Integer> tree) {
        if(root == null) {
        	tree.add(-1);
        	return;
        }
        tree.add(root.data);
        serialize(root.left, tree);
        serialize(root.right, tree);
    }
	
	static int index = 0;
	
	public static BinaryTreeNode<Integer> deSerialize(ArrayList<Integer> tree) {
        if(tree.get(index) == -1) {
            index++;
        	return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(tree.get(index++));
        root.left = deSerialize(tree);
        root.right = deSerialize(tree);
        
        return root;
    }
}
