package queues;

public class QueueUsingArray {
	private int[] data;
	private int front, rear, size;
	
	public QueueUsingArray() {
		data = new int[5];
		front = rear = -1;
		size = 0;
	}
	
	public QueueUsingArray(int length) {
		data = new int[length];
		front = rear = -1;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void doubleSize() {
		int temp[] = data;
		data = new int[2*temp.length];
		int index = 0;
		
		for(int i=front; i<temp.length; i++) {
			data[index++] = temp[i];
		}
		
		for(int i=0; i<front; i++) {
			data[index++] = temp[i];
		}
		
		front = 0;
		rear = temp.length-1;
	}
	
	public void enqueue(int elem) {
		if(front == -1) {
			front++;
		}
		if(size >= data.length) {
			doubleSize();
		}
		rear = (rear+1)%data.length;
		data[rear] = elem;
		size++;
	}
	
	public int front() throws QueueEmptyException{
		if(size <= 0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public int dequeue() throws QueueEmptyException{
		if(size == 0) {
			throw new QueueEmptyException();
		}
		int temp = data[front];
		front = (front+1)%data.length;
		size--;
		if(size == 0) {
			front = rear = -1;
		}
		return temp;
	}	
}
