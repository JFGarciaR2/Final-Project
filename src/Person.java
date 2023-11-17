import java.util.List;

public class Person {
    private int personId = 0;
    private String personName = "";
    private String personPhone = "";
    private String personEmail = "";
    private String personGender = "";
    private String personAddress = "";
    private String personOcupation = "";
    private int age = 0;
    private int width = 0;
    private int height = 0;

    public static void fillPersonList(List<Person> personList) {
        //TODO: Fill the list with the data from the database

    }

    public static List<Person> getPersonList() {
        return null;
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

    //Create a method to get the person's Ocupation
    public void setPersonOcupation(String personOcupation) {
        this.personOcupation = personOcupation;
    }
    //Create a method to get the person's Ocupation
    public String getPersonOcupation() {
        return personOcupation;
    }

    //Create a method to get the person's age
    public void setAge(int age) {
        this.age = age;
    }
    //Create a method to get the person's age
    public int getAge() {
        return age;
    }

    //Create a method to get the person's height
    public void setHeight(int height) {
        this.height = height;
    }
    //Create a method to get the person's height
    public int getHeight() {
        return height;
    }

    //Create a method to get the person's width
    public void setWidth(int width) {
        this.width = width;
    }
    //Create a method to get the person's width
    public int getWidth() {
        return width;
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
