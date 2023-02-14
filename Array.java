package Today;

public class Array {

	public static void main(String[] args) {
		
		// declare an array of integers
		int[] numbers = new int[5];

		// initialize the array with values
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;

		// print the values of the array
		for (int i = 0; i < numbers.length; i++) {
		   System.out.println(numbers[i]);
		}

	}
}
