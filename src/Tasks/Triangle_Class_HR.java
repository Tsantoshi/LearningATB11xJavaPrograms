package Tasks;

import java.util.Scanner;

public class Triangle_Class_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the lengths of the sides
        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();

        // Classify the triangle based on the side lengths
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    }
}
