package Oops;

import java.util.Scanner;

public class StringArr {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str = input.nextLine();
	        String reversedStr = new StringBuilder(str).reverse().toString();
	        if (str.equals(reversedStr)) {
	            System.out.println(str + " is a palindrome.");
	        } else {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }
	}


