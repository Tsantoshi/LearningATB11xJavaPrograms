package ex_32_Collection_Framework_DSA.LIST;
import java.util.*;
public class AL_Students {
    public static void main(String[] args) {

        Student s1 = new Student("Amit", "1");
        Student s2 = new Student("Ritwik","2");
        Student s3 = new Student("Shubham","3");

        List <Student> myStudent = new ArrayList<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        System.out.println(myStudent);

        s1.printDetails();
        s2.printDetails();
        s3.printDetails();



    }
}
