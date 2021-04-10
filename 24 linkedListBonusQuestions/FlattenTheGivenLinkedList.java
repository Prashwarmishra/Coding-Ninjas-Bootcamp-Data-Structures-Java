package linkedListBonusQuestions;

//You are given a linked list where each node of the given linked list has two pointers of such that:
//1. The first pointer points to the next node of the main linked list (known as "right" pointer).
//2. The second pointer points the linked list where this node is head (known as "down" pointer).
//It is given that all the linked list are sorted. You have to write a function to flatten this list 
//into a single linked list which should also be sorted.

public class FlattenTheGivenLinkedList {
	
	private static LinkedListNode<Integer> mergeLinkedList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){
		if(head1 == null) {
			return head2;
		}if(head2 == null) {
			return head1;
		}
		LinkedListNode<Integer> ansHead = null, ansTail = null;
		
		if(head1.data < head2.data) {
			ansHead = ansTail = head1;
			head1 = head1.down;
		}else {
			ansHead = ansTail = head2;
			head2 = head2.down;
		}
		
		while(head1 != null && head2 != null) {
			if(head1.data < head2.data) {
				ansTail.down = head1;
				head1 = head1.down;
			}else {
				ansTail.down = head2;
				head2 = head2.down;
			}
			ansTail = ansTail.down;
		}
		
		while(head1 != null) {
			ansTail.down = head1;
			head1 = head1.down;
			ansTail = ansTail.down;
		}
		while(head2 != null) {
			ansTail.down = head2;
			head2 = head2.down;
			ansTail = ansTail.down;
		}
		
		return ansHead;
	}
	
	public static LinkedListNode<Integer> flat(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> ans = null;
		while(head != null) {
			ans = mergeLinkedList(ans, head);
			head = head.right;
		}
		return ans;
	}
}
