package ex_15_StringBuffer_Builder_StringFunctions;

public class StringBuilderEx01 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Santoshi");
        System.out.println(sb.append("Thakur"));
        System.out.println(sb.delete(2,5));
        System.out.println(sb.append(123));
    }
}
