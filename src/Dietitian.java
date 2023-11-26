//Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.List;

public class Dietitian extends Person {
    private String dietitianSpeciality = "";

    // List to store instances of nutritionists
    private static List<Dietitian> dietitianList = new ArrayList<>();

    // Constructor to initialize a nutritionist with data
    public Dietitian(int personId, String dietitianName, String dietitianPhone, String dietitianEmail, String dietitianGender,
                     int patientAge, String speciality) {
        setPersonId(personId);
        setPersonName(dietitianName);
        setPersonPhone(dietitianPhone);
        setPersonEmail(dietitianEmail);
        setPersonGender(dietitianGender);
        setPersonAge(patientAge);
        this.dietitianSpeciality = speciality;

        // Add the nutritionist to the list when an instance is created
        dietitianList.add(this);
    }

    // Get the list of nutritionists
    public static List<Dietitian> getDietitianList() {
        return dietitianList;
    }
}
