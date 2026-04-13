package assignment2;

import java.util.StringTokenizer;
import assignment2.SectionC.Patient;

public class Tokenizer {
    public static void main(String[] args) {
        String patientRecord = "P101, Anita, 22, 58, 1.62";
        StringTokenizer st = new StringTokenizer(patientRecord, ", ");

        String id = st.nextToken().trim();
        String name = st.nextToken().trim();
        int age  = Integer.parseInt(st.nextToken().trim());
        double weight = Double.parseDouble(st.nextToken().trim());
        double height = Double.parseDouble(st.nextToken().trim());

        Patient patient = new SectionC.Patient(id,name,age,weight,height);
        patient.displayInfo();
    }
}
