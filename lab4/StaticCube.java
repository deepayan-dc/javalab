package lab4;

public class StaticCube {
    public static int getCube(int n) {
        return n * n * n;
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        int number = 5;
        int result = StaticCube.getCube(number);
        System.out.println("The cube of " + number + " is " + result);
    }
}
