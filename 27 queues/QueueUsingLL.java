package queues;

import linkedList.Node;

public class QueueUsingLL<T> {
	Node<T> front;
	Node<T> rear;
	int size;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T elem) {
		if(size == 0) {
			front = rear = new Node<>(elem);
		}else {
			rear.next = new Node<>(elem);
			rear = rear.next;
		}
		size++;
	}
	
	public T front() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public T dequeue() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		size--;
		if(size == 0) {
			front = rear = null;
		}
		return temp;
	}
	
}
