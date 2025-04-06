package Tasks.Inteheritancce;

public class Single_Inheritance {
    public static void main(String[] args) {

        //In Single Inheritance,
        // a class (child class) inherits from another class (parent class).

        Car c = new Car();
        c.drive();
        c.start();
    }
}

class Vehicle{
    public void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    public void drive(){
        System.out.println("Car is driving");
    }
}