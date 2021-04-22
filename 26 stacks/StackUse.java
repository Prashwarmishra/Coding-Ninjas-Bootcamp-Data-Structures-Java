package stacks;

public class StackUse {
	
	public static void main(String[] args) throws StackEmptyException, StackFullException{
		StackUsingArray arr = new StackUsingArray();
		
		System.out.println(arr.isEmpty());
		arr.push(10);
		arr.push(20);
		arr.push(30);
		arr.pop();
		System.out.println(arr.top());
		System.out.println(arr.size());
		
		
		StackUsingLL<Integer> arr2 = new StackUsingLL<>();
		int[] num = {1,2,3,4,5,6,7};
		for(int i:num) {
			arr2.push(i);
		}
		
		while(!arr2.isEmpty()) {
			System.out.print(arr2.pop()+" ");
		}
		System.out.println();
		
	}
}
