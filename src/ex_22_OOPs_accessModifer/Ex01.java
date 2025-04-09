package ex_22_OOPs_accessModifer;

public class Ex01 {
    public static void main(String[] args) {

        Son s1  = new Son();
        s1.getGold();
    }

}
class Father{
    private  int gold = 100;
    protected int bhk3 = 10;
    int car=1;
}
class Son extends Father{

    void getGold(){
       //System.out.println(gold); // not accessable as it is private
        System.out.println(bhk3);

    }
}
