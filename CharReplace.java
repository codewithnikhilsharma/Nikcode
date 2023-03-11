package Oops;

import java.util.Scanner;

public class CharReplace {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str = input.nextLine();
	        System.out.println("Enter the character to replace: ");
	        char oldChar = input.nextLine().charAt(0);
	        System.out.println("Enter the new character: ");
	        char newChar = input.nextLine().charAt(0);
	        String replacedStr = str.replace(oldChar, newChar);
	        System.out.println("Replaced string is: " + replacedStr);
	    }
	}


