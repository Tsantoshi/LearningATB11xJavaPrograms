package ex_13_Functions;

import java.util.Scanner;

public class Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int a=0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }else
        {
            System.out.println("enter int only");
            System.exit(0);
        }

        System.out.println("enter num2");
        int b=0;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }else
        {
            System.out.println("enter int only");
            System.exit(0);
        }

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);


        System.out.println("sum is " + result_sum);
        System.out.println("sub is " +result_sub);
        System.out.println("mul is "+result_mul);
        System.out.println("div is "+result_div);
    }


    static int sum(int a, int b){
        return a+b;

    }

    static  int sub(int a, int b){
        return a-b;
    }

    static int mul(int a, int b){
        return a*b;
    }

    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
