package ex_29_Wrapper_Class;

public class Lab214_Wrapper_Conversion {
    public static void main(String[] args) {

        int a11 = 10;
        Integer b = a11;  // This Boxing -> automatically JVM will store the value
        // primitive to wrapper -> AutoBoxing

        System.out.println(b.intValue());
        System.out.println(Integer.MIN_VALUE);

        System.out.println("........");

        Integer a2 = 40;
        int b2 = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost
        System.out.println(b2);

    }
}
