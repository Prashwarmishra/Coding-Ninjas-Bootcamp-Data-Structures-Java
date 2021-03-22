package test4;

public class MinimumCount {
	public static int minCount(int n){
		if(n<4) {
			return n;
		}
		int min=n;
		for(int i=1;i<n;i++) {
			if((i*i)>n) {
				return min; 
			}
			min = Math.min(min, minCount(n-(i*i))+1);
		}
		return min;
	}
}
