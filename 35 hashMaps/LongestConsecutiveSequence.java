package hashMap;

import java.util.*;

//You are given an array of unique integers that contain numbers in random order. You have to find the longest possible 
//sequence of consecutive numbers using the numbers from given array.
//You need to return the output array which contains starting and ending element. If the length of the longest possible 
//sequence is one, then the output array must contain only single element.

public class LongestConsecutiveSequence {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		ArrayList<Integer> ans = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			map.put(arr[i], true);
		}
		
		for(int i=0; i<arr.length; i++) {
			int curr = arr[i];
			int count = 0;
			while(map.containsKey(curr+count)) {
				count++;
			}
			if(count > max) {
				ans = new ArrayList<>();
				ans.add(curr);
				if(count > 0) {
					ans.add(curr+count-1);
				}
				max = count;
			}
		}
		
		return ans;
	}
}
