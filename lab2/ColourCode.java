package lab2;

import java.util.Scanner;

public class ColourCode {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color code (V, I, B, G, Y, O, R): ");
        char code = sc.next().toUpperCase().charAt(0);
        switch (code) {
            case 'V':
                System.out.println("V - Violet");
                break;
            case 'I':
                System.out.println("I - Indigo");
                break;
            case 'B':
                System.out.println("B - Blue");
                break;
            case 'G':
                System.out.println("G - Green");
                break;
            case 'Y':
                System.out.println("Y - Yellow");
                break;
            case 'O':
                System.out.println("O - Orange");
                break;
            case 'R':
                System.out.println("R - Red");
                break;
            default:
                System.out.println("Invalid input! Please enter a valid VIBGYOR code.");
        }
    }
}
