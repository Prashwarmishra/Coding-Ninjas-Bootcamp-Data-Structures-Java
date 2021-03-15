package strings;

//Reverse the given string word wise. That is, the last word in given string should come at 1st place, 
//last second word at 2nd place and so on. Individual words should remain as it is.


public class ReverseStringWordwise {
	public static String reverseWordWise(String input) {
		if(input.length()<=1) {
			return input;
		}
		int i=0;
		String ans="";
		while(i<input.length()) {
			String temp="";
			while(i<input.length() && input.charAt(i)!=' ') {
				temp+=input.charAt(i);
				i++;
			}
			ans=temp+" "+ans;
			i++;
		}
		return ans;
	}
}
