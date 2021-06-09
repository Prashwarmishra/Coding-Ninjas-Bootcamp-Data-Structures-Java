package hashMapBonusProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Given a string of lower case English letters ('a' to 'z') and a positive number K, find the length longest substring 
//of the given string containing K distinct characters and if K is more than the number of distinct character in the 
//input string output -1.

class Info{
	int n;
	String str;
	int k;
	public Info(int n, String str, int k) {
		this.n = n;
		this.str = str;
		this.k = k;
	}
}

public class LongestSubString {
	public static int longestSubstring(String str, int n, int k) {
		int count = 0;
		int x = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			char key = str.charAt(i);
			if(map.containsKey(key)) {
				int value = map.get(key);
				while(x <= value) {
					map.remove(str.charAt(x++));
				}
			}
			map.put(key, i);
			count = i-x+1;
			if(count >= k) {
				return k;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		ArrayList<Info> arr = new ArrayList<>();
		while(count > 0) {
			int n = s.nextInt();
			int k = s.nextInt();
			String str = s.next();
			Info in = new Info(n, str, k);
			arr.add(in);
			count--;
		}
		for(int i=0; i<arr.size(); i++) {
			Info in = arr.get(i);
			System.out.println(longestSubstring(in.str, in.n, in.k));
		}
		s.close();
	}
}
