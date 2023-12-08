import java.util.StringJoiner;

public class DietPlanCSVCoder extends CSVCoder<DietPlan> {

    public DietPlanCSVCoder(char newColumnSeparator) {
        super(newColumnSeparator);
    }

    @Override
    public String[] encode(DietPlan dietPlan) {
        String[] encodedValues = new String[12];
        encodedValues[0] = String.valueOf(dietPlan.getPlanId());
        encodedValues[1] = dietPlan.getPlanName();
        encodedValues[2] = dietPlan.getPlanDescription();
        encodedValues[3] = dietPlan.getPlanType();
        encodedValues[4] = dietPlan.getPlanDuration();
        encodedValues[5] = dietPlan.getPlanPrice();
        encodedValues[6] = String.valueOf(dietPlan.getDayliCalories());
        encodedValues[7] = dietPlan.getMacronutrientDistribution();
        encodedValues[8] = dietPlan.getSpecificRecomendations();
        encodedValues[9] = dietPlan.getPatient().getPersonName();
        encodedValues[10] = dietPlan.getDietitian().getPersonName();
        encodedValues[11] = dietPlan.getMeal().getMealName();

        return encodedValues;
    }

    @Override
    public DietPlan decode(String[] values) {
        int planId = Integer.parseInt(values[0]);
        String planName = values[1];
        String planDescription = values[2];
        String planType = values[3];
        String planDuration = values[4];
        String planPrice = values[5];
        int dailyCalories = Integer.parseInt(values[6]);
        String macronutrientDistribution = values[7];
        String specificRecommendations = values[8];
        String patientName = values[9];
        String dietitianName = values[10];
        String mealName = values[11];

        return new DietPlan(planId, planName, planDescription, planType, planDuration, planPrice,
                dailyCalories, macronutrientDistribution, specificRecommendations, patientName, dietitianName, mealName);
    }
}
