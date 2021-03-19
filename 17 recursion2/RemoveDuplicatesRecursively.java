package recursion2;

//Given a string S, remove consecutive duplicates from it recursively.

public class RemoveDuplicatesRecursively {
	
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length() <= 1) {
			return s;
		}
		String ans = removeConsecutiveDuplicates(s.substring(1));
		if(s.charAt(0) == ans.charAt(0)) {
			return ans;
		}
		return s.charAt(0)+ans;
	}
}
