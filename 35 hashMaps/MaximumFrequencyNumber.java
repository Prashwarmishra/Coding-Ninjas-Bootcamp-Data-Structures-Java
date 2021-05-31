package hashMap;

import java.util.*;

//You are given an array of integers that contain numbers in random order. Write a program to find and return the number 
//which occurs the maximum times in the given input.


public class MaximumFrequencyNumber {
	
	public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			if(map.containsKey(key)) {
				int temp = map.get(key);
				map.put(key, temp+1);
				continue;
			}
			map.put(key, 1);
		}
		int max = Integer.MIN_VALUE;
		int ans = -1;
		for(int i=0; i<arr.length; i++) {
			int val = map.get(arr[i]);
			if(val > max) {
				max = val;
				ans = arr[i];
			}
		}
		return ans;
    }
}
