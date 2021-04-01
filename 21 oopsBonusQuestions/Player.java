package oopsBonusQuestions;

public class Player{
    String p_name;
    int jnumber, t_runs, innings, notouts;
    int avg;
    // complete the functions below to print the output in desired format
    void set(String name,int number,int runs,int inn,int nos){
    	this.p_name = name;
    	this.jnumber = number;
    	this.t_runs = runs;
    	this.innings = inn;
    	this.notouts = nos;
    	this.avg = findavg();;
        
    }
    int findavg(){
    	return this.t_runs/(this.innings-this.notouts);
    }

    void print(){
    	System.out.println(this.p_name+" "+this.jnumber+" "+this.t_runs+" "+this.innings+" "+this.notouts+" "+this.avg);
    }
    
    
}