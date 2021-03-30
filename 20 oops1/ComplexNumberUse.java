package oops1;

public class ComplexNumberUse {
	public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers(4, 5);
		ComplexNumbers c2 = new ComplexNumbers(1, 2);
		c1.multiply(c2);
		c1.print();
	}
}
