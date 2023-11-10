import javax.swing.*;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Patients patient1 = new Patients();
        patient1.setPatientId(1);
        patient1.setPatientName("John");
        patient1.setPatientAddress("123 Main St");
        patient1.setPatientPhone("123-456-7890");
        patient1.setPatientEmail("jhon@email.com");
        patient1.setPatientAge(30);
        patient1.setPatientBloodGroup("A+");
        patient1.setPatientDisease("Cancer");
        patient1.setPatientWidth(80);
        patient1.setPatientHeight(180);

        //Create a function that show all the patient's information
        //...

        List<Patients> patientInfo[] ;


        System.out.println("Patient ID: " + patient1.getPatientId());
        System.out.println("Patient Name: " + patient1.getPatientName());
        System.out.println("Patient Address: " + patient1.getPatientAddress());
        System.out.println("Patient Phone: " + patient1.getPatientPhone());
        System.out.println("Patient Email: " + patient1.getPatientEmail());
        System.out.println("Patient Age: " + patient1.getPatientAge());
        System.out.println("Patient Blood Group: " + patient1.getPatientBloodGroup());
        System.out.println("Patient Disease: " + patient1.getPatientDisease());
        System.out.println("Patient Width: " + patient1.getPatientWidth());
        System.out.println("Patient Height: " + patient1.getPatientHeight());

    }
}
