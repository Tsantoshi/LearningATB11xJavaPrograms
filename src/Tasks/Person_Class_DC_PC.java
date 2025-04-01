package Tasks;

public class Person_Class_DC_PC {
    public static void main(String[] args) {
        //object with DC
        Person p1 = new Person();
        p1.printDetails();
        p1.eat();
        p1.sleep();
        p1.walk();
        p1.dohome();

        System.out.println( );

        //object with PC

        Person p2 = new Person("Raj", "street no.12", 25, 123456789,true);
        p2.printDetails();
        p2.eat();
        p2.sleep();
        p2.walk();
        p2.dohome();


    }
}

class Person{
    String name;
    int age;
    String address;
    long phone_number;
    boolean is_male;


void eat(){
    System.out.println(name + " person is eating");
}

void sleep(){

    System.out.println(name + " person is sleeping");
}

void walk(){

    System.out.println(name + " person is walking");
}
void dohome(){

    System.out.println(name + "person is doing homework");
}

public void printDetails(){

    System.out.println("Person Details: ");
    System.out.println("name:" +name);
    System.out.println("Age:" +age);
    System.out.println("Address:" +address);
    System.out.println("Phone Number:" +phone_number);
    System.out.println("Gender:" +(is_male ? "Male" : "Female"));


    }

    public Person(){
    this.name = "unknown";
    this.address = "not provided";
    this.age = 0;
    this.phone_number = 123456789;
    this.is_male = false;

}

public Person(String name, String address, int age, long phone_number, boolean is_male){
    this.name = name;
    this.age = age;
    this.address = address;
    this.phone_number = phone_number;
    this.is_male = is_male;
}
}
