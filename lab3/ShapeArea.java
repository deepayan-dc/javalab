package lab3;

public class ShapeArea {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(float base, float height) {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        ShapeArea sa = new ShapeArea();
        System.out.println("Circle Area: " + sa.calculateArea(5.0));
        System.out.println("Rectangle Area: " + sa.calculateArea(10.0, 5.0));
        System.out.println("Triangle Area: " + sa.calculateArea(4.0f, 3.0f));
    }
}
