package hashMapBonusProblems;

import java.util.HashMap;

//You are given the numerator and denominator of a fraction, you have to find the recurring sequence of digits if 
//exists when this fraction is converted into decimal.

public class FindTheRecurringSequence {
	
	public static String recurr(int num, int den) {
		num = num%den;
		String ans = "";
		if(num == 0) {
			return ans;
		}
		HashMap<Integer, Boolean> map = new HashMap<>();
		while(num != 0) {
			num *= 10;
			int quo = num/den;
			int rem = num%den;
			if(map.containsKey(rem)) {
				return ans;
			}
			map.put(rem, true);
			ans += quo;
			num = rem;
		}
		return ans;
	}
}
