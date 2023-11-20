import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Patients extends Person {
    // Attributes specific to Patients class
    private String patientBloodGroup = "";
    private String patientDisease = "";

    private int patientWeight = 0;

    //Create a method to set the patient's weight
    public void setPatientWeight(int patientWeight) {
        this.patientWeight = patientWeight;
    }
    //Create a method to get the patient's weight
    public int getPatientWeight() {
        return patientWeight;
    }

    //Create a method to set the patient's blood group
    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }
    //Create a method to get the patient's blood group
    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    //Create a method to set the patient's disease
    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }
    //Create a method to get the patient's disease
    public String getPatientDisease() {
        return patientDisease;
    }


    // List to store instances of patients
    private static List<Patients> patientsList = new ArrayList<>();

    // Constructor to initialize a patient with data
    public Patients(int personId, String patientName, String patientPhone, String patientEmail, String patientGender,
                    String patientAddress, String patientOccupation, int patientAge, int patientWeight, int patientHeight, int personWeight, String patientBloodGroup, String patientDisease) {
        setPersonId(personId);
        setPersonName(patientName);
        setPersonPhone(patientPhone);
        setPersonEmail(patientEmail);
        setPersonGender(patientGender);
        setPersonAddress(patientAddress);
        setPersonOccupation(patientOccupation);
        setPersonAge(patientAge);
        setPersonWidth(patientWeight);
        setPersonHeight(patientHeight);
        this.patientWeight = patientWeight;
        this.patientBloodGroup = patientBloodGroup;
        this.patientDisease = patientDisease;

        // Add the patient to the list when an instance is created
        patientsList.add(this);
    }

    // Get the list of patients
    public static List<Patients> getPatientsList() {
        return patientsList;
    }

    public static void removePatientByName(String name) {
        Iterator<Patients> iterator = patientsList.iterator();
        while (iterator.hasNext()) {
            Patients patient = iterator.next();
            if (patient.getPersonName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Delete Patient: " + name);
                return;
            }
        }
        System.out.println("Not found a patient with name : " + name);
    }

}
