package controlStatement;

public class pattern8 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=9; i++) {
		int c = i>9 ? 9-i-1:i;
		for(int j = 0; j <= c; j++) {
			System.out.print("* ");
		}
		    System.out.println();
		}
	}
}
