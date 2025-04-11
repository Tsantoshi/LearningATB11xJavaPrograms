package Tasks.task04april;

import java.util.Scanner;

public class Number_even_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = 0;
        try {
            num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid integer.");
        }

    }
}
