package assignmentRecursion;

//Given k, find the geometric sum i.e.
//	1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 

public class GeometricSum {
	public static double findGeometricSum(int k){
		if(k == 0) {
			return 1;
		}
		double small = findGeometricSum(k-1);
		
		return small + 1/(Math.pow(2, k));
	}
}
