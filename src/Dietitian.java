import java.util.ArrayList;
import java.util.List;

public class Dietitian extends Person {
    private String dietitianSpeciality = "";
    static Dietitian dietitian = new Dietitian();


    //Create a method to set the dietitian's speciality
    public void setDietitianSpeciality(String dietitianSpeciality) {
        this.dietitianSpeciality = dietitianSpeciality;
    }
    //Create a method to get the dietitian's speciality
    public String getDietitianSpeciality() {
        return dietitianSpeciality;
    }

    private static List<String> DietitianList = new ArrayList<String>() {
        {
            DietitianList.add(dietitian.getPersonName());
            DietitianList.add(dietitian.getPersonPhone());
            DietitianList.add(dietitian.getPersonEmail());
            DietitianList.add(dietitian.getPersonGender());
            DietitianList.add(dietitian.getPersonAddress());
            DietitianList.add(dietitian.getPersonOcupation());
            DietitianList.add(dietitian.getDietitianSpeciality());
        }
    };

    public static List<String> getDietitianList() {
        return DietitianList;
    }
}
