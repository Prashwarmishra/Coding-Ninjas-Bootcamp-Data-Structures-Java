package strings;

//For a given input string(str), write a function to print all the possible substrings.

public class AllSubstrings {
	public static void printSubstrings(String str) {
		int n=str.length();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
	}
}
