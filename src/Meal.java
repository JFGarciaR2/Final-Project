// Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private int mealId;
    private String mealName;
    private String mealDescription;
    private String mealType;
    private int mealCalories;  // Change to int if calories are numeric
    private String macroNutrients;
    private String timeOfDay;


     // List to store instances of meals
    private List<Meal> mealsList = new ArrayList<>();

    // Get the list of meals
    public List<Meal> getMealList() {
        return mealsList;
    }

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

   
}
