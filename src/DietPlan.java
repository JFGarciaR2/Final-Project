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
    
}
