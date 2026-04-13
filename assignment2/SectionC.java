package assignment2;

public class SectionC {
    public static class Person {
        String name;
        int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static class Patient extends Person {
        String patientID;
        double height;
        double weight;
        Patient (String id, String name, int age, double height, double weight) {
            super(name, age);
            this.patientID = id;
            this.height = height;
            this.weight = weight;
        }
        @Override
        void displayInfo() {
            System.out.println("ID: " + patientID);
            super.displayInfo();
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
        }
    }

    public static void main(String[] args) {
        Patient p = new Patient("P001", "John Doe", 25, 78.9, 1.78);
        p.displayInfo();
    }
}
