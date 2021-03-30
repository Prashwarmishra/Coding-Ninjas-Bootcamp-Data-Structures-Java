package oops1;

public class Polynomial {
	private int[] data;
	private int currentIndex;
	
	public Polynomial() {
		data=new int[5];
		currentIndex=0;
	}
	
	private void add(int val) {
		if(data.length >= currentIndex) {
			doubleSize();
		}
		data[currentIndex++]=val;
	}

	private void doubleSize() {
		int[] temp=data;
		data=new int[temp.length+1];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	
	public int get(int i) {
		if(i>=currentIndex) {
			return 0;
		}
		return data[i];
	}
	
	public void setCoefficient(int degree, int coeff){
		while(currentIndex<=degree) {
			this.add(0);
		}
		data[degree]=coeff;
		
	}
	
	public void print() {
		for(int i=0;i<currentIndex;i++) {
			if(data[i]!=0) {
				System.out.print(data[i]+"x"+i+" ");
			}
		}
		System.out.println();
	}
	
	public Polynomial add(Polynomial p) {
		Polynomial ans = new Polynomial();
		int i=0, j=0;
		while(i<this.currentIndex && j<p.currentIndex) {
			ans.setCoefficient(i, this.data[i]+p.data[j]);
			i++;j++;
		}
		while(i<this.currentIndex) {
			ans.setCoefficient(i, this.data[i++]);
		}
		while(j<p.currentIndex) {
			ans.setCoefficient(j, p.data[j++]);
		}
		return ans;
	}
	
	public Polynomial subtract(Polynomial p) {
		Polynomial ans = new Polynomial();
		int i=0, j=0;
		while(i<this.currentIndex && j<p.currentIndex) {
			ans.setCoefficient(i, this.data[i]-p.data[j]);
			i++;j++;
		}
		while(i<this.currentIndex) {
			ans.setCoefficient(i, this.data[i++]);
		}
		while(j<p.currentIndex) {
			ans.setCoefficient(j, -p.data[j++]);
		}
		return ans;
	}
	
	public Polynomial multiply(Polynomial p) {
		Polynomial ans = new Polynomial();
		for(int i=0;i<this.currentIndex;i++) {
			for(int j=0;j<p.currentIndex;j++) {
				int coefficient = this.data[i]*p.data[j];
				int degree = i+j;
				int temp=ans.get(degree);
				ans.setCoefficient(degree, coefficient+temp);
			}
		}
		return ans;
	}
}
