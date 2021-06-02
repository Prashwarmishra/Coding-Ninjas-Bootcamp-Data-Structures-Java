package hashMap;

import java.util.HashMap;

//Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.

public class PairSumToZero {
	
	public static int PairSum(int[] input, int size) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<input.length; i++) {
			int key = input[i];
			if(map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value+1);
			}else {
				map.put(key, 1);
			}
		}
		
		for(int i=0; i<input.length; i++) {
			int key = input[i];
			if(map.containsKey(key) && map.containsKey(-key)) {
				if(map.get(key) > 0 && map.get(-key) > 0) {
					
					int val1 = map.get(key);
					int val2 = map.get(-key);
                    if(key == -key){
                        count += ((val1)*(val1-1))/2;
                    }else{
                      	count += (val1*val2);  
                    }
					map.put(key, 0);
					map.put(-key, 0);
				}
			}
		}
		return count;
	}
}
