package linkedList2;

//You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' 
//Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. 
//Continue the same until the end of the linked list.

public class DeleteEveryNNodes {
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        if(M == 0){
            return null;
        }else if(N == 0) {
        	return head;
        }
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			int count = 1;
			while(count < M && temp != null) {
				count++;
				temp = temp.next;
			}
            if(temp == null){
                return head;
            }
			count = 0;
			while(count < N && temp.next != null) {
				temp.next = temp.next.next;
				count++;
			}
            temp = temp.next;
		}
		return head;
	}
}
