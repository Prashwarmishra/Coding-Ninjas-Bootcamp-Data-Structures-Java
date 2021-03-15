package strings;

//For a given input string(str), find and return the total number of words present in it.


public class CountWords {
	public static int countWords(String str) {	
		if(str == "" || str == " ") {
			return 0;
		}
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
}
