package controlStatement;

import java.util.Scanner;

public class Pract {
  
	public static void main(String[] args) {
		 
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();
		
		for(int i = 1; i<=limit; i++) {
			if(  i % 2 !=  0) {
				System.out.println( i );
			}
		}
	}
}
