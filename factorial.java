import java.util.Scanner;

public class FactorialFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i; // Multiply result by each number from 1 to n
            }
            return result;
        }
    }
}