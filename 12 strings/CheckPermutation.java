package strings;

//For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.


public class CheckPermutation {
	public static boolean isPermutation(String str1, String str2) {
		int[] arr=new int[256];
		for(int i=0;i<str1.length();i++) {
			int temp=str1.charAt(i);
			arr[temp]++;
		}
		for(int i=0;i<str2.length();i++) {
			int temp=str2.charAt(i);
			arr[temp]--;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				return false;
			}
		}
		return true;
	}
}
