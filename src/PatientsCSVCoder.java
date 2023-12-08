import java.util.List;
import java.util.StringJoiner;

public class PatientsCSVCoder extends CSVCoder<Patients> {

    public PatientsCSVCoder(char newColumnSeparator) {
        super(newColumnSeparator);
    }

    @Override
    public String[] encode(Patients patient) {
        String[] encodedValues = {
                String.valueOf(patient.getPersonId()),
                patient.getPersonName(),
                patient.getPersonPhone(),
                patient.getPersonEmail(),
                patient.getPersonGender(),
                patient.getPersonAddress(),
                patient.getPersonOccupation(),
                String.valueOf(patient.getAge()),
                patient.getPatientBloodGroup(),
                patient.getPatientDisease(),
                String.valueOf(patient.getPatientWeight()),
                String.valueOf(patient.getPatientHeight())
        };
        return encodedValues;
    }

    @Override
    public Patients decode(String[] values) {
        int personId = Integer.parseInt(values[0]);
        String personName = values[1];
        String personPhone = values[2];
        String personEmail = values[3];
        String personGender = values[4];
        String personAddress = values[5];
        String personOccupation = values[6];
        int age = Integer.parseInt(values[7]);
        String patientBloodGroup = values[8];
        String patientDisease = values[9];
        int patientWeight = Integer.parseInt(values[10]);
        int patientHeight = Integer.parseInt(values[11]);

        return new Patients(personId, personName, personPhone, personEmail, personGender, personAddress,
                personOccupation, age, patientBloodGroup, patientDisease, patientWeight, patientHeight);
    }
}

