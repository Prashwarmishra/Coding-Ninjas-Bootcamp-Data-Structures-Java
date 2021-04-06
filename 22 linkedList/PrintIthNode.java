package linkedList;

//For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.

public class PrintIthNode {
	public static void printIthNode(LinkedListNode<Integer> head, int i){
		int count=0;
		while(head != null && count < i) {
			count++;
			head = head.next;
		}
		if(head != null) {
			System.out.println(head.data);
		}
	}
}
