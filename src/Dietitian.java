//Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dietitian extends Person {
    private String dietitianSpeciality = "";

    // Create a methods Getters and Setters
    public void setDietitianSpeciality(String dietitianSpeciality) {
        this.dietitianSpeciality = dietitianSpeciality;
    }
    public String getDietitianSpeciality() {
        return dietitianSpeciality;
    }

    //Constructor to initialize a nutritionist with data
    public Dietitian(int personId, String personName, String personPhone, String personEmail, String personGender, String personAddress, String personOccupation, int age, String dietitianSpeciality) {
        super(personId, personName, personPhone, personEmail, personGender, personAddress, personOccupation, age);
        setDietitianSpeciality(dietitianSpeciality);

        // Add the nutritionist to the list when an instance is created
        dietitianList.add(this);
    }

     // List to store instances of nutritionists
    private static List<Dietitian> dietitianList = new ArrayList<>();

    //Get the list of patients
    public static List<Dietitian> getDietitianList() {
        return dietitianList;
    }

    // Create a method to modify a patient's attributes
    public void modifyPatientByName(String name, String newSpeciality) {
        for (Dietitian dietitian : dietitianList) {
            if (dietitian.getPersonName().equalsIgnoreCase(name)) {
                // Modify the patient's attributes
                dietitian.setDietitianSpeciality(newSpeciality);
                System.out.println("Patient details modified for: " + name);
                return;
            }
        }
        System.out.println("Not found a patient with name : " + name);
    }
    
    public static void removeDietitianByName(String name) {
        Iterator<Dietitian> iterator = dietitianList.iterator();
        while (iterator.hasNext()) {
            Dietitian dietitian = iterator.next();
            if (dietitian.getPersonName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Dietitian delete: " + name);
            }
        }
        System.out.println("Not found a dietitian with name : " + name);
    }
}

