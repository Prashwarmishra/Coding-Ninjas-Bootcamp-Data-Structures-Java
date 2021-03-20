package assignmentRecursion;

//Given a string S, compute recursively a new string where identical chars that are adjacent in the original 
//string are separated from each other by a "*".

public class PairStar {
	public static String addStars(String s) {
		if(s.length() <= 1) {
			return s;
		}
		String small = addStars(s.substring(1));
		if(s.charAt(0) != small.charAt(0)) {
			return s.charAt(0)+small;
		}
		return s.charAt(0)+"*"+small;
	}
}