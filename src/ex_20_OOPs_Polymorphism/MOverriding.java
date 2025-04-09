package ex_20_OOPs_Polymorphism;

public class MOverriding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();

        Animal a1 = new Animal();
        a1.sound();

        Animal a2 = new Dog();
        a2.sound();
    }

}
class Animal{
    void sound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark!");
    }
}