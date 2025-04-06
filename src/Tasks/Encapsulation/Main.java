package Tasks.Encapsulation;

public class Main {
    public static void main(String[] args) {
        ATB1[] students = new ATB1[3];

        students[0] = new ATB1("Santoshi", 101);
        students[1] = new ATB1("Rahul", 102);
        students[2] = new ATB1("Raj",103);

        for (ATB1 student: students){
            System.out.println(student);
        }

    }
}
