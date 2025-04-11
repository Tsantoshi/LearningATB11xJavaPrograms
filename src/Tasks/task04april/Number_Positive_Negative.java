package Tasks.task04april;

import java.util.Scanner;

public class Number_Positive_Negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        Integer num = null;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("enter only integer");

        }
        if(num!=null){
        if(num>0){
            System.out.println("Number is positive");

        }else if(num<0){
            System.out.println("Number is negative");
        }else {
            System.out.println("number is zero");
        }
    }else {
            System.out.println("No valid input received.");
        }
}
}
