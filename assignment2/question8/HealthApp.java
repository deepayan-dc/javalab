package assignment2.question8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HealthApp {
    private static List<Patient> database = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        java.util.function.Predicate<String> idValidator = new java.util.function.Predicate<String>() {
            @Override
            public boolean test(String id) {
                return id != null && id.startsWith("P");
            }
        };
        while (true) {
            System.out.println("1. Add Patient\n" +
                    "2. Enter Weekly Vitals\n" +
                    "3. Compute BMI & Risk\n" +
                    "4. Generate Report\n" +
                    "5. Search Patient\n" +
                    "6. Exit");
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter ID (must start with P): ");
                    String id = sc.nextLine();
                    if (!idValidator.test(id)) {
                        System.out.println("Invalid ID format!");
                        break;
                    }
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Weight (kg): ");
                    double w = Double.parseDouble(sc.nextLine());
                    System.out.print("Height (m): ");
                    double h = Double.parseDouble(sc.nextLine());

                    database.add(new Patient(id, name, age, w, h));
                    System.out.println("Patient recorded successfully.");
                    break;

                case 2:
                    System.out.print("Enter Patient ID: ");
                    String searchId = sc.nextLine();
                    Patient p = findPatient(searchId);
                    if (p != null) {
                        try {
                            System.out.println("Enter heart rates for 7 days:");
                            for (int i = 0; i < 7; i++) {
                                System.out.print("Day " + (i + 1) + ": ");
                                int rate = Integer.parseInt(sc.nextLine());
                                p.addVitals(i, rate);
                            }
                        } catch (InValidVitalException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID: ");
                    Patient pBmi = findPatient(sc.nextLine());
                    if (pBmi != null) {
                        System.out.printf("BMI: %.2f (%s)\n", pBmi.calculateBMI(), pBmi.getRiskLevel());
                    }
                    break;

                case 4:
                    StringBuffer report = new StringBuffer();
                    report.append("\nHEALTH SUMMARY REPORT\n");
                    for (Patient pt : database) {
                        report.append("Patient: ").append(pt.getName())
                                .append(" [ID: ").append(pt.getPatientId()).append("]\n")
                                .append("Status: ").append(pt.getRiskLevel()).append("\n");
                    }
                    System.out.println(report.toString());
                    break;

                case 5:
                    System.out.print("Search ID: ");
                    Patient pSearch = findPatient(sc.nextLine());
                    if (pSearch != null) {
                        System.out.println("Found: " + pSearch.getName() + ", Age: " + pSearch.age);
                    } else {
                        System.out.println("No record found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting System. Stay Healthy!");
                    return;
            }
        }
    }

    private static Patient findPatient(String id) {
        for (Patient p : database) {
            if (p.getPatientId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

}
