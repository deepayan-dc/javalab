package lab7;

class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}

public class AgeException {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        try {
            if (args.length < 2) {
                throw new Exception("Provide your name and age as arguments");
            }
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 15 || age >= 60) {
                throw new InvalidAge("Age must be greater than/equal to 15 and less than 60");
            }
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (InvalidAge e){
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
