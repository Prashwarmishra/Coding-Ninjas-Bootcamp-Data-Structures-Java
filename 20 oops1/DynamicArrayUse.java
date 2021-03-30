package oops1;

public class DynamicArrayUse {
	public static void main(String[] args) {
		DynamicArray arr = new DynamicArray();
		System.out.println(arr.isEmpty());
		for(int i=0;i<20;i++) {
			arr.add(100+i);
		}
		arr.print();
		System.out.println(arr.size());
		arr.add(1, 500);
		arr.set(1, 600);
		arr.removeLast();
		arr.print();
	}
}
