package strings;

//For a given string(str), remove all the consecutive duplicate characters.

public class RemoveConsecutiveDuplicates {
	public static String removeConsecutiveDuplicates(String input) {
		String ans=""+input.charAt(0);
		char curr=input.charAt(0);
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)!=curr) {
				curr=input.charAt(i);
				ans+=curr;
			}
		}
		return ans;
	}
}
