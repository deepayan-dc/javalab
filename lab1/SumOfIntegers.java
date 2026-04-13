package lab1;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }

}
