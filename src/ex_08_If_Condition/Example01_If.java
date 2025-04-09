package ex_08_If_Condition;

public class Example01_If {
    public static void main(String[] args) {
       /* int age = 19;
        if(age>18)
        {
            System.out.println("you are allow to vote");
        }
        */

        int age  = Integer.parseInt(args[0]);
        if (age>18)
        {
            System.out.println("you are eligible to vote");
        }
        else {
            System.out.println("you are not eligible");
        }

    }
}
