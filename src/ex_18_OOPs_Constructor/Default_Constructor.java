package ex_18_OOPs_Constructor;

public class Default_Constructor {
    public static void main(String[] args) {

        car c1 = new car();

        c1.name = "tesla";
        System.out.println(c1.model);
        System.out.println(c1.name);
        System.out.println(c1.year);

        System.out.println("..........");

        car c2 = new car();
        System.out.println(c2.year);
        System.out.println(c2.name);
        System.out.println(c2.model);


    }
}

class car{

    String name;
    int year;
    String model;

    car(){
        name ="unknown";
        year=1990;
        model = "xxx";
    }
}
