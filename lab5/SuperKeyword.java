package lab5;

public class SuperKeyword {
    static class Parent {
        int num = 5;
        Parent() {
            System.out.println("This is parent class constructor");
        }
        public void message(){
            System.out.println("Hello world");
        }
    }
    static class Child extends Parent {
        int x = 6;
        Child() {
            super();
        }
        public void display() {
            System.out.println("Child class number: " + x);
            System.out.println("Parent class number: " + super.num);
        }
        public void message() {
            System.out.println("Child class message: Hello Deepayan");
            System.out.print("Parent class message: ");
            super.message();
        }
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Child c = new Child();
        c.display();
        c.message();
    }
}
