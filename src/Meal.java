// Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Meal {
    private int mealId;
    private String mealName;
    private String mealDescription;
    private String mealType;
    private int mealCalories;  // Change to int if calories are numeric
    private String macroNutrients;
    private String timeOfDay;
    static Scanner scanner = new Scanner(System.in);

    // Methods Setters and Getters
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealName() {
        return getMealName(); 
    }
    

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealCalories(int mealCalories) {
        this.mealCalories = mealCalories;
    }

    public int getMealCalories() {
        return mealCalories;
    }

    public void setMacroNutrients(String macroNutrients) {
        this.macroNutrients = macroNutrients;
    }

    public String getMacroNutrients() {
        return macroNutrients;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

     // Constructor to initialize a meal with data
    public Meal(int id, String name, String description, String type, int calories, String nutrients, String time) {
        setMealId(id);
        setMealName(name);
        setMealDescription(description);
        setMealType(type);
        setMealCalories(calories);
        setMacroNutrients(nutrients);
        setTimeOfDay(time);
    }


    // List to store instances of meals
    public static ArrayList<Meal> mealsList(Scanner sc){
        ArrayList<Meal> mealsList = new ArrayList<Meal>();
        /*mealsList.add(new Meal(1, "Breakfast", "A healthy breakfast", "Breakfast", 300, "Carbs, Protein, Fat", "Morning"));
        mealsList.add(new Meal(2, "Lunch", "A healthy lunch", "Lunch", 500, "Carbs, Protein, Fat", "Afternoon"));
        mealsList.add(new Meal(3, "Dinner", "A healthy dinner", "Dinner", 400, "Carbs, Protein, Fat", "Evening"));
        mealsList.add(new Meal(4, "Snack", "A healthy snack", "Snack", 200, "Carbs, Protein, Fat", "Anytime"));
        return mealsList;*/

        int mealId;
        String mealName;
        String mealDescription;
        String mealType;
        int mealCalories;
        String macroNutrients;
        String timeOfDay;

        do{
            Meal meal = new Meal(0, "", "", "", 0, "", "");
            System.out.println("Enter the meal id: ");
            mealId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the meal name: ");
            mealName = sc.nextLine();
            System.out.println("Enter the meal description: ");
            mealDescription = sc.nextLine();
            System.out.println("Enter the meal type: ");
            mealType = sc.nextLine();
            System.out.println("Enter the meal calories: ");
            mealCalories = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the meal macro nutrients: ");
            macroNutrients = sc.nextLine();
            System.out.println("Enter the meal time of day: ");
            timeOfDay = sc.nextLine();

            // Set the values to the meal object
            meal.setMealId(mealId);
            meal.setMealName(mealName);
            meal.setMealDescription(mealDescription);
            meal.setMealType(mealType);
            meal.setMealCalories(mealCalories);
            meal.setMacroNutrients(macroNutrients);
            meal.setTimeOfDay(timeOfDay);

            // Add the meal to the list
            mealsList.add(meal);

            System.out.println("Meal added successfully!");
            System.out.println("Enter 0 to exit or any other number to continue: ");
        } while(mealId != 0);

        return mealsList;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealId=" + mealId +
                ", mealName='" + mealName + '\'' +
                ", mealDescription='" + mealDescription + '\'' +
                ", mealType='" + mealType + '\'' +
                ", mealCalories=" + mealCalories +
                ", macroNutrients='" + macroNutrients + '\'' +
                ", timeOfDay='" + timeOfDay + '\'' +
                '}';
    }

    //Method to write to CSV
    public String toCSV(){
        return mealId + ";" + mealName + ";" + mealDescription + ";" + mealType + ";" + mealCalories + ";" + macroNutrients + ";" + timeOfDay;
    }
    

    //Method to update a meal from the list
    public static void updateMeal(ArrayList<Meal> mealsList, Scanner sc){
        System.out.println("Enter the meal id to update: ");
        int mealId = sc.nextInt();
        sc.nextLine();
        for (Meal meal : mealsList) {
            if (meal.getMealId() == mealId) {
                System.out.println("Enter the meal name: ");
                String mealName = sc.nextLine();
                System.out.println("Enter the meal description: ");
                String mealDescription = sc.nextLine();
                System.out.println("Enter the meal type: ");
                String mealType = sc.nextLine();
                System.out.println("Enter the meal calories: ");
                int mealCalories = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the meal macro nutrients: ");
                String macroNutrients = sc.nextLine();
                System.out.println("Enter the meal time of day: ");
                String timeOfDay = sc.nextLine();

                // Set the values to the meal object
                meal.setMealName(mealName);
                meal.setMealDescription(mealDescription);
                meal.setMealType(mealType);
                meal.setMealCalories(mealCalories);
                meal.setMacroNutrients(macroNutrients);
                meal.setTimeOfDay(timeOfDay);

                System.out.println("Meal updated successfully!");
                break;
            }
        }
    }

    //Method to remove a meal from the list
    public static void removeMeal(ArrayList<Meal> mealsList, Scanner sc){
        System.out.println("Enter the meal id to remove: ");
        int mealId = sc.nextInt();
        sc.nextLine();
        for (Meal meal : mealsList) {
            if (meal.getMealId() == mealId) {
                mealsList.remove(meal);
                System.out.println("Meal removed successfully!");
                break;
            }
        }
    }


    // Get the list of meals
    public ArrayList<Meal> getMealList() {
        return mealsList(scanner);
    }

}

   

