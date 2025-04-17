package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.*;

public class AL_InterviewQ {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(91);
        marks.add(42);
        marks.add(88);
        marks.add(66);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);

    }
}
