package ex_19_OOps_Inheritance;

public class Inheritance_Ex {
    public static void main(String[] args) {

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        System.out.println(".........");

        Son s1  = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();
    }
}

class Father{
    int gold_f = 10000; // Attribute | Data variables |  Property | Instance Variables

    void bhk2(){ //  Behaviour |  Method | Function | Data members
        System.out.println("Father - 2bhk");
    }
}

class Son extends Father{

    void bhk3(){
        System.out.println("Son - 2bhk");
    }
}
