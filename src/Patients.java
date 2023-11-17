import java.util.List;

public class Patients extends Person {
    private String patientBloodGroup = "";
    private String patientDisease = "";

    public static void fillPatientsList(List<Patients> patientsList) {
        //TODO: Fill the list with the data from the database
    }

    public static List<Patients> getPatientsList() {
        return null;
    }


    //Create a metod to get the patient's Blood Group
    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }
    //Create a method to get the patient's Blood Group
    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    //Create a method to set the patient's Disease
    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }
    //Create a method to get the patient's Disease
    public String getPatientDisease() {
        return patientDisease;
    }




}
