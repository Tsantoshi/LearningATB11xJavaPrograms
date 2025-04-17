package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.Set;

public class HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element
        // no order.
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        // hs.add(123);
        hs.add(null);
//        hs.add(null);
        System.out.println(hs);
        System.out.println(" ---------------------------");

    }
}
