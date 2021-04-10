package linkedListBonusQuestions;

//Write a function to get the intersection point of two Linked Lists in no extra space and O(n) time complexity 
//(head of both linked lists must be different).
//Two linked lists are given and a node which is connected to the last node of other linked list. Your task is to 
//find the node due to which intersection occurs.

public class FindIntersection {
	
	private static int length(ListNode<Integer> head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
	
	public static int changelist(ListNode<Integer> h1, ListNode<Integer> h2) {
		int len1 = length(h1); 
		int len2 = length(h2);
		if(len2 > len1) {
			ListNode<Integer> temp = h1;
			h1 = h2;
			h2 = temp;
		}
		int diff = Math.abs(len1 - len2);
		while(diff > 0) {
			diff--;
			h1 = h1.next;
		}
		while(h1 != null && h2 != null) {
			if(h1 == h2) {
				return h1.data;
			}
            h1 = h1.next;
			h2 = h2.next;
		}
		return -1;
	}
}
