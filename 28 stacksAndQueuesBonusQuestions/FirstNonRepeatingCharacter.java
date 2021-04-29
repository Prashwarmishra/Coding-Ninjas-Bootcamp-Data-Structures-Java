package stacksAndQueuesBonusQuestions;

import java.util.LinkedList;
import java.util.Queue;

//You are given an input string of characters consisting only lowercase alphabets. You have to find the first 
//non-repeating character, before each character present into the stream. If no non-repeating character is found print -1.


public class FirstNonRepeatingCharacter {
	
	public static void nonrep(String str) {
		if(str.length() <= 0) {
			return;
		}
		String ans = "";
		Queue<Character> q = new LinkedList<>();
		int[] arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			char curr = str.charAt(i);
			arr[curr-97]++;
			q.add(curr);
			
			while(!q.isEmpty()) {
				if(arr[q.peek()-97] < 2) {
					ans += q.peek();
					break;
				}
				q.poll();
			}
			if(q.isEmpty()) {
				ans += -1;
			}
		}
		
		System.out.println(ans);
    }
}
