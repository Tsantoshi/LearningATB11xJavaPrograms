package ex_16_Arrays;

public class Array_Ex01 {
    public static void main(String[] args) {
        // 1st way
        int marks[] = {89,100,98,77,66};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        //System.out.println(marks[5]); //ArrayIndexOutOfBoundsException
        //System.out.println(marks[-1]); // ArrayIndexOutOfBoundsException


        System.out.println("Number of elements: " + marks.length);

        boolean[] is_married  = {true,false,true};
        System.out.println(is_married.length);


    }
}
