package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class List_Ex01 {

    public static void main(String[] args) {

        List l = new ArrayList(); // Dynamic Diapatch
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("xyz abc");

        System.out.println(l);

        List fruits = List.of("Apple", "Orange", "Mango", "banana", "Watermelon");
        System.out.println(fruits);
        fruits.add("chiku"); // java.lang.UnsupportedOperationException
        //fruits.remove("apple"); // Not possible

    }
}
