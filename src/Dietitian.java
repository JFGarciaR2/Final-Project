public class Dietitian extends Person {
    private String dietitianSpeciality = "";

    //Create a method to set the dietitian's speciality
    public void setDietitianSpeciality(String dietitianSpeciality) {
        this.dietitianSpeciality = dietitianSpeciality;
    }
    //Create a method to get the dietitian's speciality
    public String getDietitianSpeciality() {
        return dietitianSpeciality;
    }

}
