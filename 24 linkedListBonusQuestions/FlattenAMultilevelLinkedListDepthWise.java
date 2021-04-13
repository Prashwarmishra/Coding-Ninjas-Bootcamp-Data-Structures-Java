package linkedListBonusQuestions;

//You are given a linked list in which each node has two pointers: next and child. Each child pointer will have its own 
//next and child pointer. This results in a multilevel data structure. You may refer to the figure for better understanding.

public class FlattenAMultilevelLinkedListDepthWise {
	
	public static LinkedListNode<Integer> flattenList(LinkedListNode<Integer> node) { 
        if(node == null) {
        	return node;
        }
        LinkedListNode<Integer> nodeNext = node.next;
        node.next = flattenList(node.down);
        LinkedListNode<Integer> temp = node;
        while(temp.next != null) {
        	temp = temp.next;
        }
        temp.next = flattenList(nodeNext);
        return node;
    } 
}
