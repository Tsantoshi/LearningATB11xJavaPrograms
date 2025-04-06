package Tasks.Inteheritancce;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        // In Hierarchical Inheritance,
        // multiple classes inherit from the same parent class.

        Car car = new Car();
        car.start(); // Inherited from Vehicle
        car.drive(); // Method of Car class

        Truck truck = new Truck();
        truck.start(); // Inherited from Vehicle
        truck.loadCargo(); // Method of Truck class
    }
}
 class Truck extends Vehicle{
    public void loadCargo(){
        System.out.println("Truck is loading Cargo");
    }
 }

