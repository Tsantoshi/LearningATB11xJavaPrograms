package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.*;

public class Ex1_QLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
