package ex_24_OOPs_Abstraction;

public class Abstraction_REAL_Ex03 {
    public static void main(String[] args) {
        C1 c1 = new C1("John Doe", "123 Street", 101);
        c1.computePay();
        c1.printDetails();


    }
}
abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    void printDetails() {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Number: " + this.number);
    }

    abstract double computePay();

    void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }


}

class C1 extends Employee{

    @Override
    double computePay() {
        return 0;
    }
    C1(String name, String address, int number) {
        super(name, address, number);  // Call the parent class constructor
        System.out.println("Constructing a C1");
    }

}
