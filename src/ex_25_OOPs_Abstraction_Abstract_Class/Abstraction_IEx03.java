package ex_25_OOPs_Abstraction_Abstract_Class;

public class Abstraction_IEx03 {
    public static void main(String[] args) {

        ConcreateClass cc1 = new ConcreateClass();
        cc1.display();

    }
}

abstract class Incomplete_abstract{
    int a = 10;
    abstract void display1();
      void display2(){

    }

}

class ConcreateClass implements Incomplete_interface{

    @Override
    public void display() {
        System.out.println("Hi");
    }
}

interface Incomplete_interface{
    int a = 10; // final
    void display();

    default void display2(){
        System.out.println("Default is allowed!");
    }

    static void display3(){
        System.out.println("Default is allowed!");
    }
}


