package linkedList;

import java.util.Scanner;

public class LinkedListUse {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		
		n1.next = n2; n2.next = n3; n3.next = n4;
		
		//printing the created Linked List	
//		System.out.println("n1 " + n1 + ", data " + n1.data + ", next " + n1.next);
//		System.out.println("n2 " + n2 + ", data " + n2.data + ", next " + n2.next);
//		System.out.println("n3 " + n3 + ", data " + n3.data + ", next " + n3.next);
//		System.out.println("n4 " + n4 + ", data " + n4.data + ", next " + n4.next);
		return n1;
	}
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(n != -1) {
			Node<Integer> current = new Node<>(n);
			if(head == null) {
				head = current;
				tail = current;
			}else {
				tail.next = current;
				tail = tail.next;
			}
			n = s.nextInt();
		}
		s.close();
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		if(pos == 0) {
			Node<Integer> curr = new Node<Integer>(data);
			curr.next = head;
			return curr;
		}
		Node<Integer> temp = head;
		int count = 0;
		while(temp != null && count < pos-1) {
			count++;
			temp = temp.next;
		}
		
		if(count == pos-1) {
			Node<Integer> curr = new Node<>(data);
			curr.next = temp.next;
			temp.next = curr;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		insert(head, 5, 50);
		print(head);
		
	}
}
