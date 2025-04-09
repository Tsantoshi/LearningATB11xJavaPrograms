package ex_13_Functions;

public class User_Define_Function {
    public static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        greet_wop_wor();
        String msg  = greet_wop_wr();
        System.out.println(msg);

        greet_with_details_wp_wor("aman ", +24,25000);
        greet_with_details_wp_wor("Suraj ", 25,30000);

        int result1 = sum_of_num_wp_wr(2,4);
        System.out.println(result1);

        int result2 = sum_of_num_wp_wr(1,2);
        System.out.println(result2);


    }

    // 1. Without Parameters and Without Return Type. (Declare) /Define

    static void greet_wop_wor(){
        System.out.println( "hello how are you");
    }

    // 2.Without Parameters but With Return Type
    static String greet_wop_wr(){
        System.out.println("hi");
        return "how are you";
    }

    // 3.With Parameters and Without Return Type
    static void greet_with_details_wp_wor(String name, int age, double salary){
        System.out.println("details: " + name + " " +age+ " " +salary);
    }

    // 4. With Parameters and With Return Type
    static int sum_of_num_wp_wr(int a, int b){
        return a+b;

    }





}
