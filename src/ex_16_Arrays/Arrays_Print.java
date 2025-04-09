package ex_16_Arrays;

import java.util.Arrays;

public class Arrays_Print {
    public static void main(String[] args) {

        int[] marks = {100,89,77,66,86};
        System.out.println("Total number of elements:" +marks.length);
        System.out.println(marks[3]);

        for (int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }




    }
}
