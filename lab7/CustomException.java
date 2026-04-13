package lab7;

import java.util.Scanner;

class Custom extends Exception {
    public Custom(String message) {
        super(message);
    }
}

public class CustomException {
    public static void checkStatus(int status) throws Custom {
        if (status == 0) {
            throw new Custom("System Failure!");
        }
        System.out.println("Status OK");
    }
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Scanner input = new Scanner(System.in);
        int status = input.nextInt();
        try {
            checkStatus(status);
        } catch (Custom e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Task Completed");
        }
    }
}
