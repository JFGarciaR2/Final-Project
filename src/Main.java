import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
                        
                            default:
                                break;
                        }
                    }
                    
                    
                    //Write to CSV
                    System.out.println("Dietitians");

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

                case 3:
                    System.out.println("Diet Plans");
                    break;

                case 4:
                    System.out.println("Meals");
                    break;

                case 5:
                    /*System.out.println("Other Options");
                    boolean back = false;
                    System.out.println("Please enter your option: ");
                    while(!back){
                        System.out.println("1. View Patients");
                        System.out.println("2. View Dietitians");
                        System.out.println("3. View Diet Plans");
                        System.out.println("4. View Meals");
                        System.out.println("5. Other Options");
                        System.out.println("6. Exit");

                        int option2 = scanner.nextInt();
                        switch (option2) {
                            case 1:
                                System.out.println("View Patients");

                                //Read from CSV
                                
                                

                            case 2:
                                System.out.println("View Dietitians");

                                //Read from CSV
                                
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

                            case 3:
                                System.out.println("Viwe Diet Plans");
                                break;
                            case 4:
                                System.out.println("View Meals");
                                break;
                            case 5:
                                System.out.println("Other Options");
                                break;
                            case 6:
                                System.out.println("Exit");
                                back = true;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;
                    }
                */        
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
