package Tasks;

import java.util.Scanner;

public class Fibonacci_Sequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();

        // Declare the first two numbers in the Fibonacci series
        int num1 = 0, num2 = 1;

        // Print the Fibonacci series
        System.out.println("Fibonacci series up to " + terms + " terms:");

        // Loop through the series and print the numbers
        for (int i = 1; i <= terms; i++) {
            System.out.print(num1 + " ");

            // Update the values for the next iteration
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }

        // Close the scanner
        scanner.close();

    }
}
