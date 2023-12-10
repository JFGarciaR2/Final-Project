import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Dietitian extends Person {
    private String dietitianSpeciality = "";


    // Create methods for Getters and Setters
    public void setDietitianSpeciality(String dietitianSpeciality) {
        this.dietitianSpeciality = dietitianSpeciality;
    }

    public String getDietitianSpeciality() {
        return dietitianSpeciality;
    }

    // Constructor to initialize a dietitian with data
    public Dietitian(int personId, String personName, String personPhone, String personEmail, String personGender,
            String personAddress, String personOccupation, int age, String dietitianSpeciality) {
        super(personId, personName, personPhone, personEmail, personGender, personAddress, age);
        setDietitianSpeciality(dietitianSpeciality);
    }

     // List to store instances of patients
    public static ArrayList<Dietitian> dietitianList(Scanner sc){
        ArrayList<Dietitian> dList = new ArrayList<>();
        
          // Create a new instance of the patient
          int personId;
          String personName;
          String personPhone;
          String personEmail;
          String personGender;
          String personAddress;
          int personAge;
        String dietitianSpeciality;
      
          do {
            System.out.println("ID: ");
            personId = sc.nextInt();
      
            Dietitian dietitian = new Dietitian(0, "", "", "", "", "", "", 0, "");

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
                System.out.println("Speciality: ");
                dietitianSpeciality = sc.nextLine();
    
                // Set the attributes of the dietitian
                dietitian.setPersonId(personId);
                dietitian.setPersonName(personName);
                dietitian.setPersonPhone(personPhone);
                dietitian.setPersonEmail(personEmail);
                dietitian.setPersonGender(personGender);
                dietitian.setPersonAddress(personAddress);
                dietitian.setPersonAge(personAge);
                dietitian.setDietitianSpeciality(dietitianSpeciality);
            
                // Add the patient to the list when an instance is created
                dList.add(dietitian);
    
                System.out.println("Dietitian created Succesfully!");
                System.out.println("Enter 0 to exit or any other number to continue: ");
              }
          } while (personId != 0);
      
          return dList;
      }
    @Override
    public String toString() {
        return "Dietitians{" +
                "personId=" + getPersonId() +
                ", personName='" + getPersonName() + '\'' +
                ", personPhone='" + getPersonPhone() + '\'' +
                ", personEmail='" + getPersonEmail() + '\'' +
                ", personGender='" + getPersonGender() + '\'' +
                ", personAddress='" + getPersonAddress() + '\'' +
                ", age=" + getAge() +
                ", dietitianSpeciality='" + getDietitianSpeciality() + '\'' +
                '}';
    }
    // Method to write CSV
    public String toCSV() {
        return getPersonId() + ";" + getPersonName() + ";" + getPersonPhone() + ";" + getPersonEmail() + ";" + getPersonGender() + ";" + getPersonAddress() + ";" + getAge() + ";" + getDietitianSpeciality() + "\n";
    }

    // List to store instances of dietitians
    private  List<Dietitian> dietitianList = new ArrayList<>();

    // Get the list of dietitians
    public  List<Dietitian> getDietitianList() {
        return dietitianList;
    }

    // Add a dietitian to the list
    public  void addDietitian(Dietitian dietitian) {
        dietitianList.add(dietitian);
    }

    // Create a method to modify a dietitian's attributes
    public  void modifyDietitianByName(String name, String newSpeciality) {
        for (Dietitian dietitian : dietitianList) {
            if (dietitian.getPersonName().equalsIgnoreCase(name)) {
                // Modify the dietitian's attributes
                dietitian.setDietitianSpeciality(newSpeciality);
                System.out.println("Dietitian details modified for: " + name);
                return;
            }
        }
        System.out.println("Not found a dietitian with name : " + name);
    }

    // Remove a dietitian from the list by name
    public void removeDietitianByName(String name) {
        Iterator<Dietitian> iterator = dietitianList.iterator();
        while (iterator.hasNext()) {
            Dietitian dietitian = iterator.next();
            if (dietitian.getPersonName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Dietitian deleted: " + name);
                return;
            }
        }
        System.out.println("Not found a dietitian with name : " + name);
    }
}
