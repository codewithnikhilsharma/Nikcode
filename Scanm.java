package Array;

import java.util.Scanner;

public class Scanm {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.println(" Enter the size of array : ");
	
	int n = in.nextInt();
	
	int[]arra = new int[n];
	
	System.out.println(" Enter the value of array : " + n  );
	for(int i = 0; i<arra.length; i++){
		arra[i] = in.nextInt();	
	}	
	
	for(int i = 0; i<arra.length; i++){
		System.out.println(arra[i]);	
	}
   }
  }
