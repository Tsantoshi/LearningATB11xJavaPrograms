package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Ex_02_ArrayList {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add("Santoshi");
        arr.add("Thakur");
        arr.add(null);
        arr.add("Thakur");  // aloows duplicate
        arr.add(123); // Different data type is allowed.

        System.out.println(arr);
        System.out.println(arr.size());

        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
