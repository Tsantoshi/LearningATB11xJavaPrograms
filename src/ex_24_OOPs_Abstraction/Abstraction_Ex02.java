package ex_24_OOPs_Abstraction;

public class Abstraction_Ex02 {
    public static void main(String[] args) {

        WagonR car = new WagonR();
        car.drive();
        car.normal();
    }
}
abstract class Engine{

    abstract void startEngine();
    abstract void stopEngine();

    void normal(){
        System.out.println("Normal Function");
    }
}

class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("stopping the car");
    }

    void drive(){
        startEngine();
        stopEngine();
    }
}
