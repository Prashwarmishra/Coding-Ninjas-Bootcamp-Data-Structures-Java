package assignmentRecursion;

//Write a recursive function to convert a given string into the number it represents. That is input 
//will be a numeric string that contains only numbers, you need to convert the string into corresponding 
//integer and return the answer.

public class StringToInteger {
	public static int convertStringToInt(String input){
		if(input.length() == 0) {
			return 0;
		}
		int base = input.charAt(input.length()-1)-'0';
		int smallAns = convertStringToInt(input.substring(0, input.length()-1));
		
		return smallAns*10+base;
	}
}
