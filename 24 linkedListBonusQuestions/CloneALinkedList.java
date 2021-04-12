package linkedListBonusQuestions;

//A singly linked list is given to you with N nodes where each node is pointing to its next node and some of its 
//nodes are pointing to the arbitrary nodes. You are given with M arbitrary pointers, where you have M pairs denoting 
//that two nodes a and b are connected i.e. a's arbitrary pointer is pointing towards b (a->arb=b). You have to write 
//a function to clone the original linked list given to you and return its head. We will validate whether the linked 
//list is a copy of the original linked list or not.

class Node<T> {
    T data;
    Node<T> next;
    Node<T> arb;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.arb = null;
    }
}

public class CloneALinkedList {
	
	public static Node<Integer> clone(Node<Integer> head) {
        if(head == null) {
        	return head;
        }
        Node<Integer> ansH = null;
        Node<Integer> ansT = null;
        
        Node<Integer> temp = head;
        
        while(temp != null) {
        	if(ansH == null) {
        		ansH = ansT = new Node<>(temp.data);
        	}else {
        		ansT.next = new Node<>(temp.data);
        		ansT = ansT.next;
        	}
        	temp = temp.next;
        }
        
        //for connecting the arbitrary nodes, traverse again
        ansT = ansH;
        Node<Integer> oldHead = head;
        while(head != null) {
        	if(head.arb != null) {
        		temp = ansH;
        		Node<Integer> temp2 = oldHead;
        		while(temp2 != head.arb) {
        			temp = temp.next;
        			temp2 = temp2.next;
        		}
        		ansT.arb = temp;
        	}
        	head = head.next;
        	ansT = ansT.next;
        }
        
        return ansH;
    }
}
