package ex_18_OOPs_Constructor;

public class Parametrizes_Constructor {
    public static void main(String[] args) {

        Car2 c2 = new Car2();
        System.out.println(c2.name);
        System.out.println(c2.model);
        System.out.println(c2.year);

        Car2 c1 = new Car2();
        System.out.println(c1.name);

        System.out.println("..........");

        Car2 c3 = new Car2("model3", 1990, "Tesla");
        System.out.println(c3.name);;
        System.out.println(c3.year);

        System.out.println("............");

        Car2 c4 = new Car2("Mahindra", 2021, "Scorpio");
        System.out.println(c4.name);

        System.out.println("..........");

        Car2 c5 = new Car2("Curv", 2020,"TATA");
        System.out.println(c5.name);
        System.out.println(c5.model);
    }
}

class Car2{

    String name;
    int year;
    String model;

    Car2(){

        name = "xxx";
        year = 1990;
        model = "unknown";

        System.out.println("DC");

    }

    Car2(String model_org, int year_org, String name_org)
    {
        this.model = model_org;
        this.year = year_org;
        this.name = name_org;
    }
}
