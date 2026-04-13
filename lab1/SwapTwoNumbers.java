package lab1;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        int a = 10;
        int b = 25;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap:  a = " + a + ", b = " + b);
    }
}
