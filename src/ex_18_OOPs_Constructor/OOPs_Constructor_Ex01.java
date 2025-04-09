package ex_18_OOPs_Constructor;

public class OOPs_Constructor_Ex01 {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        Baby b2;

        b1.cry();
        b1.eat();
        b1.sleep();

    }


}

class Baby{
    // Attribute | Instance Variable |  Member variables, data members

    String name;

    // Behaviour
    void cry(){
        System.out.println("Cry!!");
    }

    void sleep(){
        System.out.println("Cry!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }

    // Default Constructor!

    public Baby(){
        System.out.println("I am called, Default Constructor!");
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)



    }

}
