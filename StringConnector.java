package Oops;

import java.util.Scanner;

public class StringConnector {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the first string: ");
	        String str1 = input.nextLine();
	        System.out.println("Enter the second string: ");
	        String str2 = input.nextLine();
	        String concatenatedStr = str1 + str2;
	        System.out.println("Concatenated string is: " + concatenatedStr);
	    }
	}


