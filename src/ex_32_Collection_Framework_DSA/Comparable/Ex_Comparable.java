package ex_32_Collection_Framework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex_Comparable {
    public static void main(String[] args) {

        Student s1 = new Student(101,"Vijay",23);
        Student s2 = new Student(108,"Jay",28);
        Student s3  =new Student(106,"ajay",21);

        List<Student> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);
        System.out.println(studentList);
    }
}

class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }



    //@Override
  //  public int compareTo(Student o) {
  //      return this.name.compareTo(o.name);
   // }

    @Override
    public int compareTo(Student o) {
        return this.rollNo-o.rollNo;
   }


}
