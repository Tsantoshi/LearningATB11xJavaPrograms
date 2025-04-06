package Tasks.Polymorphism;

public class Method_Overriding {
    public static void main(String[] args) {

        Vehicle myCar = new Car();
        myCar.start();

        Vehicle myTruck = new Truck();
        myTruck.start();
    }
}
class Vehicle{
    public void start(){
        System.out.println("vehicle is starting");

    }
}
class Car extends  Vehicle{
    public void start(){
        System.out.println("Car is starting");
    }
}

class Truck extends Vehicle{
    public void start(){
        System.out.println("Truck is starting");
    }
}
