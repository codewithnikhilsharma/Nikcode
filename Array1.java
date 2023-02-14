package Today;

public class Array1 {
   

		   public static void main(String[] args) {
		      int[] numbers = {1, 2, 3, 4, 5}; // initialize an array of integers with the values 1 to 5

		      // Access the third element of the array and print it
		      int thirdNumber = numbers[2]; // arrays are zero-indexed, so index 2 is the third element
		      System.out.println("The third number is " + thirdNumber);

		      // Loop through the array and print each element
		      System.out.println("The array elements are:");
		      for (int i = 0; i < numbers.length; i++) {
		         System.out.println(numbers[i]);
		      }

		      // Calculate the sum of the array elements
		      int sum = 0;
		      for (int i = 0; i < numbers.length; i++) {
		         sum += numbers[i];
		      }
		      System.out.println("The sum of the array elements is " + sum);
		   }
		}


