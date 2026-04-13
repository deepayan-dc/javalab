package lab5;

public class MethodOverriding {
    static class Shape {
        public void draw() {
            System.out.println("Drawing a shape");
        }
    }
    static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Circle c = new Circle();
        c.draw();
    }
}
