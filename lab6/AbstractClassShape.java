package lab6;

abstract class Shape {
    abstract void calculateArea();
}
class Rectangle extends Shape {
    int len = 4, wid = 5;
    void calculateArea() {
        System.out.println("Area of rectangle is " + len * wid);
    }
}
class Triangle extends Shape {
    int base = 6, height = 7;
    void calculateArea() {
        System.out.println("Area of triangle is " + 0.5*base*height);
    }
}
public class AbstractClassShape {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        rec.calculateArea();
        tri.calculateArea();
    }
}
