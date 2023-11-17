import java.util.ArrayList;
import java.util.List;

public class Patients extends Person {
    private String patientBloodGroup = "";
    private String patientDisease = "";

    static Patients patients = new Patients();

    //Create a metod to set the patient's Blood Group
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

    private static List<String> PatientsList = new ArrayList<String>() {
        {
            PatientsList.add(patients.getPersonName());
            PatientsList.add(patients.getPersonPhone());
            PatientsList.add(patients.getPersonEmail());
            PatientsList.add(patients.getPersonGender());
            PatientsList.add(patients.getPersonAddress());
            PatientsList.add(patients.getPersonOcupation());
            PatientsList.add(patients.getPatientBloodGroup());
            PatientsList.add(patients.getPatientDisease());
        }
    };

    public static List<String> getPatientsList() {
        return PatientsList;
    }

    public void setPatientsList(List<String> patientsList) {
        PatientsList = patientsList;
    }
}