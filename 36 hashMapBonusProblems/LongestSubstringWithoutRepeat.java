package hashMapBonusProblems;

import java.util.HashMap;

//You are given a string S that may or may not contain repeating characters. Your task is to find out the length of the 
//longest substring of this given string that does not contain any repeating characters.

public class LongestSubstringWithoutRepeat {
	//abcdgakbjda
	public static int longestSubstringLength(String str) {
        int ans = 0;
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int x = 0;
        for(int i=0; i<n; i++) {
            char key = str.charAt(i);
            if(map.containsKey(key)) {
                int val = map.get(key);
                while(x <= val) {
                    map.remove(str.charAt(x));
                    x++;
                }
                map.put(key, i);
            }else{
                map.put(key, i);
            }
            int count = i-x+1;
            if(count > ans) {
                ans = count;
            }
        }
        return ans;
    }
}
