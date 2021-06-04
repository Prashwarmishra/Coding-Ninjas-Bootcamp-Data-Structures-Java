package hashMapBonusProblems;

import java.util.HashMap;
import java.util.Set;

//You are given a N-sized array of integers and a value k. In the given array you have to find whether this array can 
//be divided into pairs such that the sum of every pair is divisible by k.

public class CheckForPairsInTheArray {
	
	public static boolean ispairexist(int[] arr, int n, int k) {
		if(n <= 0 || n%2 != 0) {
			return false;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			int key = arr[i]%k;
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else {
				map.put(key, 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		for(int i:set) {
			if(i == 0 || (k%2 == 0 && k/2 == i)) {
				if(map.get(i)%2 != 0) {
					return false;
				}
			}
			else if(map.containsKey(k-i)) {
				if(map.get(i) != map.get(k-i)) {
					return false;
				}
			}else {
				return false;
			}
		}
		return true;
	}
}
