package ex_29_Wrapper_Class;

public class Wrapper_Example {
    public static void main(String[] args) {

        Mobile iphone = new Mobile(1,"iphone 16",120000.00);
        Mobile samsung  = new Mobile(2,"ultra 24",1350000.00);

        iphone.setPrice(200000.80);
        iphone.display();
        samsung.display();

        iphone.calling();

        System.out.println(Mobile.mobile_carrier);
       Mobile.switchOnAirplaneMode();



    }
}

class oldPhone implements SIMCard{

    void calling(){
        System.out.println("dail pad");

    }

    @Override
    public void enterCard() {
        System.out.println("card entered");
    }
}

interface SIMCard{
    void enterCard();
}

class Mobile extends oldPhone{
    private String name;
    private Integer phone;
    private double price;
    static String mobile_carrier = "airtel";


    public Mobile() {
        System.out.println("DC");
    }

    public Mobile(Integer phone, String name, Double price){
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(this.phone+this.name+this.price);
    }

    public Integer getPhone(){
        return phone;
    }

    public void setPhone(Integer phone){
        this.phone = phone;
    }

    public String getName(){
        return name;

    }

    public void setName(String name){
        this.name = name;

    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double  price){
        this.price = price;
    }

    void priceChange(Integer price){
        System.out.println("Change price in integer");
    }

    void priceChange(Double price){
        System.out.println("Change price in decimal");
    }
    static void switchOnAirplaneMode(){
        System.out.println("Common Airplane Mode");
    }


    void calling(){
        System.out.println("dail pad --> touch now");
    }
}
