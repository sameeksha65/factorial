import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long factorial = 1; // Variable to store the factorial result

        // Calculate factorial using iterative method
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply factorial by i at each step
        }
        
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
