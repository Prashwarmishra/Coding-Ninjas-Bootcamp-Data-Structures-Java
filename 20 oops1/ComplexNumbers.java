package oops1;

public class ComplexNumbers {
	int real;
	int imaginary;
	
	public ComplexNumbers(int real, int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void plus(ComplexNumbers n2) {
		this.real=this.real+n2.real;
		this.imaginary=this.imaginary+n2.imaginary;
	}
	
	public void multiply(ComplexNumbers n2) {
		int temp=this.real;
		this.real=(this.real*n2.real)-(this.imaginary*n2.imaginary);
		this.imaginary=(temp*n2.imaginary)+(this.imaginary*n2.real);
	}
	
	public void print() {
		System.out.println(this.real+" + i"+this.imaginary);
	}
}

