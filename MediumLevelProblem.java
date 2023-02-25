package Now;

import java.util.*;

public class MediumLevelProblem {

   public static void main(String[] args) {
   
      Scanner scanner = new Scanner(System.in);
      
      // Get the number of elements in the array
      System.out.print("Enter the number of elements in the array: ");
      int numElements = scanner.nextInt();
      
      // Create an array to store the elements
      int[] array = new int[numElements];
      
      // Get the elements from the user
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i < numElements; i++) {
         array[i] = scanner.nextInt();
      }
      
      // Find the second largest element in the array
      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;
      
      for (int i = 0; i < numElements; i++) {
         if (array[i] > largest) {
            secondLargest = largest;
            largest = array[i];
         } else if (array[i] > secondLargest && array[i] != largest) {
            secondLargest = array[i];
         }
      }
      
      System.out.println("The second largest element in the array is: " + secondLargest);
   }
}

