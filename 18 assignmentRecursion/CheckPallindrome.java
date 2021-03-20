package assignmentRecursion;

//Check whether a given String S is a palindrome using recursion. Return true or false.


public class CheckPallindrome {
	public static boolean isStringPalindrome(String input) {
        if(input.length() <= 1) {
			return true;
		}
		if(input.charAt(0) != input.charAt(input.length()-1)) {
			return false;
		}
		return isStringPalindrome(input.substring(1, input.length()-1));
	}
}	
