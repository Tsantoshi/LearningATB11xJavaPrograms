package ex_09_Switch;

public class JDK13Above {
    public static void main(String[] args) {
        int itemCode = 001;

        /*switch (itemCode){
            case 001 -> System.out.println(001);
            case 002 -> System.out.println(002);
            case 003 -> System.out.println(003);
            default -> System.out.println("default");
        }


         */
        switch (itemCode) {
            case 001, 002, 005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
