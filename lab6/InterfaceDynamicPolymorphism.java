package lab6;

interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound() {
        System.out.println("Woof woof!");
    }
}
class Cat implements Animal {
    public void sound() {
        System.out.println("Meow!");
    }
}
public class InterfaceDynamicPolymorphism {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Animal a;
        a  = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }
}
