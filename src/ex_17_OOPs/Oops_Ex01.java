package ex_17_OOPs;

public class Oops_Ex01 {
    public static void main(String[] args) {

        person p2 = new person();
        p2.name="amit";
        p2.age=24;
        p2.salary = 400000;
        p2.isMale=true;
        p2.phone_number="123456789";

        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.salary);
        System.out.println(p2.isMale);
        System.out.println(p2.phone_number);


    }
}
class person{
    String name;
    int age;
    double salary;
    boolean isMale;
    String phone_number;
}