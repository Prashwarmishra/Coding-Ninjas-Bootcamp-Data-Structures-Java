package oops1;

public class PolynomialUse {
	public static void main(String[] args) {
		Polynomial p1 = new Polynomial();
		p1.setCoefficient(7, 3);
		p1.setCoefficient(3, 1);
		p1.setCoefficient(1, 2);
		
		
		Polynomial p2 = new Polynomial();
		p2.setCoefficient(2, 7);
		p2.setCoefficient(1, 8);
		
		p1.print();
		p2.print();
		
		Polynomial ans = p1.multiply(p2);
		
		ans.print();
	}
}
