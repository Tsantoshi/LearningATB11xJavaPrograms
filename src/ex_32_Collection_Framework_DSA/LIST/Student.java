package ex_32_Collection_Framework_DSA.LIST;

public class Student {

    private String Name;
    private String rollno;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public Student(String Name, String rollno) {
        this.Name = Name;
        this.rollno = rollno;
    }

    public void printDetails(){
        System.out.println("Student Name: "+this.Name);
        System.out.println("Student Rollno: "+this.rollno);
    }

    public String toString(){
        return "Student{" +
                "name='" + Name + '\'' +
                ", rollNo='" + rollno + '\'' +
                '}';
    }

    }

