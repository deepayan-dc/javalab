package lab5;

public class MultilevelInheritance {
    static class Car {
        public void move() {
            System.out.println("The car is moving");
        }
    }
    static class Engine extends Car {
        public void fuel() {
            System.out.println("The engine is fueled up");
        }
    }
    static class Petrol extends Engine {
        public void isPetrol() {
            System.out.println("The engine is running on petrol");
        }
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Petrol p = new Petrol();
        p.move();
        p.fuel();
        p.isPetrol();
    }
}
