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

    static Meal meal = new Meal();


    //Create a method to set the meal's id
    public void setMealId(int mealId) {
        this.mealId = mealId;
    }
    //Create a method to get the meal's id
    public int getMealId() {
        return mealId;
    }

    //Create a method to set the meal's name
    public void setMealName(String mealName) {
        this.mealName = mealName;
    }
    //Create a method to get the meal's name
    public String getMealName() {
        return mealName;
    }

    //Create a method to set the meal's description
    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }
    //Create a method to get the meal's description
    public String getMealDescription() {
        return mealDescription;
    }

    //Create a method to set the meal's type
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
    //Create a method to get the meal's type
    public String getMealType() {
        return mealType;
    }

    //Create a method to set the meal's calories
    public void setMealCalories(String mealCalories) {
        this.mealCalories = mealCalories;
    }
    //Create a method to get the meal's calories
    public String getMealCalories() {
        return mealCalories;
    }

    //Create a method to set the meal's macro nutrients
    public void setMacroNutrients(String macroNutrients) {
        this.macroNutrients = macroNutrients;
    }
    //Create a method to get the meal's macro nutrients
    public String getMacroNutrients() {
        return macroNutrients;
    }

    //Create a method to set the meal's time of day
    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
    //Create a method to get the meal's time of day
    public String getTimeOfDay() {
        return timeOfDay;
    }

    private static List <String> MealList = new ArrayList<String>() {
        {
            MealList.add(String.valueOf(meal.getMealId()));
            MealList.add(meal.getMealName());
            MealList.add(meal.getMealDescription());
            MealList.add(meal.getMealType());
            MealList.add(meal.getMealCalories());
            MealList.add(meal.getMacroNutrients());
            MealList.add(meal.getTimeOfDay());
        }
    };

    public static List<String> getMealList() {
        return MealList;
    }
}

