package strings;

//Given a string, determine if it is a palindrome, considering only alphanumeric characters.

public class StringPallindrome {
	public static boolean isPalindrome(String str) {
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
