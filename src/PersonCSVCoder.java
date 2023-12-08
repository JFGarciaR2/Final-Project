import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class PersonCSVCoder extends CSVCoder<Person> {

    public PersonCSVCoder(char newColumnSeparator) {
        super(newColumnSeparator);
    }

    @Override
    public String[] encode(Person person) {
        return new String[]{
                String.valueOf(person.getPersonId()),
                person.getPersonName(),
                person.getPersonPhone(),
                person.getPersonEmail(),
                person.getPersonGender(),
                person.getPersonAddress(),
                person.getPersonOccupation(),
                String.valueOf(person.getAge())
        };
    }

    @Override
    public Person decode(String[] values) {
        int personId = Integer.parseInt(values[0]);
        String personName = values[1];
        String personPhone = values[2];
        String personEmail = values[3];
        String personGender = values[4];
        String personAddress = values[5];
        String personOccupation = values[6];
        int age = Integer.parseInt(values[7]);

        return new Person(personId, personName, personPhone, personEmail, personGender, personAddress, personOccupation, age);
    }
}
