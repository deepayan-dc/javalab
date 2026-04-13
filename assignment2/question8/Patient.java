package assignment2.question8;

class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Patient extends Person implements HealthCheckable {
    private String patientId;
    private double weight;
    private double height;
    private Integer[] weeklyVitals = new Integer[7]; // Using Wrapper class Integer

    public Patient(String id, String name, int age, double w, double h) {
        super(name, age);
        this.patientId = id;
        this.weight = w;
        this.height = h;
    }

    public void addVitals(int day, int rate) throws InValidVitalException {
        if (rate < 30 || rate > 250) {
            throw new InValidVitalException("Alert: Heart rate " + rate + " is medically unrealistic!");
        }
        weeklyVitals[day] = rate;
    }

    @Override
    public double calculateBMI() {
        return weight / (height * height);
    }

    @Override
    public String getRiskLevel() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public Integer[] getVitals() {
        return weeklyVitals;
    }
}
