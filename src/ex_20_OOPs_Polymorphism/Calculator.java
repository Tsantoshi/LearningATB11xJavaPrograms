package ex_20_OOPs_Polymorphism;

public class Calculator {
    int attribute;

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
       int result =  c1.add(3, 4);
       double result1 = c1.add(3.414, 4.56);
        System.out.println(result1);
        System.out.println(result);

    }
}

