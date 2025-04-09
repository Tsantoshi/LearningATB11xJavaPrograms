package ex_06_Ternary_Operator;

public class Exp001 {
    public static void main(String[] args) {

        // ? :
        int age  = 10;
        String canIVote = 10>=18 ? "Yes, U can Vote" : "No U can't Vote";
        System.out.println(canIVote);

        // result = condition ? expression1 : expression2;

        int  number = 5;
        String result = number > 0 ? "Positive" : "Negative";
        System.out.println(result);
    }
}
