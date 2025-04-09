package ex_15_StringBuffer_Builder_StringFunctions;

public class String_Functions {
    public static void main(String[] args) {

        String name = "Santoshi";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(12)); // StringIndexOutOfBoundsException

        // concat:

        System.out.println(name.concat("Thakur"));

        // // 3. contains()

        System.out.println(name.contains("shi"));

        // 4. equals()

        System.out.println(name.equals("Santoshi"));

        // 5. equalsIgnoreCase()

        System.out.println(name.equalsIgnoreCase("santoshi"));

        // 6. indexOf()

        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        System.out.println(s1.indexOf("m"));

        //8. replace( , )
        System.out.println(s1.replace("m","M"));

        // 9. split()

        String name2 = "SantoshiThakur@123";
        String[] split = name2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        //System.out.println(split[2]);

        //10. substring( , )

        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "    Sonal Harish     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Sonal"));

        StringBuilder stringBuilder = new StringBuilder("sonal");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

        String s111 = "hello";
        String s222 = "world";
        String s333 = "Java";

        System.out.println(s111+s222+s333);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));


    }
}
