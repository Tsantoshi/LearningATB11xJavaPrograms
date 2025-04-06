package Tasks.Inteheritancce;

public class Multilevel_Inheritance {
    public static void main(String[] args) {

        // In Multilevel Inheritance, a class is derived from another class,
        // which is also derived from another class, forming a chain.

        SportsCar sc = new SportsCar();
        sc.start(); // Inherited from Vehicle
        sc.drive();  // Inherited from Car
        sc.accelerate();  // Method of SportsCar class
    }
}

class SportsCar extends Car{
    public void accelerate(){
        System.out.println("SportsCar is accelerating");
    }

}
