package ex_27_Static;

public class Static_Real_Example {
    public static void main(String[] args) {

        System.out.println(ATB.courseName);
        System.out.println(ATB.mentorName);

        ATB amit = new ATB();
        amit.setName("amit");
        amit.setPhone("2312313");

        amit.howTheyAssignment();
        ATB.doAssignment();
        ATB.joinZoomForClass();

        ATB lucky = new ATB();
        lucky.setName("lucky");
        lucky.setPhone("988765456");


    }
}

class ATB{
    static {
        System.out.println("load the class i will execute");
    }
    {
        System.out.println("IIB-this is called when object is created");
    }

    public String getName(){
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    private String name; // non static
    private String phone;
    static String courseName = "ATB11x";
    static String mentorName = "Pramod";

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }


    void howTheyAssignment(){
        System.out.println("It is different!");
    }

}
