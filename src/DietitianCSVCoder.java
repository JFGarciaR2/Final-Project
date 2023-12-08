import java.util.List;

public class DietitianCSVCoder extends CSVCoder<Dietitian> {

    public DietitianCSVCoder(char newColumnSeparator) {
        super(newColumnSeparator);
    }

    @Override
    public String[] encode(Dietitian dietitian) {
        String[] encodedValues = new String[8];
        encodedValues[0] = String.valueOf(dietitian.getPersonId());
        encodedValues[1] = dietitian.getPersonName();
        encodedValues[2] = dietitian.getPersonPhone();
        encodedValues[3] = dietitian.getPersonEmail();
        encodedValues[4] = dietitian.getPersonGender();
        encodedValues[5] = dietitian.getPersonAddress();
        encodedValues[6] = dietitian.getPersonOccupation();
        encodedValues[7] = String.valueOf(dietitian.getAge());
        encodedValues[8] = dietitian.getDietitianSpeciality();
        return encodedValues;
    }

    @Override
    public Dietitian decode(String[] values) {
        int personId = Integer.parseInt(values[0]);
        String personName = values[1];
        String personPhone = values[2];
        String personEmail = values[3];
        String personGender = values[4];
        String personAddress = values[5];
        String personOccupation = values[6];
        int age = Integer.parseInt(values[7]);
        String dietitianSpeciality = values[8];

        return new Dietitian(personId, personName, personPhone, personEmail, personGender, personAddress, personOccupation, age, dietitianSpeciality);
    }
}
