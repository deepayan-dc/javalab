package lab10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
            System.out.println("File written");
        } catch (IOException e) {
            System.out.println("Error reading file " + e.getMessage());
        }
    }
}
