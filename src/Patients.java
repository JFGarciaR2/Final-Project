//Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.Iterator;
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

    public static ArrayList<Patients> patientsList(Scanner sc) {
        ArrayList<Patients> pList = new ArrayList<>();
    
        // Create a new instance of the patient
        int personId;
        String personName;
        String personPhone;
        String personEmail;
        String personGender;
        String personAddress;
        int personAge;
        String patientBloodGroup;
        String patientDisease;
        int patientWeight;
        int patientHeight;
    
        do {
            // Create a new instance of the patient
            Patients patient = new Patients(0, "", "", "", "", "", 0, "", "", 0, 0);
    
            System.out.println("ID: ");
            personId = sc.nextInt();
    
            if (personId != 0) {
                sc.nextLine();
                System.out.println("Name: ");
                personName = sc.nextLine();
                System.out.println("Phone: ");
                personPhone = sc.nextLine();
                System.out.println("Email: ");
                personEmail = sc.nextLine();
                System.out.println("Gender: ");
                personGender = sc.nextLine();
                System.out.println("Address: ");
                personAddress = sc.nextLine();
                System.out.println("Age: ");
                personAge = sc.nextInt();
                sc.nextLine();
                System.out.println("Blood Group: ");
                patientBloodGroup = sc.nextLine();
                System.out.println("Disease: ");
                patientDisease = sc.nextLine();
                System.out.println("Weight: ");
                patientWeight = sc.nextInt();
                sc.nextLine();
                System.out.println("Height: ");
                patientHeight = sc.nextInt();
                sc.nextLine();
    
                // Set the attributes of the patient
                patient.setPersonId(personId);
                patient.setPersonName(personName);
                patient.setPersonPhone(personPhone);
                patient.setPersonEmail(personEmail);
                patient.setPersonGender(personGender);
                patient.setPersonAddress(personAddress);
                patient.setPersonAge(personAge);
                patient.setPatientBloodGroup(patientBloodGroup);
                patient.setPatientDisease(patientDisease);
                patient.setPatientWeight(patientWeight);
                patient.setPatientHeight(patientHeight);
    
                // Add the patient to the list when an instance is created
                pList.add(patient);
    
                System.out.println("Patient created Succesfully!");
                System.out.println("Enter 0 to exit or any other number to continue: ");
            }
        } while (personId != 0);
    
        return pList;
    }
    
        @Override
        public String toString() {
            return "Patients{" +
                    "personId=" + getPersonId() +
                    ", personName='" + getPersonName() + '\'' +
                    ", personPhone='" + getPersonPhone() + '\'' +
                    ", personEmail='" + getPersonEmail() + '\'' +
                    ", personGender='" + getPersonGender() + '\'' +
                    ", personAddress='" + getPersonAddress() + '\'' +
                    ", age=" + getAge() +
                    ", patientBloodGroup='" + getPatientBloodGroup() + '\'' +
                    ", patientDisease='" + getPatientDisease() + '\'' +
                    ", patientWeight=" + getPatientWeight() +
                    ", patientHeight=" + getPatientHeight() +
                    '}';
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


    
