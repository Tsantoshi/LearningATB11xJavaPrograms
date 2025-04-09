package ex_22_OOPs_accessModifer.police;

public class Cop {

    private int gun;
    String iCard;

    public Cop(int bullet){
        this.gun = bullet;
    }

    protected void canIShot(){
        System.out.println("Yes, u can shoot!");
    }
}
