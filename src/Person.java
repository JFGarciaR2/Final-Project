//Author: Juan Fernando Garcia Restrepo
public class Person {

    //Create atributes for the class Person
    private int personId = 0;
    private String personName = "";
    private String personPhone = "";
    private String personEmail = "";
    private String personGender = "";
    private String personAddress = "";
    private String personOccupation = "";
    private int age = 0;

    //Method Constructor
    public Person(int personId, String personName, String personPhone, String personEmail, String personGender,
                  String personAddress, String personOccupation, int age) {
        setPersonId(personId);
        setPersonName(personName);
        setPersonPhone(personPhone);
        setPersonEmail(personEmail);
        setPersonGender(personGender);
        setPersonAddress(personAddress);
        setPersonOccupation(personOccupation);
        setPersonAge(age);
    }

    //Create a methods Getters and Setters
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public int getPersonId() {
        return personId;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    public String getPersonName() {
        return personName;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }
    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }
    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonOccupation(String personOcupation) {
        this.personOccupation = personOcupation;
    }
    public String getPersonOccupation() {
        return personOccupation;
    }

    public void setPersonAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }
    public String getPersonGender() {
        return personGender;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }
    public String getPersonAddress() {
        return personAddress;
    }

}
