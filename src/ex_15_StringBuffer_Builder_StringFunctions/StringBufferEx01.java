package ex_15_StringBuffer_Builder_StringFunctions;

public class StringBufferEx01 {
    public static void main(String[] args) {

        StringBuffer sbu = new StringBuffer("Santoshi");
        System.out.println(sbu.append("Thakur"));
        System.out.println(sbu.reverse());

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
