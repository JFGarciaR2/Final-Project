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
        Dietitian dietitian = new Dietitian(0, "", "", "", "", "", "", 0, "");
        
        do{
            System.out.println("Enter the ID of the dietitian: ");
            dietitian.setPersonId(sc.nextInt());

            if(dietitian.getPersonId() != 0){
                sc.nextLine();
                System.out.println("Enter the name of the dietitian: ");
                dietitian.setPersonName(sc.nextLine());
                System.out.println("Enter the phone of the dietitian: ");
                dietitian.setPersonPhone(sc.nextLine());
                System.out.println("Enter the email of the dietitian: ");
                dietitian.setPersonEmail(sc.nextLine());
                System.out.println("Enter the gender of the dietitian: ");
                dietitian.setPersonGender(sc.nextLine());
                System.out.println("Enter the address of the dietitian: ");
                dietitian.setPersonAddress(sc.nextLine());
                System.out.println("Enter the age of the dietitian: ");
                dietitian.setPersonAge(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter the speciality of the dietitian: ");
                dietitian.setDietitianSpeciality(sc.nextLine());
                

                //Add the dietitian to the list when an instance is created
                dList.add(dietitian);
            }

        } while(dietitian.getPersonId() == 0);
        return dList;
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
