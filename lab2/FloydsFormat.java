package lab2;

public class FloydsFormat {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
}
