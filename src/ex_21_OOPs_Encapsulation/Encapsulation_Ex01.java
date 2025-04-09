package ex_21_OOPs_Encapsulation;

public class Encapsulation_Ex01 {
    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank("amit",10000);
        System.out.println(amit.getName());

        long bal = amit.getBal();
        System.out.println(bal);

        amit.setBal(500);

//        amit.setBal(500, false);



        long bal_updated = amit.getBal();
        System.out.println(bal_updated);


    }
}

class ICICIBank{

    private  String name;
    private long bal;


    public ICICIBank(String name, long bal){
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }

}
