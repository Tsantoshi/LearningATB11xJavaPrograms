package Tasks.task04april;

import java.util.Scanner;

public class Max_2numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter 1st numbers");
            int num1 = sc.nextInt();
            System.out.println("enter 2nd number");
            int num2 = sc.nextInt();

            int max;
            if (num1 > num2) {
                max = num1;
            } else if (num1 < num2) {
                max = num2;
            } else {
                System.out.println("both are equal");
                return;
            }

            System.out.println("Maximum number is: " + max);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            sc.close(); // always close the scanner
        }
    }
}
