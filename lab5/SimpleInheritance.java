package lab5;

public class SimpleInheritance {
    static class Animal {
        public void eat() {
            System.out.println("The animal is having food");
        }
    }
    static class Dog extends Animal {
        public void bark() {
            System.out.println("The dog is barking");
        }
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
