package multilevel_inheritance;

public class Ex02_multi {
    public static void main(String[] args) {

        //Son s1 = new Ex01_GrandFather();
        //Son s1 = new Father();

        Son amit = new Son();

        Ex01_GrandFather g1 = new Son(); //Dynamic Dispatch
        g1.gf();
        g1.Home();

        System.out.println("......");

        Ex01_GrandFather g2 = new Father();
        g2.gf();
        g2.Home();

        System.out.println("........");

        Father f2 = new Son();
        f2.f();
        f2.gf();
        f2.Home();





    }
}
