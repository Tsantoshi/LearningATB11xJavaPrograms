package Tasks;

public class Mathematical_Task {
    public static void main(String[] args) {
        // Initialize values
        double x = 10;
        double y = 10;
        double z = 10;

        // Calculate the expression: cube root of (x^2 + y^2 - |z|)
        double xSquared = Math.pow(x, 2);
        double ySquared = Math.pow(y, 2);
        double absZ = Math.abs(z);

        double expression = xSquared + ySquared - absZ;
        double result = Math.cbrt(expression);

        // Print the results of each calculation step
        System.out.println("x² = " + xSquared);
        System.out.println("y² = " + ySquared);
        System.out.println("|z| = " + absZ);
        System.out.println("x² + y² - |z| = " + expression);
        System.out.println("∛(x² + y² - |z|) = " + result);
    }
}
