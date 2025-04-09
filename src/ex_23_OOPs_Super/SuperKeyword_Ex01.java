package ex_23_OOPs_Super;

public class SuperKeyword_Ex01 {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.display();
    }
}

class Vehicle{
    int maxSpeed = 180;

    Vehicle(){
        System.out.println("DC");
    }

    Vehicle(int a){
        System.out.println("PC");
    }

    void message(){
        System.out.println("No Return type, No Arguments");
    }

    void message(int a){
        System.out.println("PC - with arguments");
    }

    void display(){
        System.out.println("Vehicle Parents");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 280;

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(){
        this.maxSpeed = maxSpeed;
    }
    Car(){
        super();
    }

    Car (int a){
        super(10);
    }

    void display(){
        System.out.println(this.maxSpeed);

        super.message();
        super.message(10);
        super.display();


        System.out.println("override");
    }
}
