package hashMapBonusProblems;

import java.util.*;

//You have been given a string STR and a non-empty string PTR. Your task is to find all the starting indices of PTR’s anagram 
//in STR.
//An anagram of a string is another string which contains the same characters and is obtained by rearranging the characters.

public class FindAllAnagrams {
	public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(int i=0; i<m; i++) {
        	arr1[ptr.charAt(i)-'A']++;
        	arr2[str.charAt(i)-'A']++;
        }
        boolean isMatch = true;
        for(int i=0; i<26; i++) {
        	if(arr1[i] != arr2[i]) {
        		isMatch = false;
        		break;
        	}
        }
        if(isMatch) {
        	ans.add(0);
        }
        for(int i=m; i<n; i++) {
        	arr2[str.charAt(i)-'A']++;
        	arr2[str.charAt(i-m)-'A']--;
        	isMatch = true;
        	for(int j=0; j<26; j++) {
        		if(arr1[j] != arr2[j]) {
        			isMatch = false;
        			break;
        		}
        	}
        	if(isMatch) {
        		ans.add(i-m+1);
        	}
        }
        return ans;
    }
//	public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m){
//		ArrayList<Integer> arr = new ArrayList<>();
//		HashMap<Character, Integer> map = new HashMap<>();
//		for(int i=0; i<ptr.length(); i++) {
//			char key = ptr.charAt(i);
//			if(map.containsKey(key)) {
//				map.put(key, map.get(key)+1);
//			}else {
//				map.put(key, 1);
//			}
//		}
//		HashMap<Character, Integer> copy = new HashMap<>();
//		for(int i=0; i<m-1; i++) {
//			char key = str.charAt(i);
//			if(copy.containsKey(key)) {
//				copy.put(key, copy.get(key)+1);
//			}else {
//				copy.put(key, 1);
//			}
//		}
//		int j = 0;
//		for(int i=m-1; i<n; i++) {
//			char key = str.charAt(i);
//			if(copy.containsKey(key)) {
//				copy.put(key, copy.get(key)+1);
//			}else {
//				copy.put(key, 1);
//			}
//			if(map.equals(copy)) {
//				arr.add(j);
//			}
//			key = str.charAt(j++);
//			int value = copy.get(key)-1;
//			if(value <= 0) {
//				copy.remove(key);
//			}else {
//				copy.put(key, value);
//			}
//		}
//		return arr;
//	}
}
