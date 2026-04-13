package lab3;

public class ReverseElements {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        if (args.length != 4) {
            System.out.println("Please enter exactly 4 numbers.");
            return;
        }
        System.out.println("The numbers in order are: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
        System.out.println("The numbers in reverse order are:");
        for (int i = 3; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
