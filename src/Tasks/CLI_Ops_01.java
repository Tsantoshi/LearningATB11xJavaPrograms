package Tasks;

public class CLI_Ops_01 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int max = (num1 > num2) ? num1 : num2;


        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);
    }
}
