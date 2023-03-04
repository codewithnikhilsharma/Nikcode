package Oops;

public class Examp {
	    public static void main(String[] args) {
	        // Creating a string
	        String str = "Hello, World!";

	        // Accessing the length of the string
	        int length = str.length();
	        System.out.println("Length of the string: " + length);

	        // Concatenating strings
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = str1 + ", " + str2 + "!";
	        System.out.println("Concatenated string: " + str3);

	        // Comparing strings
	        String str4 = "Hello";
	        String str5 = "hello";
	        System.out.println("String comparison: " + str4.equals(str5));

	        // Finding the index of a character in a string
	        int index = str.indexOf(',');
	        System.out.println("Index of comma: " + index);

	        // Converting a string to uppercase
	        String str6 = "hello";
	        String str7 = str6.toUpperCase();
	        System.out.println("Uppercase string: " + str7);

	        // Converting a string to lowercase
	        String str8 = "WORLD";
	        String str9 = str8.toLowerCase();
	        System.out.println("Lowercase string: " + str9);
	    }
	}


