package Oops;

import java.util.Scanner;

public class Vowel {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String str = input.nextLine().toLowerCase();
	        int vowelCount = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                vowelCount++;
	            }
	        }
	        System.out.println("Number of vowels in " + str + " is: " + vowelCount);
	    }
	}


