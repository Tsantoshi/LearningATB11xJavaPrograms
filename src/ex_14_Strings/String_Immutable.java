package ex_14_Strings;

public class String_Immutable {
    public static void main(String[] args) {
        String name = "test";
        name.toUpperCase(); // TEST
        System.out.println(name); // as it is immutable it wont convert to uppercase

        name = name.toUpperCase();
        System.out.println(name);
    }
}
