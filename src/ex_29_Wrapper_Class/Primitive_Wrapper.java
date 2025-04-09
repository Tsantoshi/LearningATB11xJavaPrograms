package ex_29_Wrapper_Class;

public class Primitive_Wrapper {
    public static void main(String[] args) {

        int a = 10; // this is primitive data type
        // This is not Object
        // It will not have attribute or Behaviour

        // char, short, byte, long, float, double, - we will avoid them now

        Integer age = 65;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(age);
        System.out.println(age.intValue());
    }
}

class ATB{
    String name;
    Integer id;
    Long phone;
    Double salary;
    Float gst;
    Boolean isMarried;

    // int -> data types
    // Integer -> Object -> attribute, behaviour


}
