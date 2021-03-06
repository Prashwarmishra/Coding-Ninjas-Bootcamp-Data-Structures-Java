package test2;

//An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. 
//Calculate the probability that out of n drawn balls exactly x balls are red.
//Find your answer multiplied by 100 and return the integer part.
//All required values for computation will be in integer range.
//x is always less than equal to 4 and x is always less than equal to n.

public class Probability {
	public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i<=num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int ncr(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        int result = factN/(factR*factNR);
        return result;
    }

    public static int probability(int n, int x) {
        int den = ncr(8, n);
        int num = ncr(4, x) * ncr(4, n-x);
        double result = (num*1.0)/den;
        int answer = (int)(result*100);
        return answer;
    }
    
}
