package stacksAndQueuesBonusQuestions;

import java.util.*;


//In a local school, N students have assembled for the morning assembly. All the students are standing in a straight 
//line. Due to some technical issues, the mike is not working. The technician is trying to solve the issue. Students 
//have to stand in the line, all this while. After a while, students start looking at each other. But, since they are 
//not standing in any particular order of heights, not one cannot see everyone else.
//
//Two students X and Y can see each other if they are standing next to each other or if no student standing between them 
//has height greater than height of either X or Y.
//
//You will be given height of students standing in the assembly line. You have to print the number of pairs of students 
//that can see each other.

class Pair{
	long num;
	long freq;
	Pair(long num, long freq){
		this.num = num;
		this.freq = freq;
	}
}

public class MorningAssembly {
	
	public static int count(int[] arr) {
		int count = 0;
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			while(!st.isEmpty() && num >= st.peek()) {
				count++;
				if(num == st.peek()) {
					break;
				}
				st.pop();
			}
			if(!st.isEmpty()) {
				count++;
			}
			st.push(num);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		System.out.println(count(arr));
	}
}
