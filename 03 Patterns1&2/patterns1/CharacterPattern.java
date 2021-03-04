package patterns1;

import java.util.Scanner;

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//A
//BC
//CDE
//DEFG

public class CharacterPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((char)(64+i+j));
			}
			System.out.println();
		}
		
		s.close();
	}
}
