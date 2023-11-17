import javax.swing.*;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Create a list that contain all dates of Person
        List<Person> personList = Person.getPersonList();
        //Create a list that contain all dates of Meal
        List<Meal> mealList = Meal.getMealList();
        //Create a list that contain all dates of Patients
        List<Patients> patientsList = Patients.getPatientsList();
        //Create a list that contain all dates of Dietitian
        List<Dietitian> dietitianList = Dietitian.getDietitianList();
        //Create a list that contain all dates of DietPlan
        List<DietPlan> dietPlanList = DietPlan.getDietPlanList();
        //Create a list that contain all dates of DietPlan

        //Create a loop to print all dates of Person
        for (Person person : personList) {
            System.out.println(person);
        }
        //Create a loop to print all dates of Meal
        for (Meal meal : mealList) {
            System.out.println(meal);
        }
        //Create a loop to print all dates of Patients
        for (Patients patients : patientsList) {
            System.out.println(patients);
        }
        //Create a loop to print all dates of Dietitian
        for (Dietitian dietitian : dietitianList) {
            System.out.println(dietitian);
        }
        //Create a loop to print all dates of DietPlan
        for (DietPlan dietPlan : dietPlanList) {
            System.out.println(dietPlan);
        }


        //Fill the list with the data from the database
        Person.fillPersonList(personList);
        //Fill the list with the data from the database
        Meal.fillMealList(mealList);
        //Fill the list with the data from the database
        Patients.fillPatientsList(patientsList);
        //Fill the list with the data from the database
        Dietitian.fillDietitianList(dietitianList);
        //Fill the list with the data from the database
        DietPlan.fillDietPlanList(dietPlanList);
    }
}
