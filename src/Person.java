import java.util.List;

public class Person {
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

    //Create a method to set the person's id
    public void setPersonId(int personId) {
        this.personId = personId;
    }
    //Create a method to get the person's id
    public int getPersonId() {
        return personId;
    }

    //Create a method to set the person's name
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    //Create a method to get the person's name
    public String getPersonName() {
        return personName;
    }

    //Create a method to set the person's phone
    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }
    //Create a method to get the person's phone
    public String getPersonPhone() {
        return personPhone;
    }

    //Create a method to set the person's email
    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }
    //Create a method to get the person's email
    public String getPersonEmail() {
        return personEmail;
    }

    //Create a method to get the person's Occupation
    public void setPersonOccupation(String personOcupation) {
        this.personOccupation = personOcupation;
    }
    //Create a method to get the person's Occupation
    public String getPersonOccupation() {
        return personOccupation;
    }

    //Create a method to get the person's age
    public void setPersonAge(int age) {
        this.age = age;
    }
    //Create a method to get the person's age
    public int getAge() {
        return age;
    }

    //Create a method to set the person's Gender
    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }
    //Create a method to get the person's Gender
    public String getPersonGender() {
        return personGender;
    }

    //Create a method to set the person's Address
    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }
    //Create a method to get the person's Address
    public String getPersonAddress() {
        return personAddress;
    }

}
