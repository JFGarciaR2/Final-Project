package src;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Patients patient1 = new Patients();
        patient1.setPatientId(1);
        patient1.setPatientName("John");
        patient1.setPatientAddress("123 Main St");
        patient1.setPatientPhone("123-456-7890");
        patient1.setPatientEmail("");

        System.out.println("Patient ID: " + patient1.getPatientId());
        System.out.println("Patient Name: " + patient1.getPatientName());
    }
}
