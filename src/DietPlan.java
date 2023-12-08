// Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.List;

public class DietPlan {
    private int planId;
    private String planName;
    private String planDescription;
    private String planType;
    private String planDuration;
    private String planPrice;
    private int dailyCalories;
    private String macronutrientDistribution;
    private String specificRecommendations;
    private Patients patient;
    private Dietitian dietitian;
    private Meal meal;

    // Create methods Getters and Setters
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    public int getPlanId() {
        return planId;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }
    public String getPlanName() {
        return planName;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }
    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }
    public String getPlanType() {
        return planType;
    }

    public void setPlanDuration(String planDuration) {
        this.planDuration = planDuration;
    }
    public String getPlanDuration() {
        return planDuration;
    }

    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }
    public String getPlanPrice() {
        return planPrice;
    }

    public void setDayliCalories(int dayliCalories) {
        this.dailyCalories = dayliCalories;
    }
    public int getDayliCalories() {
        return dailyCalories;
    }

    public void setMacronutrientDistribution(String macronutrientDistribution) {
        this.macronutrientDistribution = macronutrientDistribution;
    }
    public String getMacronutrientDistribution() {
        return macronutrientDistribution;
    }

    public void setSpecificRecomendations(String specificRecomendations) {
        this.specificRecommendations = specificRecomendations;
    }
    public String getSpecificRecomendations() {
        return specificRecommendations;
    }

    public Patients getPatient() {
        return patient;
    }

    public Dietitian getDietitian() {
        return dietitian;
    }

    public Meal getMeal() {
        return meal;
    }

    // List to store instances of diet plans
    private List<DietPlan> dietPlanList = new ArrayList<>();

    public List<DietPlan> getDietPlanList() {
        return dietPlanList;
    }

    // Constructor 
    public DietPlan(int planId, String planName, String planDescription, String planType, String planDuration, String planPrice, int dailyCalories, String macronutrientDistribution, String specificRecommendations, String patientName, String dietitianName, String mealName) {
        this.planId = planId;
        this.planName = planName;
        this.planDescription = planDescription;
        this.planType = planType;
        this.planDuration = planDuration;
        this.planPrice = planPrice;
        this.dailyCalories = dailyCalories;
        this.macronutrientDistribution = macronutrientDistribution;
        this.specificRecommendations = specificRecommendations;
        // Search the patient by name
        this.patient = findPatientByName(patientName);
        // Search the dietitian by name
        this.dietitian = findDietitianByName(dietitianName);
        // Search the meal by name
        this.meal = findMealByName(mealName);

        // Add the diet plan to the list when an instance is created
        dietPlanList.add(this);
    }

    // Methods to find the patient, dietitian, and meal by name
    private Patients findPatientByName(String name) {
        for (Patients patient : new Patients(dailyCalories, name, name, name, name, name, name, dailyCalories, name, name, dailyCalories, dailyCalories).getPatientsList()) {
            if (patient.getPersonName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }

    private Dietitian findDietitianByName(String name) {
        for (Dietitian dietitian : new Dietitian(dailyCalories, name, name, name, name, name, name, dailyCalories, name).getDietitianList()) {
            if (dietitian.getPersonName().equalsIgnoreCase(name)) {
                return dietitian;
            }
        }
        return null;
    }

    private Meal findMealByName(String mealName) {
        for (Meal meal : new Meal(dailyCalories, mealName, mealName, mealName, dailyCalories, mealName, mealName).getMealList()) {
            if (meal.getMealName().equalsIgnoreCase(mealName)) {
                return meal;
            }
        }
        return null;
    }

    
}
