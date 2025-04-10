package ex_30_Exceptions;

public class Try_Catch_Multiple {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("ARE YOU FOOL");
        }
        catch (Exception e){
            System.out.println("ARE YOU FOOL");
        }
        System.out.println("2");
        // first catch block will execute
        //ArithmeticException is a subclass of Exception, and Java checks catch blocks from top to bottom

    }
}
