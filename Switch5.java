package controlStatement;

import java.util.Scanner;

public class Switch5 {

	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a command: ");
	    String text = input.nextLine();

	    switch (text) {
	      case "start":
	        System.out.println("Starting process...");
	        break;
	      case "stop":
	        System.out.println("Stopping process...");
	        break;
	      case "pause":
	        System.out.println("Pausing process...");
	        break;
	      default:
	        System.out.println("Invalid command.");
	    }
	  }
	}

