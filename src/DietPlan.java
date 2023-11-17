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

    public static void fillDietPlanList(List<DietPlan> dietPlanList) {
        //TODO: Fill the list with the data from the database

    }

    public static List<DietPlan> getDietPlanList() {
        return null;
    }


    //Create a method to set the plan's id
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    //Create a method to get the plan's id
    public int getPlanId() {
        return planId;
    }

    //Create a method to set the plan's name
    public void setPlanName(String planName) {
        this.planName = planName;
    }
    //Create a method to get the plan's name
    public String getPlanName() {
        return planName;
    }

    //Create a method to set the plan's description
    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }
    //Create a method to get the plan's description
    public String getPlanDescription() {
        return planDescription;
    }

    //Create a method to set the plan's type
    public void setPlanType(String planType) {
        this.planType = planType;
    }
    //Create a method to get the plan's type
    public String getPlanType() {
        return planType;
    }

    //Create a method to set the plan's duration
    public void setPlanDuration(String planDuration) {
        this.planDuration = planDuration;
    }
    //Create a method to get the plan's duration
    public String getPlanDuration() {
        return planDuration;
    }

    //Create a method to set the plan's price
    public void setPlanPrice(String planPrice) {
        this.planPrice = planPrice;
    }
    //Create a method to get the plan's price
    public String getPlanPrice() {
        return planPrice;
    }

    //Create a method to set the plan's daily calories
    public void setDayliCalories(int dayliCalories) {
        this.dayliCalories = dayliCalories;
    }
    //Create a method to get the plan's daily calories
    public int getDayliCalories() {
        return dayliCalories;
    }

    //Create a method to set the plan's macronutrient distribution
    public void setMacronutrientDistribution(String macronutrientDistribution) {
        this.macronutrientDistribution = macronutrientDistribution;
    }
    //Create a method to get the plan's macronutrient distribution
    public String getMacronutrientDistribution() {
        return macronutrientDistribution;
    }

    //Create a method to set the plan's specific recomendations
    public void setSpecificRecomendations(String specificRecomendations) {
        this.specificRecomendations = specificRecomendations;
    }
    //Create a method to get the plan's specific recomendations
    public String getSpecificRecomendations() {
        return specificRecomendations;
    }

    public DietPlan(String planName, String planDescription, String planType, String planDuration, String planPrice, int dayliCalories, String macronutrientDistribution, String specificRecomendations, Patients patients, Dietitian dietitian) {
        this.planName = planName;
        this.planDescription = planDescription;
        this.planType = planType;
        this.planDuration = planDuration;
        this.planPrice = planPrice;
        this.dayliCalories = dayliCalories;
        this.macronutrientDistribution = macronutrientDistribution;
        this.specificRecomendations = specificRecomendations;
        this.patients = patients;
        this.dietitian = dietitian;
    }

    public void createDietPlan(){
    //create a dietplan method that creates a dietplan
        //How?
        //1. Ask for the dietitian's id
        //2. Ask for the patient's id
        //3. Ask for the dietplan's name
        //4. Ask for the dietplan's description
        //5. Ask for the dietplan's type
        //6. Ask for the dietplan's duration
        //7. Ask for the dietplan's price
        //8. Ask for the dietplan's daily calories
        //9. Ask for the dietplan's macronutrient distribution
        //10. Ask for the dietplan's specific recomendations
        //11. Create a dietplan object with the information provided
        //12. Save the dietplan object in the database
        //13. Show a message that the dietplan was created successfully
        //14. Show the dietplan's information
        //15. Ask if the user wants to create another dietplan
        //16. If the user wants to create another dietplan, go to step 1
        //17. If the user doesn't want to create another dietplan, go to the main menu
        //Now, let's code it!

    }

    public void ajustDietPlan(){
        //create a method that ajusts a dietplan
        //How?
        //1. Ask for the dietplan's id
        //2. Ask for the dietplan's name
        //3. Ask for the dietplan's description
        //4. Ask for the dietplan's type
        //5. Ask for the dietplan's duration
        //6. Ask for the dietplan's price
        //7. Ask for the dietplan's daily calories
        //8. Ask for the dietplan's macronutrient distribution
        //9. Ask for the dietplan's specific recomendations
        //10. Create a dietplan object with the information provided
        //11. Save the dietplan object in the database
        //12. Show a message that the dietplan was ajusted successfully
        //13. Show the dietplan's information
        //14. Ask if the user wants to ajust another dietplan
        //15. If the user wants to ajust another dietplan, go to step 1
        //16. If the user doesn't want to ajust another dietplan, go to the main menu
        //Now, let's code it!

    }
}
