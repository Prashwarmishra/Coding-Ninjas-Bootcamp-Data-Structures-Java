package stacksAndQueuesBonusQuestions;

import java.util.Stack;

//There is a party of N people, out of which only one person is known to everyone (known as the celebrity). 
//That person may be present at the party or maybe not. If that person is present he(she) doesn't know anyone 
//present at the party. We can only ask the question "does A know B? “. Find the celebrity in a minimum number of questions.

//You will be given a square matrix M[][] where if an element of row i and column j is set to 1 it means the ith person 
//knows the jth person. You need to complete the function which finds the celebrity if present else returns -1.

public class FindTheCelebrity {
	
	public static int celebrity(int[][] arr, int n) {
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<n; i++) {
			st.add(i);
		}
		while(st.size() > 1) {
			int p1 = st.pop();
			int p2 = st.pop();
			if(arr[p1][p2] == 1) {
				st.add(p2);
			}else {
				st.add(p1);
			}
		}
		int p1 = st.pop();
		for(int i=0; i<n; i++) {
            if(p1 == i){
                continue;
            }
			if(arr[p1][i] == 1 || arr[i][p1] == 0) {
				return -1;
			}
		}
		
		return p1;
	}
}
