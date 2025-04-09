package ex_25_OOPs_Abstraction_Abstract_Class;

public class Interface_Ex02 {
    public static void main(String[] args) {

        car1 c1 = new car1();
       c1.applyBreak();
        //c1.drive();
        c1.startEngine();
        c1.stopEngine();
    }
}

interface Brakes{
    void applyBreak();
}

interface Engine1{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("concrete complete");
    }
}

class car1 implements Brakes,Engine1{

    @Override
    public void applyBreak() {
        System.out.println("apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("starting Engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("stopping Engine");

    }
    /*void drive(){
        startEngine();
        startEngine();
        applyBreak();
    }*/
}
