package Oops;

import java.util.Scanner;

public class ReverseArr {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str = input.nextLine();
	        String reversedStr = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversedStr += str.charAt(i);
	        }
	        System.out.println("Reversed string is: " + reversedStr);
	    }
	}


