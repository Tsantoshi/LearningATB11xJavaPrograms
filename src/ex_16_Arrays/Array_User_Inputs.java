package ex_16_Arrays;

import java.util.Scanner;

public class Array_User_Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        String[] numbers_marks =  new String[size];

        //int[] number_marks = new int[size];
        String[] number_marks =  new String[size];

        for(int i=0; i<number_marks.length; i++){

            //number_marks[i] = scanner.nextInt();
            number_marks[i] = scanner.next();
        }

        System.out.println(" ---- ");

        for (int i = 0; i < number_marks.length ; i++) {
            System.out.println(number_marks[i]);
        }

        scanner.close();



    }
}
