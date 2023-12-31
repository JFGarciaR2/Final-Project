import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Welcome to the Diet Plan App");
            System.out.println("Please enter your option: ");

            System.out.println("1. Patients");
            System.out.println("2. Dietitians");
            System.out.println("3. Diet Plans");
            System.out.println("4. Meals");
            System.out.println("5. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // PATIENTS
                    System.out.println("Patients");

                    boolean back = false;
                    while (!back) {
                        System.out.println("1. Add Patient");
                        System.out.println("2. View Patients");
                        System.out.println("3. Modify Patient");
                        System.out.println("4. Delete Patient");
                        System.out.println("5. Back");
                        int optionPatients = scanner.nextInt();

                        switch (optionPatients) {
                            case 1: // Add Patient
                                ArrayList<Patients> pList = Patients.patientsList(scanner);

                                File f = new File("patients.csv");
                                try (FileWriter fw = new FileWriter(f, true)) {
                                    for (Patients p : pList) {
                                        fw.write(p.toCSV());
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error");
                                }

                                break;

                            case 2: // View Patients

                                ArrayList<Patients> pList2 = new ArrayList<Patients>();

                                Patients p;
                                String[] dataP;

                                try (Scanner sc = new Scanner(new File("patients.csv"))) {
                                    while (sc.hasNextLine()) {
                                        dataP = sc.nextLine().split(";");
                                        if (dataP.length == 11) { // 11 attributes

                                            p = new Patients(
                                                    Integer.parseInt(dataP[0]),
                                                    dataP[1],
                                                    dataP[2],
                                                    dataP[3],
                                                    dataP[4],
                                                    dataP[5],
                                                    Integer.parseInt(dataP[6]),
                                                    dataP[7],
                                                    dataP[8],
                                                    Integer.parseInt(dataP[9]),
                                                    Integer.parseInt(dataP[10]));
                                            pList2.add(p);

                                        }
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error to read file");
                                }
                                for (Patients p2 : pList2) {
                                    System.out.println(p2);
                                }
                                break;

                            case 3: // Modify Patient
                                System.out.println("Enter patient name: ");
                                String patientName = scanner.next();

                                // Collect other information you want to modify
                                System.out.println("Enter new blood group: ");
                                String newBloodGroup = scanner.next();
                                System.out.println("Enter new disease: ");
                                String newDisease = scanner.next();
                                System.out.println("Enter new weight: ");
                                int newWeight = scanner.nextInt();
                                System.out.println("Enter new height: ");
                                int newHeight = scanner.nextInt();

                                // Call the method to modify patient attributes
                                Patients.modifyPatientByName(patientName, newBloodGroup, newDisease, newWeight,
                                        newHeight);
                                break;

                            case 4: // Delete Patient
                                System.out.println("Enter patient name to delete: ");
                                String patientNameToDelete = scanner.next();

                                // Call the method to remove a patient by name
                                boolean deletionResult = Patients.removePatientByName(patientNameToDelete);
                                if (deletionResult) {
                                    System.out.println("Patient successfully deleted.");
                                } else {
                                    System.out.println("Patient not found.");
                                }

                            case 5: // Back
                                back = true;
                                break;

                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    }
                    break;

                case 2:
                    // DIETITIANS
                    System.out.println("Dietitians");

                    boolean back2 = false;
                    while (!back2) {
                        System.out.println("1. Add Dietitian");
                        System.out.println("2. View Dietitians");
                        System.out.println("3. Modify Dietitian");
                        System.out.println("4. Delete Dietitian");
                        System.out.println("5. Back");
                        int optionDietitians = scanner.nextInt();

                        switch (optionDietitians) {
                            case 1: // Add Dietitian
                                ArrayList<Dietitian> dList = Dietitian.dietitianList(scanner);

                                File f2 = new File("dietitians.csv");
                                try (FileWriter fw = new FileWriter(f2, true)) {
                                    for (Dietitian d : dList) {
                                        fw.write(d.toCSV());
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error");
                                }

                                break;

                            case 2: // View Dietitians
                                ArrayList<Dietitian> dList2 = new ArrayList<Dietitian>();

                                Dietitian d;
                                String[] dataD;

                                try (Scanner sc = new Scanner(new File("dietitians.csv"))) {
                                    while (sc.hasNextLine()) {
                                        dataD = sc.nextLine().split(";");

                                        if (dataD.length == 8) {

                                            d = new Dietitian(
                                                    Integer.parseInt(dataD[0]),
                                                    dataD[1],
                                                    dataD[2],
                                                    dataD[3],
                                                    dataD[4],
                                                    dataD[5],
                                                    Integer.parseInt(dataD[6]),
                                                    dataD[7]);
                                            dList2.add(d);

                                        }
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error to read the file CSV");
                                }

                                for (Dietitian d2 : dList2) {
                                    System.out.println(d2);
                                }
                                break;

                            case 3: // Modify Dietitian
                                System.out.println("Enter dietitian name: ");
                                String dietitianName = scanner.next();

                                // Collect other information you want to modify
                                System.out.println("Enter new speciality: ");
                                String newSpeciality = scanner.next();

                                // Call the method to modify dietitian attributes
                                Dietitian.modifyDietitianByName(dietitianName, newSpeciality);
                                break;

                            case 4: // Delete Dietitian
                                System.out.println("Enter dietitian name to delete: ");
                                String dietitianNameToDelete = scanner.next();

                                // Call the method to remove a dietitian by name
                                boolean deletionResult = Dietitian.removeDietitianByName(dietitianNameToDelete);
                                if (deletionResult) {
                                    System.out.println("Dietitian successfully deleted.");
                                } else {
                                    System.out.println("Dietitian not found.");
                                }

                            case 5: // Back
                                back2 = true;
                                break;

                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    }
                    break;

                case 3:
                    // DIET PLANS
                    System.out.println("Diet Plans");

                    boolean back3 = false;
                    while (!back3) {
                        System.out.println("1. Add Diet Plan");
                        System.out.println("2. View Diet Plans");
                        System.out.println("3. Modify Diet Plan");
                        System.out.println("4. Delete Diet Plan");
                        System.out.println("5. Back");
                        int optionDietPlans = scanner.nextInt();

                        switch (optionDietPlans) {
                            case 1: // Add Diet Plan
                                ArrayList<DietPlan> dpList = DietPlan.dietPlanList(scanner);

                                File f3 = new File("dietplans.csv");
                                try (FileWriter fw = new FileWriter(f3, true)) {
                                    for (DietPlan dp : dpList) {
                                        fw.write(dp.toCSV());
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error");
                                }

                                break;

                                case 2: // View Diet Plans
                                ArrayList<DietPlan> dpList2 = new ArrayList<DietPlan>();
                            
                                try (Scanner sc = new Scanner(new File("dietplans.csv"))) {
                                    while (sc.hasNextLine()) {
                                        String[] dataDP = sc.nextLine().split(";");
                                        if (dataDP.length == 9) {
                                            DietPlan dp = new DietPlan(
                                                    Integer.parseInt(dataDP[0]),
                                                    dataDP[1],
                                                    dataDP[2],
                                                    dataDP[3],
                                                    dataDP[4],
                                                    dataDP[5],
                                                    Integer.parseInt(dataDP[6]),
                                                    dataDP[7],
                                                    dataDP[8]);
                                            dpList2.add(dp);
                                        }
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error reading the CSV file");
                                }
                            
                                for (DietPlan dp2 : dpList2) {
                                    System.out.println(dp2);
                                }
                            
                                break;
                            

                            case 3: // Modify Diet Plan
                                System.out.println("Enter the ID of the diet plan you want to modify:");
                                int dietPlanIdToModify = scanner.nextInt();
                                scanner.nextLine();

                                // Collect other information you want to modify
                                System.out.println("Enter new diet plan name: ");
                                String newDietPlanName = scanner.next();
                                System.out.println("Enter new diet plan description: ");
                                String newDietPlanDescription = scanner.next();
                                System.out.println("Enter new diet plan type: ");
                                String newDietPlanType = scanner.next();
                                System.out.println("Enter new diet plan duration: ");
                                String newDietPlanDuration = scanner.next();
                                System.out.println("Enter new diet plan price: ");
                                String newDietPlanPrice = scanner.next();
                                System.out.println("Enter new diet plan calories: ");
                                int newDietPlanCalories = scanner.nextInt();
                                System.out.println("Enter new diet plan macronutrient: ");
                                String newDietPlanMacronutrient = scanner.next();
                                System.out.println("Enter new diet plan recommendations: ");
                                String newDietPlanRecommendations = scanner.next();

                                // Call the method to modify diet plan attributes
                                DietPlan.modifyDietPlan(dietPlanIdToModify, newDietPlanName, newDietPlanDescription,
                                        newDietPlanType, newDietPlanDuration, newDietPlanPrice, newDietPlanCalories,
                                        newDietPlanMacronutrient, newDietPlanRecommendations);
                                break;

                            case 4: // Delete Diet Plan

                                System.out.println("Enter diet plan ID to delete: ");
                                int dietPlanIdToDelete = scanner.nextInt();

                                // Call the method to remove a diet plan by ID
                                boolean deletionResult = DietPlan.removeDietPlanById(dietPlanIdToDelete);
                                if (deletionResult) {
                                    System.out.println("Diet plan successfully deleted.");
                                } else {
                                    System.out.println("Diet plan not found.");
                                }

                                break;
                            
                            case 5: // Back
                                back3 = true;
                                break;

                            default:
                                break;
                        }
                    }
                    break;

                case 4:
                    // MEALS
                    System.out.println("Meals");

                    boolean back4 = false;
                    while (!back4) {
                        System.out.println("1. Add Meal");
                        System.out.println("2. View Meals");
                        System.out.println("3. Modify Meal");
                        System.out.println("4. Delete Meal");
                        System.out.println("5. Back");
                        int optionMeals = scanner.nextInt();

                        switch (optionMeals) {
                            case 1: // Add Meal
                                ArrayList<Meal> mList = Meal.mealsList(scanner);

                                File f4 = new File("meals.csv");
                                try (FileWriter fw = new FileWriter(f4, true)) {
                                    for (Meal m : mList) {
                                        fw.write(m.toCSV());
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error");
                                }

                                break;

                            case 2: // View Meals
                                ArrayList<Meal> mList2 = new ArrayList<Meal>();

                                Meal m;
                                String[] dataM;

                                try (Scanner sc = new Scanner(new File("meals.csv"))) {
                                    while (sc.hasNextLine()) {
                                        dataM = sc.nextLine().split(";");
                                        if (dataM.length == 7) {

                                            m = new Meal(
                                                    Integer.parseInt(dataM[0]),
                                                    dataM[1],
                                                    dataM[2],
                                                    dataM[3],
                                                    Integer.parseInt(dataM[4]),
                                                    dataM[5],
                                                    dataM[6]);
                                            mList2.add(m);

                                        }
                                    }
                                } catch (IOException e) {
                                    System.out.println("Error to read the file CSV");
                                }

                                for (Meal m2 : mList2) {
                                    System.out.println(m2);
                                }
                                break;

                            case 3: // Modify Meal
                                System.out.println("Enter the ID of the meal you want to modify:");
                                int mealIdToModify = scanner.nextInt();
                                scanner.nextLine();

                                // Collect other information you want to modify
                                System.out.println("Enter new meal name: ");
                                String newMealName = scanner.next();
                                System.out.println("Enter new meal description: ");
                                String newMealDescription = scanner.next();
                                System.out.println("Enter new meal type: ");
                                String newMealType = scanner.next();
                                System.out.println("Enter new meal calories: ");
                                int newMealCalories = scanner.nextInt();
                                System.out.println("Enter new meal macronutrient: ");
                                String newMealMacronut = scanner.next();
                                System.out.println("Enter new meal time of day: ");
                                String newMealTimeOfDay = scanner.next();

                                // Call the method to modify meal attributes
                                Meal.modifyMeal(mealIdToModify, newMealName, newMealDescription, newMealType, newMealCalories, newMealMacronut, newMealTimeOfDay);
                                break;

                            case 4: // Delete Meal
                                System.out.println("Enter meal ID to delete: ");
                                int mealIdToDelete = scanner.nextInt();

                                // Call the method to remove a meal by ID
                                boolean deletionResult = Meal.removeMeal(mealIdToDelete);
                                if (deletionResult) {
                                    System.out.println("Meal successfully deleted.");
                                } else {
                                    System.out.println("Meal not found.");
                                }

                                break;

                            case 5:
                                System.out.println("Exit");
                                back4 = true;
                                break;

                            default:
                                System.out.println("Invalid option");
                                break;

                        }

                
                    }
                    break;
                
                case 5:
                    System.out.println("Gracias por elegirnos. Hasta pronto!");
                    salir = true;
                    break;

                default:
                    System.out.println("Invalid option");
                    break;

            }
        }
    }
}
