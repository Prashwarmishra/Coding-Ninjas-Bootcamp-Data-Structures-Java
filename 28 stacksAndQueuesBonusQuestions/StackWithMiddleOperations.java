package stacksAndQueuesBonusQuestions;

//You have to design a Stack class in which the user can access and delete the middle element in O(1) running time complexity.

class Node {
	int data;
	Node next;
	Node prev;
	Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class StackWithMiddleOperations {
	
	Node head, middle;
	int size;
	
	public StackWithMiddleOperations() {
		head = middle = null;
		size = 0;
	}

	public void push(int element) {
		Node newNode = new Node(element);
		newNode.next = head;
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
		
		size++;
		if(size == 1) {
			middle = head;
		}else if(size%2 == 1) {
			middle = middle.prev;
		}
	}

	public int pop() {
		// Return 0 if the stack is empty
		if(size == 0) {
			return 0;      
		}
		int temp = head.data;
		head = head.next;
		if(head != null) {
			head.prev = null;
		}
		size--;
		if(size%2 == 0) {
			middle = middle.next;
		}
		return temp;
	}
	
	public int getmiddle() {
		// Return 0 if the stack is empty
		if(size == 0) {
			return 0;
		}
		return middle.data;
	}
		
	public int removeMiddle() {
		// Return 0 if the stack is empty
		if(size == 0) {
			return 0;
		}
		
		if(middle.prev != null) {
			middle.prev.next = middle.next;
		}
		if(middle.next != null) {
			middle.next.prev = middle.prev;
		}
		int data = middle.data;
		size--;
		
		if(size%2 == 1) {
			middle = middle.prev;
		}else {
			middle = middle.next;
		}
		
		return data;    
	}
		
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	} 
}
