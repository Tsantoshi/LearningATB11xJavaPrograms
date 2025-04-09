package multilevel_inheritance;

public class Ex03_multi {
    public static void main(String[] args) {

        //Son s1 = new Ex01_GrandFather();
      // Son s1 = new Father();

        Son amit = new Son();
        amit.gf();
        amit.s();
        amit.f();
        amit.Home();
        System.out.println(amit.gold_f);

        System.out.println("........");

        Father f1 = new Father();
        f1.Home();

        System.out.println("........");

        Ex01_GrandFather gf1 = new Ex01_GrandFather();
        gf1.Home();

        System.out.println("........");

        Ex01_GrandFather grandFather = new Son();
        grandFather.Home();
        grandFather.gf();



    }
}
