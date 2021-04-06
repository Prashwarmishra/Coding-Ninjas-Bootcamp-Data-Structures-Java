package linkedList;

//You have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'
//Write a function to add a node to the list with the 'data' at the specified position, 'pos.'

public class InsertNodeInLL {
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		if(pos == 0) {
			LinkedListNode<Integer> curr = new LinkedListNode<Integer>(data);
			curr.next = head;
			return curr;
		}
		LinkedListNode<Integer> temp = head;
		int count = 0;
		while(temp.next != null && count < pos-1) {
			count++;
			temp = temp.next;
		}
		
		if(count == pos-1) {
			LinkedListNode<Integer> curr = new LinkedListNode<>(data);
			curr.next = temp.next;
			temp.next = curr;
		}
		
		return head;
	}
}
