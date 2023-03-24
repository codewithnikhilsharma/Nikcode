package Threading;

import java.util.Scanner;

public class N_i_k {

	public static void main(String[] args) {
	
		int[] arr = {1 , 2, 3 ,4 ,5};
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter the array index :");
		int ind = in.nextInt();
		
		System.out.print("Eneter the nu you want to divide with : ");
		int number = in.nextInt();
		
		try {
			System.out.println("The value at array index enetr is : " + arr[ind]);
			System.out.println(" the value of array value divide by nu is : " + arr[ind]/number);
		}
		catch(Exception e) {
			System.out.println("Some Exception occur");
			System.out.println(e);
			
		}
		
	}
}
