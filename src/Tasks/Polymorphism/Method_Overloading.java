package Tasks.Polymorphism;

public class Method_Overloading {
    public static void main(String[] args) {
         Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 10 (integers): " + calc.add(5, 10));
        System.out.println("Sum of 5, 10, and 15 (integers): " + calc.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5 (doubles): " + calc.add(5.5, 10.5));

    }
}

class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

}
