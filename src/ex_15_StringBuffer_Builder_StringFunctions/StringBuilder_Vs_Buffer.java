package ex_15_StringBuffer_Builder_StringFunctions;

public class StringBuilder_Vs_Buffer {
    public static void main(String[] args) {

        String s0 = "Santoshi";
        String s1 = new String("Santoshi");

        System.out.println(s0);
        System.out.println(s1);

        StringBuilder sb = new StringBuilder("Santoshi");
        System.out.println(sb);

        StringBuffer sbu = new StringBuffer("Santoshi");
        System.out.println(sbu);

        // memory allocation is different functions are same
    }
}
