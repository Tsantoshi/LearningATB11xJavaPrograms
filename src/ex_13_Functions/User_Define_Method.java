package ex_13_Functions;

public class User_Define_Method {
    public static void main(String[] args) {

        int num1=sum_of_two_number(2,3);
        System.out.println(num1);

        int num2 = sum_of_two_number(5,6);
        System.out.println(num2);

    }

    static int sum_of_two_number(int a,int b){
        return a+b;
    }
}
