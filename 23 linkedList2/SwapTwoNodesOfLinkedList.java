package linkedList2;

//You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' 
//Swap the nodes that are present at the 'i-th' and 'j-th' positions.

public class SwapTwoNodesOfLinkedList {
	
	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		if(head == null || head.next == null) {
			return head;
		}
        if(j < i){
            int temp = i;
            i = j;
            j = temp;
        }
        if(i == j){
            return head;
        }
		LinkedListNode<Integer> head2, temp, prev, temp2, prev2;
		int p;
		if(i == 0 && j == 1) {
			head2 = head.next;
			head.next = head2.next;
			head2.next = head;
			return head2;
		}
		
		if(i == 0 && j != 1) {
			temp = prev = head;
			p = 0;
			while(temp != null && p < j) {
				prev = temp;
				temp = temp.next;
				p++;
			}
			head2 = temp.next;
			temp.next = head;
			temp = head2.next;
			head2.next = head.next;
			head.next = temp;
			return head2;
		}
		
		if(i != 0 && j == i+1) {
			temp = head;
			p = 0;
			prev = head;
			while(temp != null && p < i) {
				p++;
				prev = temp;
				temp = temp.next;
			}
			head2 = temp.next;
			prev.next = head2;
			temp.next = head2.next;
			head2.next = temp;
			return head;
		}
		
		if(i != 0 && j != i+1) {
			p = 0;
			temp = head; prev = head;
			while(temp != null && p < i) {
				prev = temp;
				temp = temp.next;
				p++;
			}
			temp2 = temp; prev2=temp2;
			j = j-i; p = 0;
			while(temp2 != null && p < j) {
				prev2 = temp2;
				temp2 = temp2.next;
				p++;
			}
			prev.next = temp2;
			prev2.next = temp;
			head2 = temp.next;
			temp.next = temp2.next;
			temp2.next = head2;
			return head;
		}
		return head;
	}
}
