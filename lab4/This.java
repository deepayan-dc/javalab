package lab4;

public class This {
    int value;
    void setValue(int value) {
        this.value = value;
    }
    void display() {
        System.out.println("Value is " + this.value);
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        This demo = new This();
        demo.setValue(100);
        demo.display();
    }
}
