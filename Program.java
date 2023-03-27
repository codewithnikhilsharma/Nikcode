import java.util.Scanner;

public class Greeting {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print(" Enter your full name: ");
      String name = scanner.nextLine();
      
      System.out.println(" Hello, " + name + "!");
   }
}
