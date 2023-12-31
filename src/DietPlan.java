// Author: Juan Fernando Garcia Restrepo

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class DietPlan {
    static Scanner scanner = new Scanner(System.in);
    private int planId;
    private String planName;
    private String planDescription;
    private String planType;
    private String planDuration;
    private String planPrice;
    private static int dailyCalories;
    private String macronutrientDistribution;
    private String specificRecommendations;
    private Dietitian dietitian;
    private Meal meal;
    private Patients patient;

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
        DietPlan.dailyCalories = dayliCalories;
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

    public ArrayList<DietPlan> getDietPlanList() {
        return dietPlanList(scanner);
    }

    // Constructor 
    public DietPlan(int planId, String planName, String planDescription, String planType, String planDuration, String planPrice, int dailyCalories, String macronutrientDistribution, String specificRecommendations) {
        setPlanId(planId);
        setPlanName(planName);
        setPlanDescription(planDescription);
        setPlanType(planType);
        setPlanDuration(planDuration);
        setPlanPrice(planPrice);
        setDayliCalories(dailyCalories);
        setMacronutrientDistribution(macronutrientDistribution);
        setSpecificRecomendations(specificRecommendations);
    }

    public static ArrayList<DietPlan> dietPlanList(Scanner scanner){

        ArrayList<DietPlan> dpList = new ArrayList<DietPlan>();
        
        String planName;
        int planId;
        String planDescription;
        String planDuration;
        String planPrice;
        int dailyCalories;
        String macronutrientDistribution;
        String specificRecommendations;
        String patientName;
        String dietitianName;
        String mealName;

        do {
            // Create a new instance of diet plan
            DietPlan dietPlan = new DietPlan(0, "", "", "", "", "", 0, "", "");
        
            System.out.println("id: ");
            planId = scanner.nextInt();
        
            if (planId != 0) {
                scanner.nextLine();
                System.out.println("name: ");
                planName = scanner.nextLine();
                System.out.println("description: ");
                planDescription = scanner.nextLine();
                System.out.println("type: ");
                String planType = scanner.nextLine();
                System.out.println("duration: ");
                planDuration = scanner.nextLine();
                System.out.println("price: ");
                planPrice = scanner.nextLine();
                System.out.println("daily calories: ");
                dailyCalories = scanner.nextInt();
                scanner.nextLine();
                System.out.println("macronutrient distribution: ");
                macronutrientDistribution = scanner.nextLine();
                System.out.println("specific recommendations: ");
                specificRecommendations = scanner.nextLine();
        
                // Set the values to the diet plan object
                dietPlan.setPlanId(planId);
                dietPlan.setPlanName(planName);
                dietPlan.setPlanDescription(planDescription);
                dietPlan.setPlanType(planType);
                dietPlan.setPlanDuration(planDuration);
                dietPlan.setPlanPrice(planPrice);
                dietPlan.setDayliCalories(dailyCalories);
                dietPlan.setMacronutrientDistribution(macronutrientDistribution);
                dietPlan.setSpecificRecomendations(specificRecommendations);

                // Add the diet plan to the list when an instance is created
                dpList.add(dietPlan);
        
                System.out.println("Diet plan added successfully!");
                System.out.println("Enter 0 to exit or any other number to continue: ");
            }   
        } while (planId != 0);

        return dpList;

    }

    @Override
    public String toString() {
        return "DietPlan [dailyCalories=" + dailyCalories + ", dietitian=" + dietitian + ", macronutrientDistribution="
                + macronutrientDistribution + ", meal=" + meal + ", patient=" + patient + ", planDescription="
                + planDescription + ", planDuration=" + planDuration + ", planId=" + planId + ", planName=" + planName
                + ", planPrice=" + planPrice + ", planType=" + planType + ", specificRecommendations="
                + specificRecommendations + "]";
    }

    //Method to write to CSV
    public String toCSV(){
        return getPlanId() + ";" + getPlanName() + ";" + getPlanDescription() + ";" + getPlanType() + ";" + getPlanDuration() + ";" + getPlanPrice() + ";" + getDayliCalories() + ";" + getMacronutrientDistribution() + ";" + getSpecificRecomendations() + "\n";
    }
    
    // Method to modify the diet plan
    public static void modifyDietPlan(int id, String name, String description, String type, String duration, String price, int calories, String macronutrient, String recommendations) {
        for (DietPlan dietPlan : dietPlanList(scanner)) {
            if (dietPlan.getPlanId() == id) {
                dietPlan.setPlanName(name);
                dietPlan.setPlanDescription(description);
                dietPlan.setPlanType(type);
                dietPlan.setPlanDuration(duration);
                dietPlan.setPlanPrice(price);
                dietPlan.setDayliCalories(calories);
                dietPlan.setMacronutrientDistribution(macronutrient);
                dietPlan.setSpecificRecomendations(recommendations);
                System.out.println("Diet plan modified successfully!");
                break;
            }
        }

    }

    // Method to remove the diet plan
    public static boolean removeDietPlanById(int id) {
        Iterator<DietPlan> iterator = dietPlanList(scanner).iterator();
        while (iterator.hasNext()) {
            DietPlan dietPlan = iterator.next();
            if (dietPlan.getPlanId() == id) {
                iterator.remove();
                System.out.println("Diet plan removed successfully!");
                return true;
            }
        }
        return false;
          
    }

    // Methods to find the patient, dietitian, and meal by name
    private static Patients findPatientByName(String name) {
        for (Patients patient : new Patients(dailyCalories, name, name, name, name, name, dailyCalories, name, name, dailyCalories, dailyCalories).getPatientsList()) {
            if (patient.getPersonName().equalsIgnoreCase(name)) {
                return patient;
            }
        }
        return null;
    }

    private static Dietitian findDietitianByName(String name) {
        for (Dietitian dietitian : new Dietitian(dailyCalories, name, name, name, name, name, dailyCalories, name).getDietitianList()) {
            if (dietitian.getPersonName().equalsIgnoreCase(name)) {
                return dietitian;
            }
        }
        return null;
    }

    private static Meal findMealByName(String mealName) {
        for (Meal meal : new Meal(dailyCalories, mealName, mealName, mealName, dailyCalories, mealName, mealName).getMealList()) {
            if (meal.getMealName().equalsIgnoreCase(mealName)) {
                return meal;
            }
        }
        return null;
    }

}    

