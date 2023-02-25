package Now;

public class ReverseNumber {
    
    public static void main(String[] args) {
        
        // Test the method with some input
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
    
    // Reverse a given integer
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return reversedNumber;
    }
}

