package ex_11_While_Loop;

import java.util.Scanner;

public class Factorial_Program {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        int factorial=1;
        if(number<0){
            System.out.println(factorial);
        }else{
            for (int i=1; i<number; i++){
                factorial = factorial*number;
            }
        }
        System.out.println("factorial is: "+factorial);

    }
}
