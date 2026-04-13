package lab3;

public class Tokens {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        String s = "Java is fun";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                System.out.println(word);
                word = "";
            } else {
                word += c;
            }
        }
        System.out.println(word);
    }
}
