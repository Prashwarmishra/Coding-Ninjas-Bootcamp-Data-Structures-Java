package oops1;

public class DynamicArray {
	private int[] data;
	private int currentIndex;
	
	public DynamicArray() {
		data=new int[5];
		currentIndex=0;
	}
	
	public int size() {
		return currentIndex;
	}
	
	public boolean isEmpty() {
		return currentIndex == 0;
	}
	
	public int get(int i) {
		if(i>=currentIndex) {
			return -1;
		}
		return data[i];
	}
	
	public void set(int i, int val) {
		if(i>=currentIndex) {
			return;
		}
		data[i]=val;
	}
	
	public void add(int val) {
		if(data.length >= currentIndex) {
			doubleSize();
		}
		data[currentIndex++]=val;
	}
	
	private void doubleSize() {
		int[] temp = data;
		data = new int[temp.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	public int removeLast() {
		if(currentIndex <= 0) {
			return -1;
		}
		int temp=data[currentIndex-1];
		currentIndex--;
		return temp;
	}
	
	public void add(int i, int val) {
		if(i>currentIndex) {
			return;
		}
		if(currentIndex >= data.length) {
			doubleSize();
		}
		for(int j=currentIndex-1; j>=i; j--) {
			data[j+1]=data[j];
		}
		data[i]=val;
		currentIndex++;
	}
	public int remove(int i) {
		if(currentIndex <= 0) {
			return -1;
		}
		int temp=data[i];
		for(int j=i;j<currentIndex;j++) {
			data[j]=data[j+1];
		}
		currentIndex--;
		return temp;
	}
	
	public void print() {
		for(int i=0;i<currentIndex;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
