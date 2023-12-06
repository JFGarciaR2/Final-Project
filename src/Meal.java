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

    //Methods Setters and Getters
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
        return mealName;
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

    public void setMealCalories(String mealCalories) {
        this.mealCalories = mealCalories;
    }
    public String getMealCalories() {
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
    public Meal(int id, String name, String description, String type,
                String calories, String nutrients, String time) {
        setMealId(id);
        setMealName(name);
        setMealDescription(description);
        setMealType(type);
        setMealCalories(calories);
        setMacroNutrients(nutrients);
        setTimeOfDay(time);

        // Add the meal to the list when an instance is created
        mealsList.add(this);
    }

    // List to store instances of meals
    static List<Meal> mealsList = new ArrayList<>();

    // Get the list of meals
    public static List<Meal> getMealList() {
        return mealsList;
    }
}
