package linkedListBonusQuestions;

//You are given a linked list in which each node has two pointers: next and child. Each child pointer 
//will have its own next and child pointer. This results in a multilevel data structure.
//You have to flatten this multilevel linked list and form a singly linked list such that all the nodes 
//in the first level should come first, then nodes of second level and so on.

//class Node{
//	int data;
//	Node next;
//	Node down;
//	Node(int data){
//		this.data = data;
//	}
//}

public class FlattenAMultiLevelLinkedList {
	
//	public static void flattenListCorrect(Node hp) {
//		if(hp == null || hp.next == null) {
//			return;
//		}
//		Node head = hp;
//		while(head.next != null) {
//			head = head.next;
//		}
//		if(hp.down != null) {
//			Node down = hp.down;
//			hp.down = null;
//			head.next = down;
//		}
//		flattenListCorrect(hp.next);
//    }
	
}
