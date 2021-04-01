package oopsBonusQuestions;

class Shapes{
    int lsa;
    int tsa;
    int volume;
    
    void print()
    {
        System.out.print(lsa+" "+tsa+" "+volume);
    }
       		
}

class sphere extends Shapes{
	int r;
	
	sphere(int r){
		this.r = r;
	}
	
	void print() {
		lsa=4*3*r*r;
		tsa=4*3*r*r;
		volume=4*r*r*r;
		super.print();
	}
}


class cylinder extends Shapes{
	int r;
	int h;
	
	cylinder(int r, int h){
		this.r = r;
		this.h = h;
	}
	
	void print() {
		lsa = 2*3*r*h;
		tsa = (2*3*r)*(r+h);
		volume = 3*r*r*h;
		super.print();
	}

}

class cube extends Shapes{
	int r;
	
	cube(int r){
		this.r = r;
	}
	
	void print() {
		lsa = 4*r*r;
		tsa = 6*r*r;
		volume = r*r*r;
		super.print();
	}
}
