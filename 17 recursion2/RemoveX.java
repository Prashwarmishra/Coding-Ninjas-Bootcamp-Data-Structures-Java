package recursion2;

//Given a string, compute recursively a new string where all 'x' chars have been removed.

public class RemoveX {
	public static String removeX(String input){		
		if(input.length() == 0) {
			return "";
		}
		String ans = removeX(input.substring(1));
		if(input.charAt(0) == 'x') {
			return ans;
		}
		return input.charAt(0)+ans;
	}
}
