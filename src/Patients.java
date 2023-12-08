//Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Patients extends Person {

    // Attributes specific to Patients class
    private String patientBloodGroup = "";
    private String patientDisease = "";
    private int patientWeight = 0;
    private int patientHeight = 0;

     // Create a methods Setters and Getters
    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }
    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }
    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientWeight(int patientWeight) {
        this.patientWeight = patientWeight;
    }
    public int getPatientWeight() {
        return patientWeight;
    }

    public void setPatientHeight(int patientHeight) {
        this.patientHeight = patientHeight;
    }
    public int getPatientHeight() {
        return patientHeight;
    }

    // List to store instances of patients
    private List<Patients> patientsList = new ArrayList<>();

    // Constructor to initialize a patient with data
    public Patients(int personId, String personName, String personPhone, String personEmail, String personGender, String personAddress, String personOccupation, int age, String patientBloodGroup, String patientDisease, int patientWeight, int patientHeight) {
        super(personId, personName, personPhone, personEmail, personGender, personAddress, personOccupation, age);
        setPatientBloodGroup(patientBloodGroup);
        setPatientDisease(patientDisease);
        setPatientWeight(patientWeight);
        setPatientHeight(patientHeight);

        // Add the patient to the list when an instance is created
        patientsList.add(this);
    }

    // Create a method to modify a patient's attributes
    public void modifyPatientByName(String name, String newBloodGroup, String newDisease, int newWeight, int newHeight) {
        for (Patients patient : patientsList) {
            if (patient.getPersonName().equalsIgnoreCase(name)) {
                // Modify the patient's attributes
                patient.setPatientBloodGroup(newBloodGroup);
                patient.setPatientDisease(newDisease);
                patient.setPatientWeight(newWeight);
                patient.setPatientHeight(newHeight);
                System.out.println("Patient details modified for: " + name);
                return;
            }
        }
        System.out.println("Not found a patient with name: " + name);
    }

    // Method to remove a patient by name
    public boolean removePatientByName(String name) {
        Iterator<Patients> iterator = patientsList.iterator();
        while (iterator.hasNext()) {
            Patients patient = iterator.next();
            if (patient.getPersonName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Patient deleted: " + name);
                return true; // Successful deletion
            }
        }
        System.out.println("Not found a patient with name: " + name);
        return false; // Deletion unsuccessful
    }

    // Get the list of patients
    public List<Patients> getPatientsList() {
        return patientsList;
    }
}
