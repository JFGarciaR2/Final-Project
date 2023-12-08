//Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.List;

public class DietPlan {
    private int planId = 0;
    private String planName = "";
    private String planDescription = "";
    private String planType = "";
    private String planDuration = "";
    private String planPrice = "";
    private int dayliCalories = 0;
    private String macronutrientDistribution = "";
    private String specificRecomendations = "";
    private Patients patients;
    private Dietitian dietitian;
    private Meal meal;
    // Create a methods Getters and Setters
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
        this.dayliCalories = dayliCalories;
    }
    public int getDayliCalories() {
        return dayliCalories;
    }

    public void setMacronutrientDistribution(String macronutrientDistribution) {
        this.macronutrientDistribution = macronutrientDistribution;
    }
    public String getMacronutrientDistribution() {
        return macronutrientDistribution;
    }

    public void setSpecificRecomendations(String specificRecomendations) {
        this.specificRecomendations = specificRecomendations;
    }
    public String getSpecificRecomendations() {
        return specificRecomendations;
    }


    private static List<DietPlan> dietPlanList = new ArrayList<>();

    public static List<DietPlan> getDietPlanList() {
        return dietPlanList;
    }

    //Constructor 
    public DietPlan(int planId, String planName, String planDescription, String planType, String planDuration, String planPrice, int dayliCalories, String macronutrientDistribution, String specificRecomendations, String patientName, String dietitianName, String mealName) {
        this.planId = planId;
        this.planName = planName;
        this.planDescription = planDescription;
        this.planType = planType;
        this.planDuration = planDuration;
        this.planPrice = planPrice;
        this.dayliCalories = dayliCalories;
        this.macronutrientDistribution = macronutrientDistribution;
        this.specificRecomendations = specificRecomendations;
         // Search the patient by name
        this.patients = findPatientByName(patientName);
        // Search the dietitian by name
        this.dietitian = findDietitianByName(dietitianName);
        // Search the meal by name
        this.meal = findMealByName(mealName);
       
        // Add the dietplan to the list when an instance is created
        dietPlanList.add(this);
    }

    // Methods to find the patient, dietitian and Meal by name
    private Patients findPatientByName(String name) {
        for (Patients patient : Patients.getPatientsList()) {
            if (patient.getPersonName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }

    private Dietitian findDietitianByName(String name) {
        for (Dietitian dietitian : Dietitian.getDietitianList()) {
            if (dietitian.getPersonName().equalsIgnoreCase(name)) {
                return dietitian;
            }
        }
        return null;
    }

    private Meal findMealByName(String mealName) {
         for (Meal meal : Meal.getMealList()) {
            if (meal.getMealName().equalsIgnoreCase(mealName)) {
                return meal;
            }
        }
        return null;
    }
}
