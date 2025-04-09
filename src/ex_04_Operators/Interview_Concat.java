package ex_04_Operators;

public class Interview_Concat {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        System.out.println(a+b);   //math

        String name1 = "santoshi";
        String name2 = "thakur";
        System.out.println(name1+name2);

        System.out.println(name1+name2+a+b);
        System.out.println(a+b+name1+name2);
        System.out.println(name1+name2+(a+b));

        // // Interview Q2:
        System.out.println(!(10>20));

        // Interview Q3:

        int balaji_salary = 12;
        boolean result = !(balaji_salary>10 || balaji_salary<5);
        System.out.println(result);
    }
}
