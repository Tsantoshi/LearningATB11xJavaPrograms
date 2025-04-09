package ex_25_OOPs_Abstraction_Abstract_Class;

public class Interface_Ex01 {
    public static void main(String[] args) {

        Square s1 = new Square();
        s1.getArea(10,10);

        Rectangle r1 = new Rectangle();
        r1.getArea(3,5);
    }



}

interface Polygon{
    void getArea(int length, int width);

}

class Square implements Polygon{

    @Override
    public void getArea(int length, int width) {
        System.out.println("Area od Square -> "+3.14*length*width);
    }
}

class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int width) {
        System.out.println("The area of the rectangle is " + (length * width));
    }
}
