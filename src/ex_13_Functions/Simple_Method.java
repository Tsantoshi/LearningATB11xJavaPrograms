package ex_13_Functions;

public class Simple_Method {
    public static void main(String[] args) {
    f1();
        int result = return_int();
        System.out.println(result);

        boolean result1 = return_boolean();
        System.out.println(result1);

        String name = retrun_string();
        System.out.println(name);

        float f = return_float();
        System.out.println(f);

        long l = return_long();
        System.out.println(l);

        byte b = return_byte();
        System.out.println(b);
    }

    static void f1(){
        System.out.println("No return type");
    }

    static int return_int(){
        return 10;

    }
    static boolean return_boolean(){
        return true;
    }

    static float return_float(){
        return 2.4f;

    }

    static long return_long(){
        return 12345;
    }

    static String retrun_string(){
        return "ABC";


    }

    static byte return_byte(){
        return 100;
    }
}
