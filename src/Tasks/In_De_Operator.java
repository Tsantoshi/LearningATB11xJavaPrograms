package Tasks;

public class In_De_Operator {
    public static void main(String[] args) {

        int a=10;
        System.out.println(a);
        System.out.println(++a + a++ + a++);
        // 11 (from ++a) + 11 (from first a++) + 12 (from second a++) = 34
        System.out.println(a);
    }
}
