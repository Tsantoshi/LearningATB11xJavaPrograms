package ex_24_OOPs_Abstraction;

public class Abstraction_Ex01 {
    public static void main(String[] args) {

        child ch = new child();
        ch.loan25k();
        ch.loan50k();

        //Father f1 = new Father(); // not possible
        }
    }

abstract class Father{

    abstract void loan50k();

    void loan25k(){
        System.out.println("given 25k");

    }

}

class child extends Father{

    void loan50k(){
        System.out.println("child will pay the loan");
    }
}
