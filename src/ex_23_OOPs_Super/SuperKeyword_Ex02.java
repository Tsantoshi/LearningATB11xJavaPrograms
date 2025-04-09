package ex_23_OOPs_Super;

public class SuperKeyword_Ex02 {
    public static void main(String[] args) {

        Dog dg = new Dog();
        dg.display();
    }
}
class God {
    void sound(){
        System.out.println("God!");
    }
}

class Animal extends God{
    protected String color = "white";

    void sound(){
        System.out.println("Animal sound!");
        super.sound();
    }
}

class Dog extends Animal{
    private String color = "black";

    Dog(){
        //super();
    }

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}
