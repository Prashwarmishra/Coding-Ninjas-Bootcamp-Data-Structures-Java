package hashMap;

import java.util.HashMap;

//You are given with an array of integers and an integer K. You have to find and print the count of all such pairs
//which have difference K.

public class PairsWithDifferenceK {
	public static int getPairsWithDifferenceK(int arr[], int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			if(map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value+1);
			}else {
				map.put(key, 1);
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			int key = arr[i];
			int val1 = key-k;
			int val2 = key+k;
			if(val1 == val2) {
				count += (map.get(key)*(map.get(key)-1))/2;
				map.put(key, 0);
				continue;
			}
			if(map.containsKey(val1)) {
				count += (map.get(key)*map.get(val1));
			}
			if(map.containsKey(val2)) {
				count += (map.get(key)*map.get(val2));
			}
			map.put(key, 0);
		}
		
		return count;
	}
}
