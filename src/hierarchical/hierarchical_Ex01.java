package hierarchical;

public class hierarchical_Ex01 {
    public static void main(String[] args) {

        Father1 f1 = new Father1();
        Ruhani r1 = new Ruhani();
        r1.house();
        f1.house();

        System.out.println("......");

        Pramod p1 = new Pramod();
        p1.house();

        Lucky l1 = new Lucky();
        l1.L1();
        l1.house();





    }
}

 class Father1{
    void house(){
        System.out.println("home...");
    }

}

class Pramod extends Father1{
    void P1(){
        System.out.println("P1 - pramod");
    }
}

class Lucky extends Father1{
    void L1(){
        System.out.println("Lucky");
    }

}

class Ruhani extends Father1 {
    void r1() {
        System.out.println("ruhani");
    }
}

