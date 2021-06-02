package hashMap;

import java.util.HashMap;

//Given a string S, you need to remove all the duplicates. That means, the output string should contain each
//character only once. The respective order of characters should remain same, as in the input string.

public class ExtractUniqueCharacters {
	
	public static String uniqueChar(String str){
		HashMap<Character, Boolean> map = new HashMap<>();
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			char key = str.charAt(i);
			if(!map.containsKey(key)) {
				map.put(key, true);
				ans+=key;
			}
		}
		return ans;
	}
}
