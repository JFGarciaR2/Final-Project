import java.util.ArrayList;
import java.util.List;

public class Dietitian extends Person {
    private String dietitianSpeciality = "";

    public static void fillDietitianList(List<Dietitian> dietitianList) {
        //TODO: Fill the list with the data from the database

    }

    Dietitian dietitian = new Dietitian();
    private List<String> DietitianList = new ArrayList<String>() {
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


    //Create a method to set the dietitian's speciality
    public void setDietitianSpeciality(String dietitianSpeciality) {
        this.dietitianSpeciality = dietitianSpeciality;
    }
    //Create a method to get the dietitian's speciality
    public String getDietitianSpeciality() {
        return dietitianSpeciality;
    }

}
