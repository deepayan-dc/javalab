package lab3;

public class ArrayASCII {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        int[] asciiValues = {67, 89, 76, 100, 94, 108, 73};

        for (int i = 0; i < asciiValues.length; i++) {
            System.out.print((char)asciiValues[i] + " ");
        }
    }
}
