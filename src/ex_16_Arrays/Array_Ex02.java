package ex_16_Arrays;

public class Array_Ex02 {
    public static void main(String[] args) {

        int marks[] = {1, 2, 3, 4, 5};

        // 2nd way to create an array

        int[] marks2 = new int[5]; //fixed size

        int marks3[] = new int[6];

        marks2[0] = 100;
        marks2[1] = 99;
        marks2[2] = 89;


        System.out.println(marks2[1]);
        System.out.println(marks2.length);

        String name[] = new String[3];
        name[0] = "Raja";
        name[1] = "Praja";
        name[2] = "Raju";
        //name[3] = "amit";

        System.out.println(name[0]);

    }
}
