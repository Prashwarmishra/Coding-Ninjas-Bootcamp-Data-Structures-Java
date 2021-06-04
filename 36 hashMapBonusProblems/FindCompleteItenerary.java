package hashMapBonusProblems;

import java.util.HashMap;
import java.util.Set;

//You are given a list of input tickets which are not cyclic and there is only one ticket from every given city except the 
//final destination. You have to find the complete itinerary in order using the given list.


public class FindCompleteItenerary {
	
	public static void itineary(HashMap<String, String> input) {
		if(input.isEmpty()) {
			return;
		}
		HashMap<String, String> map = new HashMap<>();
		Set<String> set = input.keySet();
		for(String i: set) {
			map.put(input.get(i), i);
		}
		String x = "";
		for(String i:set) {
			if(!map.containsKey(i)) {
				x = i;
			}
		}
		String y = input.get(x);
		System.out.println(x + " -> " + y);
		
		while(input.containsKey(y)) {
			x = y;
			y = input.get(y);
			System.out.println(x + " -> " + y);
		}
	}
}
