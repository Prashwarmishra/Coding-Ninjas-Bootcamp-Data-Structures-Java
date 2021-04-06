package linkedList;

//You have been given a singly linked list of integers where the elements are sorted in ascending order. 
//Write a function that removes the consecutive duplicate values such that the given list only contains 
//unique elements and returns the head to the updated list.

public class EliminateDuplicatesFromLL {
	
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		if(head == null){
            return head;
        }
		LinkedListNode<Integer> temp = head;
		while(temp.next != null) {
			if(temp.data.equals(temp.next.data)) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		return head;
	}
}