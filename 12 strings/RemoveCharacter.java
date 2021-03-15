package strings;

//For a given a string(str) and a character X, write a function to remove all the occurrences of X from the 
//given string.
//The input string will remain unchanged if the given character(X) doesn't exist in the input string.

public class RemoveCharacter {
	public static String removeAllOccurrencesOfChar(String input, char c) {
		String ans="";
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == c) {
				continue;
			}
			ans+=input.charAt(i);
		}
		return ans;
	}
}
