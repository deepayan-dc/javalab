package lab2;

public class TwoCharacterVariable {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        char char1 = 'z';
        char char2 = 'b';
        System.out.println("Original order: " + char1 + ", " + char2);
        System.out.print("Alphabetical order: ");
        if (char1 < char2) {
            System.out.println(char1 + ", " + char2);
        } else {
            System.out.println(char2 + ", " + char1);
        }
    }
}
