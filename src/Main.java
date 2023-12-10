import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while(!salir){
            System.out.println("Welcome to the Diet Plan App");
            System.out.println("Please enter your option: ");

            System.out.println("1. Patients");
            System.out.println("2. Dietitians");
            System.out.println("3. Diet Plans");
            System.out.println("4. Meals");
            System.out.println("5. Other Options");
            System.out.println("6. Exit");
            
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    //PATIENTS
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
                            case 1: //Add Patient
                                ArrayList<Patients> pList = Patients.patientsList(scanner);

                                File f = new File("patients.csv");
                                try (FileWriter fw = new FileWriter(f,true)) {
                                    for (Patients p : pList) {
                                    fw.write(p.toCSV());
                                        }
                                } catch (IOException e) {
                                    System.out.println("Error");
                                } 
                                
                                break;
                            
                            case 2: //View Patients

                                ArrayList<Patients> pList2 = new ArrayList<Patients>();

                                Patients p;
                                String[] dataP;

                                try (Scanner sc = new Scanner(new File("patients.csv"))){
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
                                            Integer.parseInt(dataP[10])
                                            );
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
                                

                            case 3: //Modify Patient
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
                                Patients.modifyPatientByName(patientName, newBloodGroup, newDisease, newWeight, newHeight);
                                break;
                            
                            case 4: //Delete Patient
                                System.out.println("Enter patient name to delete: ");
                                String patientNameToDelete = scanner.next();

                                // Call the method to remove a patient by name
                                boolean deletionResult = Patients.removePatientByName(patientNameToDelete);
                                if (deletionResult) {
                                    System.out.println("Patient successfully deleted.");
                                } else {
                                    System.out.println("Patient not found.");
                                }
                            
                            case 5: //Back
                                back = true;
                                break;

                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    }
                    break;

                case 2:
                //DIETITIANS
                    System.out.println("Dietitians");

                    boolean back2 = false;
                    while(!back2){
                        System.out.println("1. Add Dietitian");
                        System.out.println("2. View Dietitians");
                        System.out.println("3. Modify Dietitian");
                        System.out.println("4. Delete Dietitian");
                        System.out.println("5. Back");
                        int optionDietitians = scanner.nextInt();

                        switch (optionDietitians) {
                            case 1: //Add Dietitian
                                ArrayList<Dietitian> dList = Dietitian.dietitianList(scanner);

                                File f2 = new File("dietitians.csv");
                                try (FileWriter fw = new FileWriter(f2,true)) {
                                    for (Dietitian d : dList) {
                                    fw.write(d.toCSV());
                                        }
                                } catch (IOException e) {
                                    System.out.println("Error");
                                }

                                break;
                            
                            case 2: //View Dietitians
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
                                            dataD[7]
                                            );
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
                        
                            case 3: //Modify Dietitian
                                System.out.println("Enter dietitian name: ");
                                String dietitianName = scanner.next();
                
                                // Collect other information you want to modify
                                System.out.println("Enter new speciality: ");
                                String newSpeciality = scanner.next();
                
                                // Call the method to modify dietitian attributes
                                Dietitian.modifyDietitianByName(dietitianName, newSpeciality);
                                break;
                            
                            case 4: //Delete Dietitian
                                System.out.println("Enter dietitian name to delete: ");
                                String dietitianNameToDelete = scanner.next();

                                // Call the method to remove a dietitian by name
                                boolean deletionResult = Dietitian.removeDietitianByName(dietitianNameToDelete);
                                if (deletionResult) {
                                    System.out.println("Dietitian successfully deleted.");
                                } else {
                                    System.out.println("Dietitian not found.");
                                }
                            
                            case 5: //Back
                                back2 = true;
                                break;

                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    }
                    break;
                    
                case 3:
                    //DIET PLANS
                    System.out.println("Diet Plans");

                    boolean back3 = false;
                    while(!back3){
                        System.out.println("1. Add Diet Plan");
                        System.out.println("2. View Diet Plans");
                        System.out.println("3. Modify Diet Plan");
                        System.out.println("4. Delete Diet Plan");
                        System.out.println("5. Back");
                        int optionDietPlans = scanner.nextInt();

                        switch (optionDietPlans) {
                            case 1: //Add Diet Plan
                                ArrayList<DietPlan> dpList = DietPlan.dietPlanList(scanner);

                                File f3 = new File("dietplans.csv");
                                try (FileWriter fw = new FileWriter(f3,true)) {
                                    for (DietPlan dp : dpList) {
                                    fw.write(dp.toCSV());
                                        }
                                } catch (IOException e) {
                                    System.out.println("Error");
                                }
                            
                                break;
                            
                            case 2: //View Diet Plans
                                
                                ArrayList<DietPlan> dpList2 = new ArrayList<DietPlan>();

                                DietPlan dp;
                                String[] dataDP;

                                try (Scanner sc = new Scanner(new File("dietplans.csv"))) {
                                    while (sc.hasNextLine()) {
                                        dataDP = sc.nextLine().split(";");

                                        if (dataDP.length == 12) {

                                            dp = new DietPlan(
                                            Integer.parseInt(dataDP[0]),
                                            dataDP[1],
                                            dataDP[2],
                                            dataDP[3],
                                            dataDP[4],
                                            dataDP[5],
                                            Integer.parseInt(dataDP[6]),
                                            dataDP[7],
                                            dataDP[8],
                                            dataDP[9],
                                            dataDP[10],
                                            dataDP[11]
                                            );
                                            dpList2.add(dp);

                                        }
                                    } 
                                } catch (IOException e) {
                                    System.out.println("Error to read the file CSV");
                                }

                                for (DietPlan dp2 : dpList2) {
                                    System.out.println(dp2);
                                }
                                break;
                        
                            case 3: //Modify Diet Plan
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
                                System.out.println("Enter new diet plan macronutrient: ");
                                
                                // Call the method to modify diet plan attributes
                                DietPlan.modifyDietPlan(dietPlanIdToModify, newDietPlanName, newDietPlanDescription, newDietPlanType, newDietPlanDuration, newDietPlanPrice, newDietPlanCalories, newDietPlanMacronutrient, newDietPlanRecommendations, dpList, scanner);                                break;

                            default:
                                break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Meals");
                    break;

                case 5:
                    System.out.println("Other Options");
                    break;  
                case 6:
                    System.out.println("Exit");
                    salir = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            }

    }
}
