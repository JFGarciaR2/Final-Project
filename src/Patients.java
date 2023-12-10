//Author: Juan Fernando Garcia Restrepo

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Patients extends Person {

    // Attributes specific to Patients class
    private String patientBloodGroup = "";
    private String patientDisease = "";
    private int patientWeight = 0;
    private int patientHeight = 0;
    Scanner scanner = new Scanner(System.in);

    // Create a methods Setters and Getters
    public  void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }
    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public  void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }
    public String getPatientDisease() {
        return patientDisease;
    }

    public  void setPatientWeight(int patientWeight) {
        this.patientWeight = patientWeight;
    }
    public int getPatientWeight() {
        return patientWeight;
    }

    public  void setPatientHeight(int patientHeight) {
        this.patientHeight = patientHeight;
    }
    public int getPatientHeight() {
        return patientHeight;
    }

    // Constructor to initialize a patient with data
    public Patients(int personId, String personName, String personPhone, String personEmail, String personGender, String personAddress, int age, String patientBloodGroup, String patientDisease, int patientWeight, int patientHeight) {
        super(personId, personName, personPhone, personEmail, personGender, personAddress, age);
        setPatientBloodGroup(patientBloodGroup);
        setPatientDisease(patientDisease);
        setPatientWeight(patientWeight);
        setPatientHeight(patientHeight);
    }

    // List to store instances of patients
    public static ArrayList<Patients> patientsList(Scanner sc){
        ArrayList<Patients> pList = new ArrayList<>();
        Patients patient = new Patients(0, "", "", "", "", "", 0, "", "", 0, 0);
        
        do{
            System.out.println("Enter the ID of the patient: ");
            patient.setPersonId(sc.nextInt());

            if(patient.getPersonId() != 0){
                sc.nextLine();
                System.out.println("Enter the name of the patient: ");
                patient.setPersonName(sc.nextLine());
                System.out.println("Enter the phone of the patient: ");
                patient.setPersonPhone(sc.nextLine());
                System.out.println("Enter the email of the patient: ");
                patient.setPersonEmail(sc.nextLine());
                System.out.println("Enter the patient Gender");
                patient.setPersonGender(sc.nextLine());
                System.out.println("Enter the patient Address");
                patient.setPersonAddress(sc.nextLine());
                System.out.println("Enter the patient Age");
                patient.setPersonAge(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter the patient Blood Group");
                patient.setPatientBloodGroup(sc.nextLine());
                System.out.println("Enter the patient Disease");
                patient.setPatientDisease(sc.nextLine());
                System.out.println("Enter the patient Weight");
                patient.setPatientWeight(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter the patient Height");
                patient.setPatientHeight(sc.nextInt());
                sc.nextLine();
                // Add the patient to the list when an instance is created
                pList.add(patient);
            }

            else{
                System.out.println("Program Finished");
            }

        } while(patient.getPersonId() == 0);
        return pList;
    }

    // Method to write to CSV
    public String toCSV() {
        return getPersonId() + ";" + getPersonName() + ";" + getPersonPhone() + ";" + getPersonEmail() + ";" + getPersonGender() + ";" + getPersonAddress() + ";" + getAge() + ";" + getPatientBloodGroup() + ";" + getPatientDisease() + ";" + getPatientWeight() + ";" + getPatientHeight() + "\n";
    }

    // Create a method to modify a patient's attributes
    public void modifyPatientByName(String name, String newBloodGroup, String newDisease, int newWeight, int newHeight) {
        for (Patients patient : patientsList(scanner)) {
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
        Iterator<Patients> iterator = patientsList(scanner).iterator();
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
    public ArrayList<Patients> getPatientsList() {
        return patientsList(scanner);
    }

  
}


    
