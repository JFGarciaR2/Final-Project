//Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private int mealId = 0;
    private String mealName = "";
    private String mealDescription = "";
    private String mealType = "";
    private String mealCalories = "";
    private String macroNutrients = "";
    private String timeOfDay = "";

    // Create a method to set the meal's id
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }
    // Create a method to get the meal's id
    public int getMealId() {
        return mealId;
    }

    // Create a method to set the meal's name
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
    // Create a method to get the meal's name
    public String getMealName() {
        return mealName;
    }

    // Create a method to set the meal's description
    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }
    // Create a method to get the meal's description
    public String getMealDescription() {
        return mealDescription;
    }

    // Create a method to set the meal's type
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
    // Create a method to get the meal's type
    public String getMealType() {
        return mealType;
    }

    // Create a method to set the meal's calories
    public void setMealCalories(String mealCalories) {
        this.mealCalories = mealCalories;
    }
    // Create a method to get the meal's calories
    public String getMealCalories() {
        return mealCalories;
    }

    // Create a method to set the meal's macro nutrients
    public void setMacroNutrients(String macroNutrients) {
        this.macroNutrients = macroNutrients;
    }
    // Create a method to get the meal's macro nutrients
    public String getMacroNutrients() {
        return macroNutrients;
    }

    // Create a method to set the meal's time of day
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
    // Create a method to get the meal's time of day
    public String getTimeOfDay() {
        return timeOfDay;
    }


    // Constructor to initialize a meal with data
    public Meal(int id, String name, String description, String type,
                String calories, String nutrients, String time) {
        this.mealId = id;
        this.mealName = name;
        this.mealDescription = description;
        this.mealType = type;
        this.mealCalories = calories;
        this.macroNutrients = nutrients;
        this.timeOfDay = time;
    }

    // Get the list of meals
    public static List<Meal> getMealList() {
        List<Meal> meals = new ArrayList<>();
        meals.add(new Meal(1, "Breakfast", "Healthy breakfast", "Vegetarian", "300", "Protein, Carbs", "Morning"));
        meals.add(new Meal(2, "Lunch", "Balanced lunch", "Non-vegetarian", "500", "Protein, Fat", "Afternoon"));
        return meals;
    }
}
