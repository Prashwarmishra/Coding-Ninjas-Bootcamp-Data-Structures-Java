package hashMapBonusProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//You are given an N-sized array of strings, you have to make groups of those strings in such a way that all the 
//strings of a group are shifted versions of each other.
//Two strings A and B are placed in the same group if:
	//Length of A= Length of B
	//A[i]=B[i]+k
	//1 <= i <= Length of A or B  for a constant integer K

public class ShiftedStrings {
	public static String getKey(String str) {
		String ans = "";
		for(int i=0; i<str.length()-1; i++) {
			int diff = Math.abs(str.charAt(i+1)-str.charAt(i));
			char temp = (char)(diff+97);
			ans+=temp;
		}
		return ans;
	}
	public static void grouping(String[] arr, int n) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			String key = getKey(arr[i]);
			ArrayList<String> temp;
			if(map.containsKey(key)) {
				temp = map.get(key);
			}else {
				temp = new ArrayList<>();
			}
			temp.add(arr[i]);
			map.put(key, temp);
		}
		Set<String> set = map.keySet();
		for(String str: set) {
			ArrayList<String> temp = map.get(str);
			for(int i=0; i<temp.size(); i++) {
				System.out.print(temp.get(i)+" ");
			}
			System.out.println();
		}
	}
}
