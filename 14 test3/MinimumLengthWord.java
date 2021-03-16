package test3;

public class MinimumLengthWord {
	public static String minLengthWord(String input){
		int n=input.length();
		String ans=""; 
		int ansLength=Integer.MAX_VALUE;
		for(int i=0;i<n;) {
			String temp="";
			int count=0;
			while(i<n && input.charAt(i) != ' ') {
				count++;
				temp+=input.charAt(i++);
			}
			if(count<ansLength) {
				ansLength=count;
				ans=temp;
			}
			i++;
		}
		return ans;
	}
}
