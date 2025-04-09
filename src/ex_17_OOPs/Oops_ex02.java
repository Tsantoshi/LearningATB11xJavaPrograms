package ex_17_OOPs;

public class Oops_ex02 {
    public static void main(String[] args) {

        Student s1 = new Student();
        //1. Student - Class Loading
        //2. s1 - Object Ref.
        //3. new Student() -> Object creation

        s1.name="Rahul";
        s1.roll_number =001;

        System.out.println(s1.name);
        System.out.println(s1.roll_number);

    }


}

class Student{
    String name;
    int roll_number;

    void study(){}
}
