package ex_16_Arrays;

import java.util.Scanner;

public class Right_Triangle_2D {
    public static void main(String[] args) {

        //  n = 3
        // *
        // **
        // ***

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for eg. 3");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){

            for(int j = 0 ; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
