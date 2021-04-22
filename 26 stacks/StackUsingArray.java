package stacks;

public class StackUsingArray {
	private int[] data;
	private int topIndex;
	
	public StackUsingArray() {
		data = new int[10];
		topIndex = -1;
	}
	
	public StackUsingArray(int size) {
		data = new int[size];
		topIndex = -1;
	}
	
	public int size() {
		return topIndex+1;
	}
	
	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	private void doubleSize() {
		int[] temp = data;
		data = new int[2*temp.length];
		for(int i=0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	public void push(int num) {
		if(topIndex +1 >= data.length) {
//			throw new StackFullException();
			doubleSize();
		}
		data[++topIndex] = num;
	}
	
	public int pop() throws StackEmptyException{
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	
	public int top() throws StackEmptyException{
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
}
