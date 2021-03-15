package strings;

//For a given a string(str), find and return the highest occurring character.


public class HighestOccuringCharacter {
	public static char highestOccuringChar(String str) {
		int[] arr=new int[26];
		for(int i=0;i<str.length();i++) {
			char temp=str.charAt(i);
			arr[temp-97]++;
		}
		int max=Integer.MIN_VALUE;
		char ans=' ';
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				ans=(char)(97+i);
			}
		}
		return ans;
	}
}	
