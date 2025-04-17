package ex_32_Collection_Framework_DSA.MAP;

import java.util.*;

public class REAL_EXAMPLE {
    public static void main(String[] args) {

        Map<String, Object> student1 = new HashMap();
        student1.put("name","A");
        student1.put("Age",22);
        student1.put("phoneno",123456789);
        student1.put("address","Street11");

        Map<String,Object> student2 = new HashMap();
        student2.put("name","B");
        student2.put("Age",20);
        student2.put("phoneno",1023456789);
        student2.put("address","Street11");

        List Student = new ArrayList();
        Student.add(student2);
        Student.add(student1);

        System.out.println(Student);

        Set book_read_items = new HashSet();
        book_read_items.add("Rich dad Poor Dad");
        book_read_items.add("Sapaiens");
        book_read_items.add("Secret");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the Frog");

        System.out.println(book_read_items);


    }
}
