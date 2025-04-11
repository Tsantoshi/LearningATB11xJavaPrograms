package Tasks.task04april;

import java.util.Scanner;

public class Person_eligible_ToVote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");

        try {

            int age = sc.nextInt();

            if (age > 18) {
                System.out.println("Person is eligible to Vote");
            } else {
                System.out.println("Person is not eligible to Vote");
            }
        } catch (Exception e) {
            System.out.println("Invalid input, Please provide integer only!!");
        }
        sc.close();
    }
}
