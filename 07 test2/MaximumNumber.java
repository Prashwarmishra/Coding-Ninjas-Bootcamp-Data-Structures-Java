package revision;

import java.util.Scanner;

//We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can 
//make by removing one digit from the given integer.

public class MaximumNumber {
	public static int max_number(int n){
		int max=Integer.MIN_VALUE;
		for(int i=0;i<4;i++) {
			int count=0;
			int temp=n;
			int curr=0, pow=1;
			while(temp>0) {
				if(count!=i) {
					int base=temp%10;
					curr+=(base*pow);
					pow*=10;
				}
				count++;
				temp/=10;
			}
			if(curr>max) {
				max=curr;
			}
		}
		return max;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		System.out.println(max_number(n));
	}
}
