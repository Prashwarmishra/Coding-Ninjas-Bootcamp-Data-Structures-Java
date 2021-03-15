package strings;

//Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to 
//implement a function so as to print the sentence such that each word in the sentence is reversed.


public class ReverseEachWord {
	public static String reverseEachWord(String input) {
		int n=input.length();
		if(n<=1) {
			return input;
		}
		String ans="";
		int i=0;
		while(i<n) {
			String temp="";
			while(i<n && input.charAt(i)!=' ') {
				temp=input.charAt(i)+temp;
				i++;
			}
			ans+=temp+" ";
			i++;
		}
		return ans;
	}
}
