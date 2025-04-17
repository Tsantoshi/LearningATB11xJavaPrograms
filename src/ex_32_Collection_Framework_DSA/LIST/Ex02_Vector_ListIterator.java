package ex_32_Collection_Framework_DSA.LIST;

import java.util.ListIterator;
import java.util.Vector;

public class Ex02_Vector_ListIterator {
    public static void main(String[] args) {

        Vector <String> v = new Vector<>();
        v.add("Item1");
        v.add("Item2");
        v.add("Item3");
        v.add("Item4");
        v.add("Item5");

        ListIterator listIterator = v.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("......");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }





    }
}
