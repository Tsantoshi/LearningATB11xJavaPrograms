package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex_NestedArrayList {
    public static void main(String[] args) {

        List<String> fruits1 = new ArrayList();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Chiku");
        fruits1.add("Berry");
        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println(fruits2);

        List vegetables = new ArrayList();
        vegetables.add("Tamato");
        vegetables.add("onion");
        vegetables.add("potato");
        System.out.println(vegetables);

        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegetables);
        System.out.println(all_fruits);

        System.out.println(all_fruits.get(2));


    }
}
