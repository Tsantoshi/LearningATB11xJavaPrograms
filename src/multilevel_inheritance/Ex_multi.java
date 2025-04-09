package multilevel_inheritance;

public class Ex_multi {
    public static void main(String[] args) {

        Ex01_GrandFather gf = new Ex01_GrandFather();
        gf.gf();
        gf.Home();

        System.out.println("...........");

        Father f1 = new Father();
        f1.f();
        f1.Home();
        f1.gf();

        System.out.println("......");

        Son s1 = new Son();
        s1.s();
        s1.Home();
        s1.f();
        s1.gf();
    }
}
