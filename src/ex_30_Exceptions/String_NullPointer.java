package ex_30_Exceptions;

public class String_NullPointer {
    public static void main(String[] args) {

        String  name = null;
        name.trim();    // java.lang.NullPointerException
    }
}
