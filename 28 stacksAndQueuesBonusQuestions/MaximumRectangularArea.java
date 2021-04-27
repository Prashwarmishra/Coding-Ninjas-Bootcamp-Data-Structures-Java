package stacksAndQueuesBonusQuestions;

import java.util.Scanner;
import java.util.Stack;

//You are given a binary matrix. You have to print the maximum area possible for a sub-matrix with all 1's.

public class MaximumRectangularArea {
	
	public static int findMaxArea(int[] arr) {
		int max = 0;
		Stack<Integer> st = new Stack<>();
		int i=0;
		for(; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i] < arr[st.peek()] ) {
				int curr = st.pop();
				int area;
				if(st.isEmpty()) {
					area = arr[curr]*i;
				}else {
					area = arr[curr]*(i-st.peek()-1);
				}
				if(area > max) {
					max = area;
				}
			}
			st.add(i);
		}
		while(!st.isEmpty()) {
			int curr = st.pop();
			int area;
			if(st.isEmpty()) {
				area = arr[curr]*(i);
			}else {
				area = arr[curr]*(i-st.peek()-1);
			}
			if(area > max) {
				max = area;
			}
		}
		return max;
	}
	
	public static int maxRectangularArea(int[][] num) {
		int max = 0;
		if(num.length <= 0) {
			return max;
		}
		int[] arr = num[0];
		int temp = findMaxArea(arr);
		
		if(temp > max) {
			max = temp;
		}
		
		for(int i=1; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j] != 0) {
					 num[i][j] += num[i-1][j];
				}
				arr[j] = num[i][j];
			}
			temp = findMaxArea(arr);
			if(temp > max) {
				max = temp;
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] num = new int[r][c];
		for(int i=0; i< r; i++) {
			for(int j=0; j<c; j++) {
				num[i][j] = s.nextInt();
			}
		}
		s.close();
		System.out.println(maxRectangularArea(num));
	}
}
