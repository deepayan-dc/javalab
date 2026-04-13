package lab4;

class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double getVolume() {
        return width * height * depth;
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Box myBox = new Box(10, 20, 15);
        System.out.println("Volume of the box is: " + myBox.getVolume());
    }
}


