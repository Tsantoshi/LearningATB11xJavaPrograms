package ex_30_Exceptions;

public class Handle_Exception {
    public static void main(String[] args) {

        int a = 0;
        // ArithmeticException
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}
