import java.util.StringJoiner;

public class MealCSVCoder extends CSVCoder<Meal> {

    public MealCSVCoder(char newColumnSeparator) {
        super(newColumnSeparator);
    }

    @Override
    public String[] encode(Meal meal) {
        String[] encodedValues = new String[7];
        encodedValues[0] = String.valueOf(meal.getMealId());
        encodedValues[1] = meal.getMealName();
        encodedValues[2] = meal.getMealDescription();
        encodedValues[3] = meal.getMealType();
        encodedValues[4] = String.valueOf(meal.getMealCalories());
        encodedValues[5] = meal.getMacroNutrients();
        encodedValues[6] = meal.getTimeOfDay();

        return encodedValues;
    }

    @Override
    public Meal decode(String[] values) {
        int mealId = Integer.parseInt(values[0]);
        String mealName = values[1];
        String mealDescription = values[2];
        String mealType = values[3];
        int mealCalories = Integer.parseInt(values[4]);
        String macroNutrients = values[5];
        String timeOfDay = values[6];

        return new Meal(mealId, mealName, mealDescription, mealType, mealCalories, macroNutrients, timeOfDay);
    }
}
