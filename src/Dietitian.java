import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dietitian extends Person {
    private String dietitianSpeciality = "";

    public String getPersonName() {
        return getPersonName(); 
    }
    
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
        super(personId, personName, personPhone, personEmail, personGender, personAddress, personOccupation, age);
        setDietitianSpeciality(dietitianSpeciality);

        // Add the dietitian to the list when an instance is created
        dietitianList.add(this);
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
