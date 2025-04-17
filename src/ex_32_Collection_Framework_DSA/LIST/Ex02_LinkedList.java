package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;
import java.util.List;

public class Ex02_LinkedList {
    public static void main(String[] args) {

       LinkedList<String> animal = new LinkedList();

       animal.add("Dog");
       animal.add("Cat");
       animal.add("Lion");
       animal.add("Elephant");
       animal.add("Panda");

        System.out.println("Linked List : " +animal);

        // Accessing elements
        System.out.println("First element: " + animal.getFirst());
        System.out.println("Last element: " + animal.getLast());

        // Removing elements
        animal.removeFirst();
        animal.removeLast();
        System.out.println("LinkedList after removal: " + animal);

        System.out.println("Size of LinkedList: " + animal.size());


    }
}
