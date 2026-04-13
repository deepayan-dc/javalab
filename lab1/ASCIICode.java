package lab1;

import java.util.Scanner;

public class ASCIICode {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int asciiValue = (int) character;
        System.out.println("The ASCII code of '" + character + "' is " + asciiValue);
    }
}
