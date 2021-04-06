package linkedList;

//You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
//To explain it further, you need to start printing the data from the tail and move towards the head of the list, printing the 
//head data at the end.

public class PrintReversedLL {
	
	public static void printReverse(LinkedListNode<Integer> root) {
		if(root == null) {
			return;
		}
		printReverse(root.next);
		System.out.print(root.data+" ");
	}
}
