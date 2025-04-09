package ex_18_OOPs_Constructor;

public class Parameterized_Constructor_realex {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.printDetails();
        p1.eat();
        p1.sleep();
        p1.walk();

        System.out.println("...........");

        Person p2 = new Person("Rahul", "street11", 24, 12346787, true);
        p2.printDetails();
        p2.walk();
        p2.sleep();
        p2.eat();
    }
}
class Person{

    String name;
    int age;
    String address;
    long ph_num;
    boolean is_male;

    void eat(){
        System.out.println(name + " person is eating");
    }

    void walk(){
        System.out.println(name + " person is walking");
    }

    void sleep(){
        System.out.println(name+ " person is sleeping");
    }

    public void printDetails() {

        System.out.println("Person Details: ");
        System.out.println("name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
        System.out.println("Phone Number:" + ph_num);
        System.out.println("Gender:" + (is_male ? "Male" : "Female"));
    }

    public Person(){
        this.name = "unknown";
        this.age = 25;
        this.address = "street12";
        this.ph_num = 123456789;
        this.is_male = true;

    }

    public Person(String name, String address, int age, long ph_num, boolean is_male){
        this.name = name;
        this.address = address;
        this.age = age;
        this.ph_num = ph_num;
        this.is_male = is_male;
    }
}
