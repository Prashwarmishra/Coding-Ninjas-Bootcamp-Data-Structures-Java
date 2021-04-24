package queues;

public class QueueUse {
	public static void main(String[] args) throws QueueEmptyException{
		QueueUsingArray q = new QueueUsingArray(3);
		
		int[] arr = {10,20,30};
		for(int i: arr) {
			q.enqueue(i);
		}
		
		q.dequeue();
		q.enqueue(80);
		q.enqueue(90);
		while(!q.isEmpty()) {
			System.out.print(q.dequeue()+" ");
		}
		System.out.println();
	}
}
