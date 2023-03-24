package Threading;

import java.util.Scanner;

public class Indo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first value :");
		int x = in.nextInt();
		System.out.print("Enter Second value : ");
		int y = in.nextInt();
		
		try {
		 int c = x/y;
		 System.out.print("Divide is : " + c);
		}
		catch(Exception e) {
			System.out.println("We Fail to divide because of : " + e);
			
		}
	}
}
