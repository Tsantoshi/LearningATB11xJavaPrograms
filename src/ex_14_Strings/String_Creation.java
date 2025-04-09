package ex_14_Strings;

public class String_Creation {
    public static void main(String[] args) {

        String s1 = "Santoshi"; //SCP

        String s2  = new String("santoshi"); //OA -> Object Area

        System.out.println(s1);
        System.out.println(s2);

        s1 = s1.concat("Thakur");
        System.out.println(s1);
    }
}
